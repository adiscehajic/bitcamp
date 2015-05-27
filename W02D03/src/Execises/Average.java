package Execises;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {

		// This program outputs the average of inputed numbers

		Scanner in = new Scanner(System.in);

		int num = 0;
		int sum = 1;
		int counter = -1;
		double average = 0;

		// Computing the sum of inputed numbers 
		do {

			System.out.print("Input number: ");
			num = in.nextInt();
			sum += num;
			counter++;

		} while (num != -1);
		
		// Computing the average of inputed numbers
		average = (double) sum / counter;
		System.out.printf("Average of inputed numbers is: %.3f", average);
		
		in.close();

	}

}
