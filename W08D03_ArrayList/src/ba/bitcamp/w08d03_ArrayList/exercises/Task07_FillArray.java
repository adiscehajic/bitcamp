package ba.bitcamp.w08d03_ArrayList.exercises;

import java.util.Arrays;

public class Task07_FillArray {

	public static void main(String[] args) {

		System.out.println(Arrays.toString(fillArray(10, 3, 2, 6)));
		
	}

	public static int[] fillArray(int length, int number, int startIndex,
			int endIndex) {

		int[] array = new int[length];

		Arrays.fill(array, -1);

		Arrays.fill(array, startIndex, endIndex, number);

		return array;
	}

}
