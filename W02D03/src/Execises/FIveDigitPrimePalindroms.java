package Execises;

public class FIveDigitPrimePalindroms {

	public static void main(String[] args) {

		// This program outputs all prime five digit numbers that are palindroms
		
		for (int z = 10301; z < 100000; z++) {
			int rev = 0;

			// Checking if inputed number is palindrome
			for (int i = z; i > 0; i /= 10) {
				int digit = i % 10;
				rev = rev * 10 + digit;
			} 

			// Checking if inputed number is prime number
			boolean isPrime = true;

			for (int j = 2; j < z; j++) {
				if (z % j == 0) {
					isPrime = false;
					break;
				}

			}

			// Checking if the number is prime and palindrome
			if (isPrime == true && z == rev) {
				System.out.println(z);
			}
		}

	}

}
