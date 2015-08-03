package ba.bitcamp.w12d01_Recapitulation.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream is = new FileInputStream("text.txt");

			byte[] buffer = new byte[1024];
			
			while (is.available() > 0) {
				is.read(buffer);
				for (byte b : buffer) {
					System.out.print(b + " ");
				}
				buffer = new byte[1024];
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
