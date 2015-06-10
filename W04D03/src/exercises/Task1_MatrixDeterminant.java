package exercises;

import java.util.Scanner;

public class Task1_MatrixDeterminant {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of a 2d array
		int[][] array2D = new int[3][3];

		// Calling method input2DArrayElements which enables inputing of array
		// elements
		ArrayMethods.input2DArrayElements(array2D);

		// Calling method print2DArray that prints inputed array
		ArrayMethods.print2DArray(array2D);

		// Calling method isSingular that returns true if the matrix is singular
		// and false if it is not
		System.out.println("Is the inputed 2D array singular? " + ArrayMethods.isSingular(array2D));

		in.close();

	}

}
