package exercises;

import java.util.Scanner;

public class TaskVarming_SumOfElements {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of a 2D array
		int[][] array2D = new int[3][3];

		// Calling method input2DArrayElements which enables inputing of array
		// elements
		ArrayMethods.input2DArrayElements(array2D);

		// Calling method print2DArray that prints inputed array
		ArrayMethods.print2DArray(array2D);

		// Calling method get2DArraySum that calculates sum of all elements of
		// an array and printing result
		System.out.println("Sum of all elements of an array is: "
				+ ArrayMethods.get2DArraySum(array2D));

		in.close();

	}

}
