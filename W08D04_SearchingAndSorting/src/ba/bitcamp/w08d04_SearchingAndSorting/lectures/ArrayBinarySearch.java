package ba.bitcamp.w08d04_SearchingAndSorting.lectures;

import java.util.Arrays;
import java.util.Random;

public class ArrayBinarySearch {

	public static void main(String[] args) {

		int arraySize = 30;
		int[] array = new int[arraySize];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3 * arraySize);
		}
		System.out.println(Arrays.toString(array));

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		System.out.println(binarySearch(array, 25));

	}

	public static int binarySearch(int[] array, int element) {

		int min = 0;
		int max = array.length - 1;

		while (min <= max) {
			int middle = (min + max) / 2;

			if (element == array[middle]) {
				return middle;
			} else if (element > array[middle]) {
				min = middle + 1;
			} else {
				max = middle - 1;
			}
		}
		return -1;
	}

}
