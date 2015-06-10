package exercises;

public class Task3_Minesweeper {

	public static void main(String[] args) {

		int[][] array2D = new int[4][4];

		ArrayMethods.input2DArrayElements(array2D);

		ArrayMethods.print2DArray(array2D);

		int counter = 1;

		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				if (array2D[i][j] == -1) {
					if (i - 1 < 0 && j - 1 < 0) {
						array2D[i][j + 1] = counter;
						array2D[i + 1][j] = counter;
						array2D[i + 1][j + 1] = counter;
						array2D[i][j - 1] = counter;
						array2D[i + 1][j - 1] = counter;
					} else if (i == 0 && j == 0) {
						array2D[i][j + 1] = counter;
						array2D[i + 1][j + 1] = counter;
						array2D[i + 1][j] = counter;

					} else {
						array2D[i - 1][j - 1] = counter;
						array2D[i - 1][j] = counter;
						array2D[i - 1][j + 1] = counter;
						array2D[i][j - 1] = counter;
						array2D[i][j + 1] = counter;
						array2D[i + 1][j - 1] = counter;
						array2D[i + 1][j] = counter;
						array2D[i + 1][j + 1] = counter;
					}
				}
			}
		}

		System.out.println();
		ArrayMethods.print2DArray(array2D);

	}

}
