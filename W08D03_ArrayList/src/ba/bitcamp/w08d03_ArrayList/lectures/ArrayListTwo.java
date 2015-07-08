package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTwo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 200000; i++) {
			Random rand = new Random();
			list.add(rand.nextInt(5));
		}
		
		//System.out.println(list);
	
		long timeStartOne = System.currentTimeMillis();
		
//		while (list.indexOf(2) != -1) {
//			list.remove((Integer) 2);
//		}

		int temp = list.indexOf(2);
		
		while(temp != -1){
			list.remove(temp);
			temp = list.indexOf(2);
		}
		
		long timeEndOne = System.currentTimeMillis();
		
		//System.out.println(list);
		
		System.out.println("List time: " + (timeEndOne - timeStartOne));
	}
	
}
