package exercises;

import java.util.Arrays;

public class Task2_Reading2DArrayFromFIle {

	public static void main(String[] args) {

		// Declaration of a path of a file that contains array elements
		String filename = "src/exercises/matrix.txt";

		// Calling method get2DArrayFromFile that will print array in accordance
		// with file elements
		get2DArrayFromFile(filename);

	}

	/**
	 * Prints 2D array from selected file that contains number of rows and
	 * columns and all elements.
	 * 
	 * @param filename
	 *            - File that contains information about 2D array.
	 */
	public static void get2DArrayFromFile(String filename) {

		// Starting to read from selected file
		TextIO.readFile(filename);

		// Declaration of variables that represents rows and columns
		int rows = 0;
		int columns = 0;

		// Getting first line from file that contains number of rows and columns
		String[] firstString = TextIO.getln().split(" ");
		rows = Integer.parseInt(firstString[0]);
		columns = Integer.parseInt(firstString[1]);

		// Declaration of 2D array with length of rows and columns from a file
		int[][] array2D = new int[rows][columns];

		// Declaration of a counter that will go from one row to next one
		int counter = 0;

		// Going trough file
		while (!TextIO.eof()) {

			// First loop takes one line of string and splitting it into
			// elements
			for (int i = counter; i < array2D.length; i++) {
				String[] secondString = TextIO.getlnString().split(" ");
				System.out.println(Arrays.toString(secondString));

				// Second loop puts elements of string into 2D array elements
				for (int j = 0; j < array2D[i].length; j++) {
					array2D[i][j] = Integer.parseInt(secondString[j]);
				}
				counter++;
			}
		}

		// Calling method print2DArray that will print 2D array with elements
		// from a file
		ArrayMethods.print2DArray(array2D);

		// Ending reading from a file
		TextIO.readStandardInput();

	}

}
