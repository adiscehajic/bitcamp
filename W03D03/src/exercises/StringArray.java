package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		// This program converts the input from the user into array of a
		// characters and then outputs the same array in reverse
		Scanner in = new Scanner(System.in);

		// User inputs something
		System.out.println("Input something: ");
		String userString = in.nextLine();

		// Declaration of an array
		char[] charArray = new char[userString.length()];

		// Putting characters from an user input into a array
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = userString.charAt(i);
		}

		// Printing an array
		System.out.println(Arrays.toString(charArray));

		// Reversing an array
		for (int i = 0; i < charArray.length / 2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - i - 1] = temp;
		}

		// Printing the reversed array
		System.out.println(Arrays.toString(charArray));

		in.close();
	}

}
