package ba.bitcamp.w11d03_NetworkingPart2.exercises1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("10.0.82.40", 1111);
			
			InputStream in = client.getInputStream();
			FileOutputStream fileOutput = new FileOutputStream(new File("src/received.jpeg"));
			
			byte[] array = new byte[1024];
			int readBytes;

			while ((readBytes = in.read(array, 0, array.length)) > 0) {
				fileOutput.write(array, 0, readBytes);
			}

			in.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
