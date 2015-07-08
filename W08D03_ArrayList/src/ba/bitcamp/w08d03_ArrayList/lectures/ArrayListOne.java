package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.Random;
import java.util.ArrayList;

public class ArrayListOne {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		Random rand = new Random();

		long timeStartOne = System.currentTimeMillis();
		for (int i = 0; i < 30000000; i++) {
			list.add(rand.nextInt(1000000));
		}
		long timeEndOne = System.currentTimeMillis();

		// System.out.println(list);
		System.out.println("List time: " + (timeEndOne - timeStartOne));

		int[] array = new int[30000000];

		long timeStartTwo = System.currentTimeMillis();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(1000000);
		}

		long timeEndTwo = System.currentTimeMillis();

		// System.out.println(Arrays.toString(array));
		System.out.println("Array time: " + (timeEndTwo - timeStartTwo));

		System.out.println("The difference between list time and array time: "
				+ ((timeEndOne - timeStartOne) - (timeEndTwo - timeStartTwo)));

	}

}
