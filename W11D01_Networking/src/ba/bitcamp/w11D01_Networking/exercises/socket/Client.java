package ba.bitcamp.w11D01_Networking.exercises.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("[CLIENT] Application started.");
			Socket socket = new Socket("localhost", 7777);
			System.out.println("[CLIENT] Connected to localhost.");

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			
			System.out.println("[SYSTEM] I/O Operating available now.");
			
			System.out.println("[SERVER] " + reader.readLine());
			writer.write("Now I'm fine.");
			writer.newLine();
			writer.flush();
			
			Scanner input = new Scanner(System.in);
//			System.out.println("[SERVER] " + reader.readLine());
//			System.out.print("[CLIENT] ");
//			writer.write(input.nextLine());
//			writer.flush();
			
			System.out.println("END");
			boolean end = false;
			
			while (!end) {
				System.out.println("[SERVER] " + reader.readLine());
				System.out.print("[CLIENT] ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
			
			input.close();
			reader.close();
			writer.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
