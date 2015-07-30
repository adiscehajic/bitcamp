package ba.bitcamp.w11d04_Threads.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(7777);

			while (true) {
				Socket client = server.accept();

				Thread t = new Thread(new ClientThread(client));
				t.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class ClientThread implements Runnable {

		private Socket client;

		public ClientThread(Socket client) {
			this.client = client;
		}

		public void run() {
			try {
				OutputStream os = client.getOutputStream();
				FileInputStream fileInput = new FileInputStream(new File(
						"src/output.jpeg"));

				byte[] array = new byte[1024];
				int readBytes;

				while ((readBytes = fileInput.read(array, 0, array.length)) > 0) {
					os.write(array, 0, readBytes);
				}

				fileInput.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
	}

}
