package ba.bitcamp.w11D02_Networking.exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;

public class ClientRecievingFile {

	public static void main(String[] args) {
		
		Socket socket;
		try {
			socket = new Socket("10.0.82.98", 7777);

			FileOutputStream fileReader = new FileOutputStream("text.txt");
			InputStream is = socket.getInputStream();
			
			byte[] data = new byte[1024];
			int bytesRead;
			
			while ((bytesRead = is.read(data, 0, data.length)) > 0) {
				fileReader.write(data, 0, bytesRead);
			}
			fileReader.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
