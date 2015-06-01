package lectures;

import java.lang.Character.Subset;
import java.util.Scanner;

public class StringTerm {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int result = 0;

		// Inputing wanted string
		System.out.print("Please enter the value that you vant to calculate: ");
		String term = in.nextLine();

		// Searching for the sign and making two different numbers
		for (int i = 0; i < term.length(); i++) {
			// Checking if the sign is +
			if(term.charAt(i) == '+'){
				String one = term.substring(0, term.indexOf('+'));
				String two = term.substring((term.indexOf('+') + 1), term.length());
				Integer numOne = Integer.parseInt(one);
				Integer numTwo = Integer.parseInt(two);
				result = numOne + numTwo;
			} 
			// Checking if the sign is -
			else if(term.charAt(i) == '-'){
				String one = term.substring(0, term.indexOf('-'));
				String two = term.substring((term.indexOf('-') + 1), term.length());
				Integer numOne = Integer.parseInt(one);
				Integer numTwo = Integer.parseInt(two);
				result = numOne - numTwo;
			}
		}
		
		// Printing the result			
		System.out.println("The result is: " + result);

		in.close();

	}

}
