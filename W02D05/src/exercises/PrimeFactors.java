package exercises;

public class PrimeFactors {
	
	// This program calculates the prime factors of inputed number
	
	public static void main(String[] args) {
		int num = 290472;
		System.out.println("Prime factors of inputed number are: ");
		
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				System.out.print(i + " ");
			}
		}
	}

}
