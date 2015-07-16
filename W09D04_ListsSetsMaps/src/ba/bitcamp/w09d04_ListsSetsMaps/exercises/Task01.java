package ba.bitcamp.w09d04_ListsSetsMaps.exercises;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		Random rand = new Random();
		
		for (int i = 0; i < 20; i++) {
			list.add(rand.nextInt((100 - 50) + 1) + 50);
		}
		
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<>();
		
		ListIterator<Integer> iter = list.listIterator();
		
		while (iter.hasNext()) {
			list2.add(iter.next());
		}
		
		while (iter.hasPrevious()) {
			list2.add(iter.previous());
		}
		
		System.out.println(list2);
	}
	
}
