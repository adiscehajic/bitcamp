package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.ArrayList;

public class ArrayListMarkLength4 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("adis");
		list.add("time");
		list.add("for");
		list.add("slap");
		list.add("bitcamp");
		
		System.out.println(list);
		
		String stars = "****";
		
		System.out.println(list.get(1).length());
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() == 4) {
				list.add(i, stars);
				i++;
			} 
		}
		System.out.println(list);
	}
	
}
