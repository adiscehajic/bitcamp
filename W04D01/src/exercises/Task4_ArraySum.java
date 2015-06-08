package exercises;

import java.util.Arrays;

public class Task4_ArraySum {

	public static void main(String[] args) {
		getSum(args);
	}

	/**
	 * Calculates the sum of all numerical arguments
	 * 
	 * @param args
	 *            - Element of an argument array
	 * @return Sum of all numerical elements of an argument array
	 * @throws NumberFormatException
	 *             If not all values of elements of an array are numerical
	 */
	public static void getSum(String[] args) {
		int sum = 0;
		
		System.out.println(Arrays.toString(args));

		try {
			for (String num : args) {
				int number = Integer.parseInt(num);
				sum += number;
			}
			System.out.printf("Sum of all inputed numbers is: %d\n", sum);
		} catch (NumberFormatException ex) {
			System.out.println("Not all values of an array are numbers!");
		}

	}

}
