package ba.bitcamp.w10d01_WritingGenerics.exercises.task02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		MyArrayList<Integer> list = new MyArrayList<Integer>();

		list.addLast(5);
		list.addLast(10);
		list.addLast(13);

		System.out.println(list);

		list.addFirst(18);

		System.out.println(list);

		list.addAtIndex(0, 33);
		System.out.println(list);

		System.out.println(list.contains(14));
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(40);
		array.add(50);
		array.add(70);
		
		list.addAll(array);
		
		System.out.println(list);

	}
}
