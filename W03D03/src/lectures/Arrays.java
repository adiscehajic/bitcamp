package lectures;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int maxNumOfElements = 100;
					
		System.out.println("Input max " + maxNumOfElements + " brojeva: ");
		int[] numbers = new int[maxNumOfElements];

		// Inputing numbers into array
		for (int i = 0; i < numbers.length; i++) {
			int num = input.nextInt();
			if (num > 0) {
				numbers[i] = num;
			} else {
				break;
			}
		}

		int max = -1;
		
		// Checking which of the numbers is largest
		for (int i = 0; i < numbers.length; i++) {
			int arrayElement = numbers[i];
			// If the element of an array is larger than max it becomes max
			if(arrayElement > max){
				max = arrayElement;
			}
		}
		
		System.out.println("Largest number is: " + max);
		
		input.close();

	}

}
