package Lectures;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		String name = in.next();
				
		System.out.printf("Hello %s, nice to meet you!", name.toUpperCase());
	}

}
