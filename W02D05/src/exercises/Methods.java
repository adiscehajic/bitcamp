package exercises;

public class Methods {

	// This method outputs Hello and name that we input
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	// This method calculate if the number is positive or not
	public static boolean isPositive(int num) {
		return (num >= 0) ? true : false;
	}

	// This method calculate if the number is even or not
	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}

	// This method calculate if the number is prime or not
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	// This method calculate the sum of three inputed numbers and all numbers
	// that are lower than they
	public static int getSum(int numFirst, int numSecond, int numThird) {
		int sumFirst = 0;
		int sumSecond = 0;
		int sumThird = 0;

		for (int i = 1; i <= numFirst; i++) {
			sumFirst += i;
		}
		for (int i = 1; i <= numSecond; i++) {
			sumSecond += i;
		}
		for (int i = 1; i <= numThird; i++) {
			sumThird += i;
		}

		int sum = sumFirst + sumSecond + sumThird;

		return sum;

	}

	// This program calculates all holes in the inputed number, where 0. 4. 6
	// and 9 have 1 hole and 8 has 2 holes
	public static int getNumberOfHoles(int num) {
		int numOfDigit = 0;

		while (num > 0) {
			int digit = num % 10;
			if (digit == 4) {
				numOfDigit++;
			} else if (digit == 6) {
				numOfDigit++;
			} else if (digit == 8) {
				numOfDigit += 2;
			} else if (digit == 9) {
				numOfDigit++;
			} else if (digit == 0) {
				numOfDigit++;
			}
			num /= 10;
		}

		return numOfDigit;
	}
	
	public static int getNumberOfHolesString(String num){ 
		int numOfDigit = 0;
		for (int i = 0; i < num.length(); i++) {
			
			if (num.charAt(i) == '4') {
				numOfDigit++;
			} else if (num.charAt(i) == '6') {
				numOfDigit++;
			} else if (num.charAt(i) == '8') {
				numOfDigit += 2;
			} else if (num.charAt(i) == '9') {
				numOfDigit++;
			} else if (num.charAt(i) == '0') {
				numOfDigit++;
			}
			
		}
		return numOfDigit;
	}

	public static void main(String[] args) {
		
		System.out.println(getNumberOfHolesString("2014"));

	}

}
