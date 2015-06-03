import java.util.Arrays;
import java.util.Scanner;

public class Task6_NumSearchArray {

	public static void main(String[] args) {

		// This program calculates if the inputed number is in the inputed array
		Scanner in = new Scanner(System.in);

		// Declaring the length of an array
		System.out.println("Input lenght of an array: ");
		int arrLength = in.nextInt();
		
		// Declaring the array
		int[] arr = new int[arrLength];

		System.out.println("Input elements of a array!");

		// Inputing elements into an array
		while (true) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Input element: ");
				arr[i] = in.nextInt();
			}
			break;
		}

		// Declaring of the element that user wants to check
		System.out.print("Input number that you want to check: ");
		int num = in.nextInt();

		System.out.println(Arrays.toString(arr));

		int counter = 0;

		// Checking if the inputed number is in the array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				counter++;
			}
		}

		// Printing the result
		if (counter > 0) {
			System.out.printf("Number %d is in the array!", num);
		} else {
			System.out.printf("Number %d is not in the array!", num);
		}
		in.close();
	}

}
