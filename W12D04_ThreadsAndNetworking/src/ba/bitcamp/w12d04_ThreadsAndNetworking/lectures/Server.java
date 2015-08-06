package ba.bitcamp.w12d04_ThreadsAndNetworking.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

	private static LinkedBlockingQueue<Client> clients;
	private static LinkedBlockingQueue<Message> messages;
	private static ExecutorService pool = Executors.newFixedThreadPool(8);

	public static void main(String[] args) {
		clients = new LinkedBlockingQueue<Client>();
		messages = new LinkedBlockingQueue<Message>();
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Listener());
		pool.submit(new Sender());
		pool.submit(new Sender());
		pool.submit(new Sender());
		
		try {
			ServerSocket server = new ServerSocket(6815);
			Socket client;

			while (true) {
				client = server.accept();
				System.out.println("Connected: ");
				clients.add(new Client(client));

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class Listener implements Runnable {

		@Override
		public void run() {
			try {
				Client c = null;
				synchronized(clients){
				c = clients.take();
				clients.add(c);
				}
				BufferedReader reader = c.getReader();

				StringBuilder st = new StringBuilder();

				while (reader.ready()) {
					st.append(reader.readLine());
					Message message = new Message(c.getId(), st.toString());
					messages.add(message);
				}

				pool.execute(this);
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static class Sender implements Runnable {

		@Override
		public void run() {
			try {
				Message m = messages.take();
				Client[] clientArr = null;

				synchronized (clients) {
					clientArr = new Client[clients.size()];
					for (int i = 0; i < clientArr.length; i++) {
						clientArr[i] = clients.take();
						clients.add(clientArr[i]);
					}
				}

				for (int i = 0; i < clientArr.length; i++) {
					BufferedWriter writer = clientArr[i].getWriter();
					writer.write(m.getMessage());
					writer.flush();
				}
				pool.execute(this);
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}

		}

	}

}
