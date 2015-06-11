package ba.bitcamp.W04D04.exercises;

import java.util.Arrays;

public class Task2_ReadingArrayFromFile {

	public static void main(String[] args) {

		String filename = "src/ba/bitcamp/W04D04/exercises/array.txt";

		fillArrayFromFile(filename);

	}

	/**
	 * Outputs an array of elements that are contained in file.	
	 * @param filename Location of a file
	 */
	public static void fillArrayFromFile(String filename) {

		// Starting to read from a file
		TextIO.readFile(filename);

		// Creating a counter that will count rows
		int counter = 0;

		// Counting the rows 
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}

		// Ending reading file
		TextIO.readStandardInput();

		// Starting to read from a file
		TextIO.readFile(filename);

		// If the file is empty prints message
		if(counter == 0) {
			System.out.println("File not found!");
			// If the counter is 1 prints array from one row
		} else if (counter == 1) {
			String str = TextIO.getln();

			String[] numString = str.split(" ");

			System.out.println(Arrays.toString(numString));

			// If the counter is higher than 1 prints elements from each row
		} else {
			String[] numString = new String[counter];

			for (int i = 0; i < numString.length; i++) {
				numString[i] = TextIO.getlnString();
			}

			System.out.println(Arrays.toString(numString));
		}

		TextIO.readStandardInput();

	}

}
