package lectures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throwing {

	public static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Not 0!");
		}
		return a / b;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num = 1;
		int num2 = 0;
		
		try{
//			num = in.nextInt();
//			num2 = in.nextInt();
		System.out.println(num / num2);
		} catch(InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("It is not possible!");
		} catch (ArithmeticException e1) {
			System.out.println("Dividing was wrong!");
		} finally {
			System.out.println("This is finally!");
		}
		
		System.out.println("This is end of a program!");

		in.close();
	}

}
