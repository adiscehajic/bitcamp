package exercises;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Task8_GetArray3Method {

	public static int[] getArray3(String filename) {

		TextIO.readFile("src/exercises/" + filename);

		int counter = 0;

		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}

		TextIO.readStandardInput();

		int a = 0;
		int c = 0;

		int[] arr = new int[counter];

		TextIO.readFile("src/exercises/" + filename);

		while (!TextIO.eof()) {
			if (a < counter) {
				c = Integer.parseInt(TextIO.getln());
				arr[a] = c;
				a++;
			}
		}

		TextIO.readStandardInput();

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getArray3("tekst")));

	}

}
