package Lectures;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		char dollar = 36;
				
		System.out.println("How many quarters do you have?");
		int quarters = in.nextInt();
		
		System.out.println("How many dimes do you have?");
		int dimes = in.nextInt();
		
		System.out.println("How many nickels do you have?");
		int nickels = in.nextInt();
		
		System.out.println("How many pennies do you have?");
		int pennies = in.nextInt();
		
		int amountQuarters = quarters * 25;
		int amountDimes = dimes * 10;
		int amountNickels = nickels * 5;
		int amountPennies = pennies;
		
		double amountDollars = (double)(amountQuarters + amountDimes + amountNickels + amountPennies) / 100;
				
		System.out.printf("You have %.2f%s", amountDollars, dollar);
				
	}

}
