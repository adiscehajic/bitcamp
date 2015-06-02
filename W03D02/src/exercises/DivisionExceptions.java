package exercises;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DivisionExceptions {

	public static void main(String[] args) {

		

		while (true) {
			Scanner in = new Scanner(System.in);
			try {
				System.out.println("Input first number: ");
				int num1 = in.nextInt();
				System.out.println("Input second number");
				int num2 = in.nextInt();

				double division = (double) num1 / num2;

				System.out.printf("The result of division of two inputed numbers is: %.2f", division);
				
			} catch (InputMismatchException e) {
				System.out
						.println("You have inputed wrong value. Please input again!");
				in.nextLine();
			} catch (NoSuchElementException e2) {
				System.out.println("You have inputed wrong value. Please input again!");
				in.nextLine();
			}
			
			in.close();
		}

	}

}
