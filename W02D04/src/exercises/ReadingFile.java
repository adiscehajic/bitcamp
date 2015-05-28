package exercises;

import Lectures.TextIO;

public class ReadingFile {

	public static void main(String[] args) {
		TextIO.readFile("src/Execises/Test");
		
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		
		System.out.println(a + b);
	}

}
