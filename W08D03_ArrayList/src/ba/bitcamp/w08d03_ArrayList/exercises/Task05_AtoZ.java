package ba.bitcamp.w08d03_ArrayList.exercises;

import java.util.Arrays;

public class Task05_AtoZ {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(sortStrings("Adis", "Edin", "aaa", "Dinko", "Bojan", "Ada")));
		
	}
	
	public static String[] sortStrings(String... str){
		
		Arrays.sort(str);

		return str;	
	}
	
}
