package lectures;

public class GetNumSum {

	public static void main(String[] args) {

		// This program is outputting elements of a string that are numbers,
		// converts them into integer value and then calculates their sum
		
		int sum = 0;

		// Checking if there is some characters into string
		if (args.length == 0) {
			System.out.println("Please input some args!");
		} else {
			System.out.println("Inputed args are: ");
			
			// Printing arguments into screen
			for (String num : args) {
				System.out.println(getNum(num));
			}

			// Calculating the sum of inputed arguments
			for (int i = 0; i < args.length; i++) {
				sum += Integer.parseInt(getNum(args[i]));
			}

			// Printing the result
			System.out.printf("Sum of all inputed args is: %d\n", sum);
		}
	}

	/**
	 * Print inputed arguments to the screen.
	 * 
	 * @param num
	 * @return String
	 */
	public static String getNum(String num) {
		return num;
	}

}
