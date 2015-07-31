package ba.bitcamp.w11d05_XMLJSON.exercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {

	public static BufferedWriter writer;
	
	public static void main(String[] args) {

		new ClientGUI();
		try {
			Socket client = new Socket("localhost", 8000);

			writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sendToServer(String message) {
		try {
			writer.write(message);
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
