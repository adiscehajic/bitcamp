package ba.bitcamp.w08d03_ArrayList.exercises;

import java.util.Arrays;

public class Task04_FindTheOne {

	public static void main(String[] args) {

		System.out.println(isInString("Bitcamp", 'c'));

	}

	public static boolean isInString(String str, char character) {

		char[] charArray = str.toCharArray();

		Arrays.sort(charArray);

		return Arrays.binarySearch(charArray, character) > 0;
	}

}
