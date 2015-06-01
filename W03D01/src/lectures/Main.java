package lectures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	
	public static int getInput(){
		Scanner in = new Scanner(System.in);
		int number = 0;
		
		while (true) {
			try {
				System.out.println("Input first number: ");
				number = in.nextInt();
				break;
			} catch (InputMismatchException e) {
				
				System.out.println("It is not number!");
				in.nextLine();
			}
		}
		
		in.close();
		return number;
		
	}
	
	
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println(getInput());

	

		in.close();
	}
}
