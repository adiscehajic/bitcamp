package Execises;

public class FourDigitPalindroms {

	public static void main(String[] args) {

		// This program outputs all palindroms in range from 1000 to 10000

		for (int i = 1000; i < 10000; i++) {
			int rev = 0;

			// Checking if the number i is a palindrome
			for (int j = i; j > 0; j /= 10) {
				int digit = j % 10;
				rev = rev * 10 + digit;

				// Outputing i if its palindrome
				if (rev == i) {
					System.out.println(i);

				}
			}
		}
		
		
		

	}

}
