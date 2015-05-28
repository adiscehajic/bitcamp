package exercises;

import java.util.Scanner;

import Lectures.TextIO;

public class MultiplicationTable {

	public static void main(String[] args) {

		int num1 = 9;
		int num2 = 9;
		
		TextIO.writeFile("MultiplicationTable.txt");
		
		for (int i = -1; i <= num1; i++) {

			for (int j = -1; j <= num2; j++) {
				if (i == -1 && j == -1) {
					TextIO.put("* ");
				} else if ((i == -1) && j > 0) {
					TextIO.putf("%2d ", j);
				} else if (((i == -1 && j != -1) || (i != -1 && j == -1)) && i > 0) {
					TextIO.putf("%d ", i);
				} else if ((j == 0 && i > 0 || i == -1)) {
					TextIO.put("| ");
				} else if (i == 0) {
					TextIO.put("-- ");
				} else {
					TextIO.putf("%2d ", i * j);
				}

			}
			
			TextIO.putln();
			
		}
		
		
	}

}
