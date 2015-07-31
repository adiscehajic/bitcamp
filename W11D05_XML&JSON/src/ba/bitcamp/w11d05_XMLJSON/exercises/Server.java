package ba.bitcamp.w11d05_XMLJSON.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

	public static String ipAdd;
	public static ArrayList<String> list;

	public static void main(String[] args) {

		list = new ArrayList<String>();
		try {
			ServerSocket server = new ServerSocket(8000);

			while (true) {
				Socket client = server.accept();

				ClientThread ct = new ClientThread(client);
				Thread t = new Thread(ct);

				list.add(client.getInetAddress().getHostAddress());
				
				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public static class ClientThread implements Runnable {

		private Socket client;
		public String ip;

		public ClientThread(Socket client) {
			this.client = client;
			this.ip = client.getInetAddress().getHostAddress();
		}

		public void run() {
			try {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				ServerGUI sg = new ServerGUI();

				while (true) {
					String s = reader.readLine();

					ServerGUI.draw(s, ip);
					System.out.println(ip);
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}
