package ba.bitcamp.w11D01_Networking.exercises.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			System.out.println("[SERVER] Server started...");
			ServerSocket server = new ServerSocket(7777);
			System.out.println("[SERVER] Server socked made.");

			System.out.println("[SERVER] Listening for a client...");
			Socket client = server.accept();
			System.out.println("[SERVER] Client found.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			System.out.println("[SYSTEM] I/O Operating available now.");

			writer.write("How you doin?");
			writer.newLine();
			writer.flush();

			System.out.println("[CLIENT] " + reader.readLine());

			Scanner input = new Scanner(System.in);
			// System.out.print("[SERVER] ");
			// writer.write(input.nextLine());
			// writer.newLine();
			// writer.flush();

			// System.out.println("END");
			//boolean end = false;
			
			FileInputStream fileReader = new FileInputStream("output.jpeg");
			OutputStream os = client.getOutputStream();

			byte[] data = new byte[1024];
			int bytesRead;
			
			while ((bytesRead = fileReader.read(data, 0, data.length)) > 0) {
				os.write(data, 0, bytesRead);
			}
			os.flush();

			
			// while (!end) {
			// System.out.print("[SERVER] ");
			// writer.write(input.nextLine());
			// writer.newLine();
			// writer.flush();
			//
			// System.out.println("[CLIENT] " + reader.readLine());
			// }

			input.close();
			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
