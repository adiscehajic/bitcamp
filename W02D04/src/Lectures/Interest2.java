package Lectures;


public class Interest2 {

	public static void main(String[] args) {
		double principal; // The value of the investment.
		double rate; // The annual interest rate.
		double interest; // The interest earned during the year.

		System.out.print("Enter the initial investment: ");
		principal = TextIO.getlnDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = TextIO.getlnDouble();

		interest = principal * rate; // Compute this year's interest.
		principal = principal + interest; // Add it to principal.

		TextIO.writeFile("results");
		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);

	}

}
