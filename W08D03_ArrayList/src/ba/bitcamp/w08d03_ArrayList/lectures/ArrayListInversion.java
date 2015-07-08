package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListInversion {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10000000; i++) {
			Random rand = new Random();
			list.add(rand.nextInt(5));
		}
		
		//System.out.println(list);
		
		ArrayList<Integer> listInvers = new ArrayList<Integer>();
		
		long timeStartOne = System.currentTimeMillis();
		
		for (int i = 0; i < list.size(); i++) {
			listInvers.add(list.get(list.size() - 1 - i));
		}
		
		long timeEndOne = System.currentTimeMillis();
		
		//System.out.println(listInvers);
		
		System.out.println("Time: " + (timeEndOne - timeStartOne) + " [ms]");
	}
	
}
