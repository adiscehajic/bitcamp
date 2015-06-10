package lectures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixHelper {
	
	/**
	 * Inputs elements that user wants into an array
	 * @param array - 2D array
	 * @return 2D array with inputed elements
	 * @throws InputMismatchException If the inputed element is not a number
	 */
	public static void fillMatrix(int[][] array){
		@SuppressWarnings("resource")
		
		Scanner in = new Scanner(System.in);
		
		// Inputing elements into 2D array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			while (true){
			try{
				System.out.printf("Input element of %d row and %d column: ",
						i + 1, j + 1);
				array[i][j] = in.nextInt();
				break;
			} catch(InputMismatchException e){
				System.out.println("Wrong input! Please input again!");
				in.nextLine();
			}
			}
			}
		}
		
	}
	
	/**
	 * Print a 2d array to the console
	 * @param array - Inputed 2D array
	 */
	public static void print2DArray(int[][] array) {

		for(int[] row : array){
			for(int element : row){
				System.out.printf("%2d", element);
			}
			System.out.println();
		}
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.printf("%2d", array[i][j]);
//			}
//			System.out.println();
//		}
	}
	
	
	/**
	 * Prints all numbers from the inputed column
	 * @param array - Inputed 2D array
	 * @param column - Number of a column that we want to print
	 * @return
	 */
	public static void columnArray(int[][] array, int column) {
		
		int[] columnArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				columnArray[i] = array[i][column];
			}
		}
		
		System.out.printf("Elements that are in %d column are: \n", column);
		
		for (int i = 0; i < columnArray.length; i++) {
			System.out.printf("%2d", columnArray[i]);
		}
		
	}
	
	
}

