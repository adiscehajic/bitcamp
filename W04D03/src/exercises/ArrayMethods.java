package exercises;

import java.util.Scanner;

public class ArrayMethods {

	/**
	 * Prints 2D array into console
	 * @param array - 2D array
	 */
	public static void print2DArray(int[][] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d", array[i][j]);
			}
			System.out.println();
		}
		
	}
	
	/**
	 * Enables user to input elements into a 2D array
	 * @param array - 2D array
	 */
	public static void input2DArrayElements(int[][] array){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.printf("Input element in position %d,%d: ", i, j);
				array[i][j] = in.nextInt();
			}
		}

	}
	
	/**
	 * Calculates sum of all elements of an 2D array
	 * @param array - 2D array which elements we want to sum
	 * @return Sum of all elements of 2D array
	 */
	public static int get2DArraySum(int[][] array){
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		
		return sum;
	}
	
	
	/**
	 * Calculates the determinant value of the given matrix input elements and
	 * outputs if the matrix is singular
	 * 
	 * @param array - 2D array
	 * @return If the matrix is singular true and if it is not false
	 */
	public static boolean isSingular(int[][] array) {

		boolean isSingular = true;
		int determinant = 0;

		// Calculating the determinant of inputed 2D matrix
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				determinant = array[0][0] * ((array[1][1] * array[2][2]) - (array[2][1] * array[1][2]))
						- array[0][1] * ((array[1][0] * array[2][2]) - (array[2][0] * array[1][2]))
						+ array[0][2] * ((array[1][0] * array[2][1]) - (array[2][0] * array[1][1]));
				
				// Checking if the determinant is not 0, than matrix is not singular
				if (determinant != 0) {
					isSingular = false;
				}
			}
		}

		return isSingular;
	}
	
	
	/**
	 * Inputs random numbers 0 and -1 into a 2D array
	 * @param array - 2D array
	 */
	public static void inputRandom2DArrayElements(int[][] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) (Math.random() * (-2));
			}
		}

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
