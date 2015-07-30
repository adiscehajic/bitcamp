package ba.bitcamp.w11d04_Threads.exercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static void main(String[] args) {
		
		Socket client;
		try {
			client = new Socket("10.0.82.27", 7777);

			InputStream in = client.getInputStream();
			FileOutputStream fileOutput = new FileOutputStream(new File("src/received.jpeg"));
			
			byte[] array = new byte[1024];
			int readBytes;

			while ((readBytes = in.read(array, 0, array.length)) > 0) {
				fileOutput.write(array, 0, readBytes);
			}

			in.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
