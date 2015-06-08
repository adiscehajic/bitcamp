package exercises;

public class Task3_ArgsDivision {

	public static void main(String[] args) {

		double division = 0;

		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);

			if (second == 0) {
				throw new ArithmeticException();
			} else {
				division = (double) first / second;
				System.out.println(division);
			}
		} catch (NumberFormatException ex) {
			System.out.println("Inputed wrong format of numbers!");
		} catch (ArithmeticException ex1) {
			System.out.println("Can not divide with 0!");
		} catch (ArrayIndexOutOfBoundsException ex2) {
			System.out.println("Input two numbers!");
		}

	}

}
