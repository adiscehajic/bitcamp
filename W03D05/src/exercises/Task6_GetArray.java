package exercises;

import java.util.Arrays;

public class Task6_GetArray {

	public static int[] getArray(int N, int M) {

		int[] arr = new int[10];

		try {
			if (N < M && N > 0) {
				for (int i = N; i < arr.length; i++) {
					arr[i] = M;
				}
			} else {
				throw new IndexOutOfBoundsException();
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Cougth!");
			return null;
		}
		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getArray(55, 10)));

	}
}
