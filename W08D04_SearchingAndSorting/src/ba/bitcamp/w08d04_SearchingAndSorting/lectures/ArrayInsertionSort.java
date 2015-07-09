package ba.bitcamp.w08d04_SearchingAndSorting.lectures;

import java.util.Arrays;
import java.util.Random;

public class ArrayInsertionSort {

	public static void main(String[] args) {

		int arraySize = 30;
		int[] array = new int[arraySize];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3 * arraySize);
		}
		System.out.println(Arrays.toString(array));

		insertionSort(array);
	
		System.out.println(Arrays.toString(array));

	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int location = i - 1;

			while (location >= 0 && temp < array[location]) {
				array[location + 1] = array[location];
				location--;
			}
			array[location + 1] = temp;
		}

	}

}
