package ba.bitcamp.w11D01_Networking.exercises.ringSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class RingSender {

	public static void main(String[] args) {

		// Recieve message
		ServerSocket server;
		try {
			server = new ServerSocket(2506);
			Socket fromNidal;
			fromNidal = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromNidal.getInputStream()));

			String message = reader.readLine();
			System.out.println("Message: " + message);

			// Send message
			Socket socket = new Socket("10.0.82.44", 1946);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));

			writer.write(message);
			writer.newLine();
			writer.flush();

			System.out.println("Message sent.");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
