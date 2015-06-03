package exercises;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {

		// This program calculates the sum of two arrays into third array
		
		// Declaration of two arrays
		int[] firstArray = {9, 5, 2, 3};
		int[] secondArray = {4, 8, 7};	
		
		String str1 = "";
		String str2 = "";
		
		// Converting first array into string
		for (int i = 0; i < firstArray.length; i++) {
			str1 += firstArray[i];
		}
		
		// Converting second array into string
		for (int i = 0; i < secondArray.length; i++) {
			str2 += secondArray[i];
		}
		
		// Converting both strings into integers
		Integer num1 = Integer.parseInt(str1);
		Integer num2 = Integer.parseInt(str2);
		
		// Calculating the sum of two numbers
		int sum = num1 + num2;
		
		// Declaration and calculation of third string
		String str3 = "" + sum;
				
		// Declaration of an third array that is large as the third string
		char[] thirdArray = new char[str3.length()];
		
		// Putting all characters of a string into an array
		for (int i = 0; i < thirdArray.length; i++) {
			thirdArray[i] = str3.charAt(i);
		}
		
		// Outputing the result
		System.out.println(Arrays.toString(thirdArray));
		
	}

}
