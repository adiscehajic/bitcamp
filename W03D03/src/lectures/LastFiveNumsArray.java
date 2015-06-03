package lectures;
import java.util.Scanner;

public class LastFiveNumsArray {

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
				numbers[idx] = num;
				idx++;
				// If the inputed number of numbers is larger than 10 input
				// starts from the beginning
				if (idx + 1 == numbers.length) {
					idx = 0;
				}
			} else {
				break;
			}
		}

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
