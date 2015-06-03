package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfNumRepeating {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input lenght of an array: ");
		int arrayLength = in.nextInt();

		int[] arr = new int[arrayLength];

		int num = 0;

		while (true) {
			for (int i = 0; i < arr.length; i++) {
				while (true) {
					System.out.println("Input number: ");
					num = in.nextInt();
					if (num > 0 && num < 10) {
						arr[i] = num;
					} else {
						System.out.println("Inputed number is not in range from 0 to 9. \nInput again: ");
						num = in.nextInt();
						arr[i] = num;
					}
					break;
				}
			}
			break;
		}
		
		int counter = 0;
		
		for (int i = 1; i < 10; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					counter++;
					System.out.println("Number " + i + " repeats " + counter + " times. ");				
				}
			}
			counter = 0;
		}
		
		
		System.out.println(Arrays.toString(arr));

		in.close();

	}

}
