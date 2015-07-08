package ba.bitcamp.w08d03_ArrayList.exercises;

import java.util.Arrays;

public class Task03_PartiallyFilled {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(partially("ABD", null, null, null, "DKJ")));
		
	}
	
	
	public static String[] partially(String... str){
	
		int counter = 0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				counter++;
			}
		}
		
		String[] filled = new String[str.length - counter];
		
		int index = 0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null) {
				filled[index] = str[i];
				index++;
			}
		}
		
		return filled;
		
	}
	
}
