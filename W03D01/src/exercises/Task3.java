package exercises;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Input number: ");
		int num = in.nextInt();
		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}

		while (factorial % 10 == 0) {
			factorial /= 10;					
		}
		
		String lastDigits = "";

		int counter = 0;
		
		while (factorial > 0 && counter < 2) {
			long digit = factorial % 10;
			lastDigits = digit + lastDigits;
			factorial /= 10;
			counter++;
		}

		System.out.println("Last two digits that are not 0 are: "
				+ lastDigits);

		in.close();

	}

}
