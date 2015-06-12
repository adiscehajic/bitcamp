public class MatrixHelper {

	
	public static void printMatrix(String[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%3s ", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void printTicTacToeMatrix(String[][] matrix) {
	
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j+=2) {
				matrix[i][j] = "|";
			}
		}
		
		for (int i = 0; i < matrix.length; i += 2) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = "-";
			}
		}
		
		int counter = 1;
		
		for (int i = 1; i < matrix.length; i+=2) {
			for (int j = 1; j < matrix[i].length; j+=2) {
				matrix[i][j] = String.valueOf(counter);
				counter++;
			}
		}
	}
	
	
}
