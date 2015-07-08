package ba.bitcamp.w08d03_ArrayList.lectures;

import java.util.Arrays;
import java.util.Random;

public class Cubes {

	public static void main(String[] args) {
		
		int[] array = new int[13];
		int result;
		
		for (int i = 2; i < 3600000; i++) {
			
		result = throwDice();
		array[result]++;
			
			
		}
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static int throwDice(){
		Random rand = new Random();
		int num1 = rand.nextInt(6) + 1;
		int num2 = rand.nextInt(6) + 1;
		return num1 + num2;
	}
	
}
