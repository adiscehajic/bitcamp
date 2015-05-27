package Execises;

public class ThreeDigitPrimeNumbers {

	public static void main(String[] args) {

		// This program outputs three digit prime numbers

		System.out.println("The prime numbers from 101 are: ");

		for (int i = 100; i < 1000; i++) {
			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				} 
			}

			if (isPrime == true) {
				System.out.println(i);
			}
			

		}

	}

}
