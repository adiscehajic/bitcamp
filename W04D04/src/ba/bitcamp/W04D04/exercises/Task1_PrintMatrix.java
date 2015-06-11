package ba.bitcamp.W04D04.exercises;

public class Task1_PrintMatrix {

	public static void main(String[] args) {

		// Declaration of rows and columns of the matrix
		int num1 = 5;
		int num2 = 4;

		// Declaration of a direction of printing matrix elements
		boolean direction = true;

		// Declaration and printing of the matrix
		int[][] matrix = printRandomMatrix(num1, num2);

		// Calling method matrixDirection that will print inputed matrix
		// depending on a inputed direction
		System.out.println();
		matrixDirection(matrix, direction);

	}

	/**
	 * Prints matrix with random values of elements from 5 to 10.
	 * 
	 * @param matrix
	 *            Declared matrix.
	 * @param num1
	 *            Number of rows.
	 * @param num2
	 *            Number of columns.
	 */
	public static int[][] printRandomMatrix(int num1, int num2) {

		int[][] matrix = new int[num1][num2];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 6 + 5);
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}

		return matrix;
	}

	/**
	 * Prints matrix on two ways. If direction is false prints matrix normally
	 * and if it is true prints it backward (first element becomes last and last
	 * becomes first).
	 * 
	 * @param matrix
	 *            Inputed matrix
	 * @param direction
	 *            Boolean expression of direction of printing matrix.
	 */
	public static void matrixDirection(int[][] matrix, boolean direction) {

		// Checking expression direction. If direction is false prints matrix
		// elements from a beginning
		if (direction == false) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.printf("%3d", matrix[i][j]);
				}
				System.out.println();
			}
			// If direction is true prints matrix elements from the end
		} else {
			for (int i = matrix.length - 1; i >= 0; i--) {
				for (int j = matrix[i].length - 1; j >= 0; j--) {
					System.out.printf("%3d", matrix[i][j]);
				}
				System.out.println();
			}
		}

	}

}
