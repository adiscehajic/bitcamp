import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input size of Tic Tac Toe matrix: ");
		int size = in.nextInt();
		int length = size + size + 1;

		String[][] matrix = new String[length][length];

		MatrixHelper.printTicTacToeMatrix(matrix);

		MatrixHelper.printMatrix(matrix);

		String position = "";

	
		for (int i = 1; i < matrix.length; i += 2) {
			for (int j = 1; j < matrix[i].length; j += 2) {

					System.out.println("Input position of X: ");
					position = in.nextLine();

					if (position.equals(matrix[i][j])) {
						matrix[i][j] = "X";
						break;
					}
				

					System.out.println("Input position of O: ");
					position = in.nextLine();

					if (position.equals(matrix[i][j])) {
						matrix[i][j] = "O";
						break;
					}
				
			}
			MatrixHelper.printMatrix(matrix);
		}

		in.close();
	}
}
