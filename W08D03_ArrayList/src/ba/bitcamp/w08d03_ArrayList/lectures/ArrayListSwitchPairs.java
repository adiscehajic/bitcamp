package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListSwitchPairs {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 11; i++) {
			Random rand = new Random();
			list.add(rand.nextInt(5));
		}

		System.out.println(list);

		for (int i = 0; i < list.size() - 1; i += 2) {
				int temp = list.get(i);
				list.set(i, list.get(i + 1));
				list.set(i + 1, temp);
		}

		System.out.println(list);

	}

}
