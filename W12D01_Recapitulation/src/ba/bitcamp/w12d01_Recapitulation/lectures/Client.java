package ba.bitcamp.w12d01_Recapitulation.lectures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static final String HOST = "10.0.82.113";
	public static final int PORT = 7321;

	public static void main(String[] args) {

		try {
			Socket client = new Socket(HOST, PORT);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			Scanner input = new Scanner(System.in);
			
			boolean end = false;
			
			while (!end) {

				System.out.println("Insert message: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();

				System.out.println(reader.readLine());
			}
			
			input.close();
			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
