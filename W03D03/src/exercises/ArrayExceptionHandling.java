package exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExceptionHandling {

	public static void main(String[] args) {

		// This program outputs the array that user create. User inputs the
		// length of an array and the elements that he wants to input
		Scanner in = new Scanner(System.in);

		while (true) {
			try {
				// Inputing the length of an array
				System.out.println("Input length of an array: ");
				int arrayLength = in.nextInt();

				//Declaration of an array
				int[] arr = new int[arrayLength];

				// Inputing the number of elements that user wants to input
				System.out.println("Input number of numbers that you want to input: ");
				int inputIndex = in.nextInt();

				int index = 0;
				int num = 0;

				// Inputing elements in position that user wants
				for (int i = 0; i < inputIndex; i++) {
					System.out.println("Input the place of the number from 0 to "
									+ (arr.length - 1) + ":");
					index = in.nextInt();
					System.out.println("Input number: ");
					num = in.nextInt();
					arr[index] = num;
				}

				System.out.println(Arrays.toString(arr));
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Please insert numerical value!");
				in.nextLine();
			} catch (ArrayIndexOutOfBoundsException ex1) {
				System.out.println("Please input again the place of the number!");
			} catch (NegativeArraySizeException ex2) {
				System.out.println("Please input number that is larger than 0!");
			}
		}

		in.close();
	}

}
