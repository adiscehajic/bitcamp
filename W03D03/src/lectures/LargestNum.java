package lectures;
import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
				System.out.println("Insert first number: ");
				int num1 = input.nextInt();
				System.out.println("Insert second number: ");
				int num2 = input.nextInt();
				System.out.println("Insert third number: ");
				int num3 = input.nextInt();

				int max = num1;
				if (num2 > max) {
					max = num2;
				}
				if (num3 > max) {
					max = num3;
				}
				System.out.println("Largest number is: " + max);

		 
	
		input.close();
	}
}
