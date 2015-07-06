package ba.bitcamp.w08d01_ArrayDetails.exercises;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {
		
		String[] stringOne = new String[]{"1", "5", "0", "4"};
		String[] stringTwo = new String[]{"A", "P", "B", "D"};
		
		System.out.println(Arrays.toString(combineArrays(stringOne, stringTwo)));
		
	}
	
	public static String[] combineArrays(String[] str1, String[] str2){
		
		String[] combine = new String[str1.length + str2.length];
		
		int i = 0;
		
		for(String element : str1){
			combine[i] = element;
			i += 2;
		}
		
		i = 1;
		
		for(String element : str2){
			combine[i] = element;
			i += 2;
		}
		
		return combine;
	}
	
}
