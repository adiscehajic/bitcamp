package ba.bitcamp.w09d04_ListsSetsMaps.exercises;

import java.util.Scanner;
import java.util.TreeSet;

public class Task02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		TreeSet<Character> tSet = new TreeSet<Character>();
		
		String word = "";

		System.out.println("Please insert words: ");

		do {
			for (int i = 0; i < word.length(); i++) {
				tSet.add(word.charAt(i));
			}	
			word = in.nextLine();
		} while (!word.equals("end"));

		System.out.println("Number of different characters is: " + tSet.size());
		
		in.close();

	}
}
