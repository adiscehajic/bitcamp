package exercises;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {

		// This program merges two inputed arrays into third array
		// Declaration of two arrays with elements
		int[] firstArray = {1, 2, 3, 4, 5, 6};
		int[] secondArray = {6, 7, 8, 9, 10, 12, 13};
		
		// Declaration of an empty array
		int[] thirdArray = new int[firstArray.length + secondArray.length];
		
		// Merging first and second array with third array
		for (int i = 0; i < thirdArray.length; i++) {
			for (int j = 0; j < firstArray.length; j++) {
				if (j == i) {
					thirdArray[i] = firstArray[j];
				}
			}
			for (int z = 0; z < secondArray.length; z++) {
				if((z + firstArray.length) == i){
					thirdArray[i] = secondArray[z];
				}
			}		
		}
		// Printing the result
		System.out.println(Arrays.toString(thirdArray));
		
	}

}
