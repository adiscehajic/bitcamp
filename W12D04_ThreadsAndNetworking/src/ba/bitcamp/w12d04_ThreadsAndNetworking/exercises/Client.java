package ba.bitcamp.w12d04_ThreadsAndNetworking.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			Socket client;
			while (true) {
				client = new Socket("10.0.82.98", 8000);

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				int counter = 0;

				String numbers = reader.readLine();
				System.out.println(numbers);
				int start = Integer.parseInt(numbers.split(" ")[0]);
				int end = Integer.parseInt(numbers.split(" ")[1]);

				System.out.println("[" + start + ", " + end + "]");

				for (int i = start; i < end; i++) {
					if (isPrimeEfficient(i)) {
						counter++;
					}
				}

				System.out.println(counter);

				writer.write(String.valueOf(counter));
				writer.newLine();
				writer.flush();
				writer.close();
			}
			//client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean isPrimeEfficient(int num) {
		if (num == 2) {
			return true;
		}
		
		if (num % 2 == 0) {
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
