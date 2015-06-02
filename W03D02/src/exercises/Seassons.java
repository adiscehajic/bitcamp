package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seassons {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int month = 0;
		
		while (true) {
			try {
				System.out.println("Input month: ");
				month = in.nextInt();
				
				if (month == 1 || month == 2 || month == 3) {
					System.out.println("It is a Winter!");
					break;
				} else if (month == 4 || month == 5 || month == 6) {
					System.out.println("It is a Spring!");
					break;
				} else if (month == 7 || month == 8 || month == 9) {
					System.out.println("It is a Sommer!");
					break;
				} else if (month == 10 || month == 11 || month == 12) {
					System.out.println("It is a Autumn!");
					break;
				} else {
					System.out.println("Yuo have not inputed the wright value of a month!");
					break;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("Please input numerical value from 1 do 12!");
				in.nextLine();
				
			} catch (IllegalStateException e1) {
				System.out.println("Please input numerical value from 1 do 12!");
				in.nextLine();
				
			}
		
		}
		in.close();
	}

}
