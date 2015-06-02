package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		try{
//		System.out.println("Input number: ");
//		int num = in.nextInt();
//		System.out.println(num);
//		} catch (InputMismatchException e){
//			System.out.println("You have not inputed numerical value!");
//		}
		
//		try {
//		String str = in.nextLine();
//		Integer numStr = Integer.parseInt(str);
//		System.out.println(numStr);
//		} catch (NumberFormatException e1) {
//			System.out.println("Input wrong! Input numerical value!");
//		}
		
//		try {
//		System.out.println("Input first number: ");
//		int num1 = in.nextInt();
//		System.out.println("Input second number: ");
//		int num2 = in.nextInt();
//		System.out.println(num1 / num2);
//		} catch (ArithmeticException e2) {
//			System.out.println("Division not allowed!");
//		}
		
//		try{
//		String str = null;
//		System.out.println(str.toString());
//		} catch(NullPointerException e3) {
//			System.out.println("Illegal operations!");
//		}
		
		
		try{
		Character.toChars(-1);
		} catch (IllegalArgumentException e4) {
			System.out.println("Illegal operations!");
		}
		

	}

}
