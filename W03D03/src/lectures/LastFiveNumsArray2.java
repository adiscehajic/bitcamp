package lectures;
import java.util.Arrays;
import java.util.Scanner;

public class LastFiveNumsArray2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int maxNumOfElements = 10;

		System.out.println("Input max " + maxNumOfElements + " brojeva: ");
		int[] numbers = new int[maxNumOfElements];

		int idx = 0;

		// Inputing numbers into array
		while (true) {
			int num = input.nextInt();
			if (num >= 0) {
				// If the input index of numbers is smaller than 10 inputing
				// from the beginning
				if (idx < numbers.length) {
					numbers[idx] = num;
					idx++;
				} else {
					// If the input index is larger than 10, decreasing all
					// indexes for 1 and input last inputed number on last place
					for (int i = 1; i < numbers.length; i++) {
						numbers[i - 1] = numbers[i];
					}
					numbers[numbers.length - 1] = num;
				}
			} else {
				break;
			}
		}

		System.out.println("Inputed numbers: " + idx);
		System.out.println("Last " + numbers.length + " numbers:");
		for (int num : numbers) {
			System.out.print(num);
		}
		
		System.out.println("With Arrays.toString(): " + Arrays.toString(numbers));
		
		int max = -1;

		// Checking which of the numbers is largest
		for (int i = 0; i < numbers.length; i++) {
			int arrayElement = numbers[i];
			// If the element of an array is larger than max it becomes max
			if (arrayElement > max) {
				max = arrayElement;
			}
		}

		
		System.out.println("Largest number is: " + max);

		input.close();

	}
}
