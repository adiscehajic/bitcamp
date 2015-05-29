package exercises;

import java.util.Scanner;

public class NameOutput {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = in.nextLine();

		// Outputting characters of a name in different rows and making every
		// second character upper
		for (int i = 0; i < name.length(); i++) {

			if (i == 0 || i % 2 == 0) {
				System.out.println(Character.toUpperCase(name.charAt(i)));
			} else {
				System.out.println(name.charAt(i));
			}
		}

	}

}
