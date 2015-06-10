package lectures;

import java.util.Scanner;

public class Task2_ColumnArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaration of the number of rows and columns of an array
		System.out.print("Please insert number of rows of an 2D array: ");
		int arrayRows = in.nextInt();
		System.out.print("Please insert number of columns of an 2D array: ");
		int arrayColumns = in.nextInt();

		// Declaration of an 2D array
		int[][] array = new int[arrayRows][arrayColumns];

		// Calling method fillMatrix that enables user to input values of
		// elements of a 2D array
		MatrixHelper.fillMatrix(array);

		// Calling method print2DArray that will print inputed value of a 2D
		// array
		MatrixHelper.print2DArray(array);

		// 
		while (true) {
			try {
				// Inputing number of a column which elements we want to see
				System.out
						.println("Input number of a column which elements you want to see: ");
				int column = in.nextInt();

				// Calling method columnArray that prints all elements of a
				// inputed column
				MatrixHelper.columnArray(array, column);
				break;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out
						.printf("Inputed index does not exist please input column from 0 to %d!\n",
								arrayColumns -1);
				in.nextLine();
			}
		}

		in.close();

	}

}
