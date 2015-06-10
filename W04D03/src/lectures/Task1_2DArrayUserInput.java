package lectures;

import java.util.Scanner;

public class Task1_2DArrayUserInput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of the number of rows and columns of an array
		System.out.print("Please insert number of rows of an 2Darray: ");
		int arrayRows = in.nextInt();
		System.out.print("Please insert number of columns of an 2Darray: ");
		int arrayColumns = in.nextInt();

		// Declaration of an 2D array
		int[][] array = new int[arrayRows][arrayColumns];

		// Calling method inputElements that will input elements into an array
		MatrixHelper.fillMatrix(array);;
		
		// Calling method print2DArray that will print all inputed elements
		System.out.println("You have inputed these elements:");
		MatrixHelper.print2DArray(array);
		
		in.close();
		
	}


}
