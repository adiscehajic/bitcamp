package lectures;

public class Main {

	public static void main(String[] args) {
	
		int[][] funnyMatrix = new int[3][];
		
		// Prints matrix which row lengths are different
		for (int i = 0; i < funnyMatrix.length; i++) {
			funnyMatrix[i] = new int[(int) (i+(Math.random() * 9 + 1))];
		}
		
		MatrixHelper.print2DArray(funnyMatrix);
	}

}
