package lectures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			int num = in.nextInt();
			System.out.println(num);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			e.printStackTrace();
		}

		System.out.println("This is the end of program!");
		in.close();

	}

}
