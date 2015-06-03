package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Please insert lenght of an array: ");
		int arrayLength = in.nextInt();
		
		int[] userArray = new int[arrayLength];
		
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Input number: ");
			userArray[i] = in.nextInt();
		}
		
		System.out.println("Inputed array is: " + Arrays.toString(userArray));
		
		in.close();
	}

}
