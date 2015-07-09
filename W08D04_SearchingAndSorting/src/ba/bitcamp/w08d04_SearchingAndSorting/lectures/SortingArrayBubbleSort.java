package ba.bitcamp.w08d04_SearchingAndSorting.lectures;

import java.util.Arrays;
import java.util.Random;

public class SortingArrayBubbleSort {

	public static void main(String[] args) {

		int arraySize = 30;
		int[] array = new int[arraySize];

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(3 * arraySize);
		}

		//System.out.println("Initial array: " + Arrays.toString(array));

		boolean isSorted = false;
				
		while(!isSorted) {
			isSorted = true;
			//for (int i = 0; i < array.length; i++) {
				
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
						isSorted = false;
					}
					
				}
		}

		System.out.println("\nSorted array: " + Arrays.toString(array));
		
	}
}
