package ba.bitcamp.w11d03_NetworkingPart2.exercises1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class Server {

	public static void main(String[] args) {

		ServerSocket server;
		try {
			System.out.println("Server started.");
			server = new ServerSocket(6666);
			System.out.println("Listening for a client...");
			Socket client = server.accept();
			System.out.println("Client found.");
			System.out.println(client.getInetAddress().getHostAddress());

			String address = client.getInetAddress().getHostAddress()
					+ " " + Calendar.getInstance().getTime().toString();

			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
					"src/statistics.txt"), true));
			writer.write(address);
			writer.newLine();
			writer.flush();
			
			
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
