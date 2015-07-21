package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {

	private InputStream input;

	public MyBufferedReader(InputStream input) {
		super();
		this.input = input;
	}

	public int read() {
		try {
			return input.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public String readLine() {
		String s = "";
		try {
			do {
				s += (char) input.read();
				if (input.available() == 0) {
					return s;
				}
			} while (input.available() > 0);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int read(char[] array) {
		int counter = 0;
		try {
			//do {
			for (int i = 0; i < array.length; i++) {
				array[i] = (char) input.read();
				counter++;
			}
			//} while (input.read() != -1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	}

	public int read(char[] array, int index, int length) {
		int counter = 0;
		try {
				for (int i = index; i < (index + length); i++) {
					array[i] = (char) input.read();
					counter++;
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
	}

}
