package ba.bitcamp.w12d02_ProgrammingWithThreads.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Task04Sensor {

	public static void main(String[] args) {

		Socket client;
		try {
			client = new Socket("localhost", 8888);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

			writer.write("4 Hello world");
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
