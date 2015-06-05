package exercises;

import java.util.Arrays;

public class Task7_GetArray2Method {

	public static int[] getArray2(int n, int k) {

		int[] arr = new int[n];

		for (int j = 0; j < arr.length; j++) {
			arr[j] = j + 1;
			while (arr[j] > k) {
				arr[j] -= k;
			}

		}

		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getArray2(5, 1)));
	}

}
