package Lectures;



public class Main {

	public static void main(String[] args) {

		int a = 5;
		int b = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if ((i == 1 || i == a) && (j == 1 || j == b)) {
					System.out.print("+");
				} else if (i == 1 || i == a) {
					System.out.print("-");
				} else if (j == 1 || j == b) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

			

		}
	}
}
