package ba.bitcamp.w08d03_ArrayList.exercises;

import java.util.Arrays;

public class Task02_ShiftingAnArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(shiftArray("A", "B", "C", "D", "E", "G")));
		
	}
	
	public static String[] shiftArray(String... str){
		
		String[] strShift = new String[str.length];
		
		strShift[0] = str[0];
		
		for (int i = 0; i < strShift.length - 1; i++) {
			strShift[i + 1] = str[i];
		}

		return strShift; 
	}
	
}
