package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Task01 {

	public static void main(String[] args) {
		PrintWriter pw = null;
		PrintWriter pw1 = null;

		try {
			pw = new PrintWriter(new OutputStreamWriter(System.out));
			pw1 = new PrintWriter(new File("task01.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int counter = 1;
		while (counter <= 100) {
			pw.println(counter);
			pw1.println(counter);
			if (counter % 2 == 0) {
				pw.println("string");
				pw1.println("string");
			}
			counter++;
			pw.flush();
			pw1.flush();
		}
	}

}
