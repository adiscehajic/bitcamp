package ba.bitcamp.w11d03_NetworkingPart2.exercises1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

	public static void main(String[] args) {

		try {
			System.out.println("Server started.");
			ServerSocket server = new ServerSocket(9999);
			System.out.println("Listening for a client...");
			String fileText = "";
			
			while (true) {
				Socket client = server.accept();
				System.out.println("Client found.");
				System.out.println(client.getInetAddress().getHostAddress());

				BufferedReader reader = new BufferedReader(new FileReader(
						new File("src/server.html")));
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

				while (reader.ready()) {
					fileText += reader.readLine() + "\n";
				}

				BufferedReader fileReader = new BufferedReader(new FileReader(
						new File("src/statistics.txt")));

				while (fileReader.ready()) {
					fileText += fileReader.readLine() + "<br>\n";
				}
				fileText += "</p></body></html>";


				writer.write(fileText);
				//writer.newLine();
				writer.close();

				client.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
