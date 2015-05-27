package Execises;

public class NineDigitFibonnaciPrimeNumbers {

	public static void main(String[] args) {

		int num = 100;

		long firstNumber = 0;
		long secondNumber = 1;
		long thirdNumber = 0;

		for (int i = 0; i < num; i++) {
			boolean isPrime = true;
			thirdNumber = firstNumber + secondNumber;
			secondNumber = firstNumber;
			firstNumber = thirdNumber;

			for (int j = 2; j < thirdNumber; j++) {
				if (thirdNumber % j == 0) {
					isPrime = false;
					break;
				}

			}

			if (isPrime && thirdNumber > 100000000 && thirdNumber < 1000000000) {
				System.out.println("Nine digit prime fibonnaci number are: ");
				System.out.println(thirdNumber);
			}

		}

	}

}
