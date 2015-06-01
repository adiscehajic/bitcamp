package exercises;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input number of containers: ");
		int num = in.nextInt();
		System.out.print("Input capacity: ");
		int containers = in.nextInt();
		int counter = 0;
		int reducedNum = num;

		while (reducedNum > containers) {
			reducedNum = num;
			while (reducedNum % 2 == 0) {
				reducedNum /= 2;
			}

			if (reducedNum > containers) {
				num++;
				counter++;
			}
		}

		System.out.println(counter);

		in.close();

	}
}
