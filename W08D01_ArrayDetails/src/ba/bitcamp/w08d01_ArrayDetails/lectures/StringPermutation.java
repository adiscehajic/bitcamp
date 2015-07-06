package ba.bitcamp.w08d01_ArrayDetails.lectures;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {

		String str1 = "erbottlewat";
		String str2 = "waterbottle";

		System.out.println(isPermutation(str1, str2));

		System.out.println(isSatrovac(str1, str2));
	}

	/**
	 * Checks if the first string is permutation of a second string.
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isPermutation(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		int counter = 0;

		int[] syns = new int[255];

		for (int i = 0; i < syns.length; i++) {
			for (int j = 0; j < str1.length(); j++) {
				if (i == str1.charAt(j)) {
					syns[i]++;
				}
				if (i == str2.charAt(j)) {
					syns[i]--;
				}
			}
			if (syns[i] == 0) {
				counter++;
			}
		}

		if (counter == 255) {
			return true;
		}

		return false;
	}
	
	public static boolean isSatrovac(String str1, String str2){
		
		str1 += str1;
		return str1.indexOf(str2) > -1;
		
//		if (str1.substring(str1.indexOf(str2.charAt(0)), str1.indexOf(str2.charAt(2))).equals(str2.substring(0, 2))) {
//			return true;
//		}
//		
//		return false;
		
	}

}
