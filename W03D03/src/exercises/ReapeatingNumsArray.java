package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReapeatingNumsArray {

	public static void main(String[] args) {

		// This program checks how many times repeats the number that user asked
		// in the array
		Scanner in = new Scanner(System.in);

		// Inputing the array length
		System.out.println("Input number of elements of an array: ");
		int arrayLength = in.nextInt();

		// Declaration of an array
		int[] arr = new int[arrayLength];

		// Inputing numbers into an array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * arr.length + 1);
		}

		// Declaration of the counter that will count repeating
		int counter = 0;

		// Inputing the number that user wants to check
		System.out.println("Insert number from 1 to " + arrayLength + " that you want to check: ");
		int num = in.nextInt();

		// Printing an array
		System.out.println(Arrays.toString(arr));

		// Calculating how many times does the inputed number repeats
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				counter++;
			}
		}

		// Printing the result
		System.out.println("The number repeats " + counter + " times.");

		in.close();
	}

}
