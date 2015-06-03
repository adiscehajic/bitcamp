package exercises;

import java.util.Arrays;

public class IncreasingArray {

	public static void main(String[] args) {

		// This program merges the values from a first array into another double
		// sized array that is empty
		
		// Declaration of first array
		int[] myArray = { 5, 6, 15, 45, 15 };

		// Declaration of second empty array
		int[] increasedArray = new int[myArray.length * 2];

		// Merging first array with second array
		for (int i = 0; i < increasedArray.length; i++) {
			for (int j = 0; j < myArray.length; j++) {
				if (i == j) {
					increasedArray[i] = myArray[j];
				}
			}
		}
		
		// Printing second array
		System.out.println("Increased array is: ");
		System.out.println(Arrays.toString(increasedArray));
	}

}
