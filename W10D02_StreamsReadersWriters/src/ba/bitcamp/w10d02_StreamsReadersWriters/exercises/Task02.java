package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Task02 {

	public static void main(String[] args) {

		char[] array = new char[26];

		int counter = 65;
		for (int i = 0; i < array.length; i++) {
			array[i] = (char) counter;
			counter++;
		}

		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int length = 10;
		int count = 0;

		while (count < array.length) {
			if ((count < array.length - 10) && count % 10 == 0) {
				pw.write(array, count, length);
				pw.flush();
			} else {
				length = array.length - count;
				pw.write(array, count, length);
				pw.flush();
			}
			count += 10;
		}
	}
}
