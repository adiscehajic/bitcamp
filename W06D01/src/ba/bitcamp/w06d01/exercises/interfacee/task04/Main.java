package ba.bitcamp.w06d01.exercises.interfacee.task04;

import java.util.Arrays;

public class Main {

	
	public static void main(String[] args) {
		
		char[] c1 = new char[]{'a', 'b', 'c', 'f', 'h', 'a'};
		
		System.out.println(Arrays.toString(shift(c1)));
	}
	
	
	public static char[] shift(char[] array){
		
		char[] newChar = new char[array.length];
				
		for (int i = 0; i < newChar.length; i++) {
			if (i < array.length - 1) {
				newChar[i+1] = array[i];
			} else {
				newChar[0] = array[array.length - 1];
			}
			
			
		}
				
		array = newChar;
		
		return array;
	}
	
}
