package ba.bitcamp.w12d03_ParallelProcessing.exercises;

import java.util.Random;

public class Task02 {

	public static final int SIZE = 10000;
	private static int counter = 0;

	public static void main(String[] args) {

		int[][] array = new int[SIZE][SIZE];
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rand.nextInt(SIZE);				
			}
		}

		int number = rand.nextInt(SIZE);
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == number) {
					counter++;
				}				
			}
		}

		System.out.println("Number of repetitions is: " + counter);
		System.out.println("Searching time: " + (System.currentTimeMillis() - startTime));

	}
}
