package exercises;

public class Task5_GetMax {

	public static void main(String[] args) {

		System.out.println(getMax(6.2, 6.2));

		// Declaration of an new integer array
		int[] arrayInt = new int[args.length];
		
		try {
			for (int i = 0; i < arrayInt.length; i++) {
				arrayInt[i] = Integer.parseInt(args[i]);
			}
			System.out.println(getMax(arrayInt));
		} catch (NumberFormatException ex) {
			System.out.println("Not all elements are numerical!");
		}

		// Declaration of an new double array
		double[] arrayDouble = new double[args.length];

		try {
			for (int i = 0; i < arrayDouble.length; i++) {
				arrayDouble[i] = Double.parseDouble(args[i]);
			}
			System.out.println(getMax(arrayDouble));
		} catch (NumberFormatException ex) {
			System.out.println("Not all elements are numerical!");
		}
	}

	/**
	 * Prints max number from two numbers.
	 * 
	 * @param num1
	 *            - First number
	 * @param num2
	 *            - Second number
	 * @return Max - Larger number
	 */
	public static double getMax(double num1, double num2) {
		return (num1 > num2) ? num1 : num2;
	}

	/**
	 * Prints max number from an array of integer elements.
	 * 
	 * @param array
	 *            - Array of integer elements
	 * @return Max number from an array
	 * @throws NumberFormatException
	 *             If the value of an element is not numerical
	 */
	public static int getMax(int[] array) {

		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	/**
	 * Prints max number from an array of double elements.
	 * 
	 * @param array
	 *            - Array of double elements
	 * @return Max number from an array
	 * @throws NumberFormatException
	 *             If the value of an element is not numerical
	 */
	public static double getMax(double[] array) {

		double max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
