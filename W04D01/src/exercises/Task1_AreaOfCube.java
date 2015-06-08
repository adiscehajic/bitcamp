package exercises;

public class Task1_AreaOfCube {

	public static void main(String[] args) {
		System.out.println(getAreaOfSquare(-1));
		
	}
	
	/**
	 * Calculates the amount of area of a square.
	 * <p>
	 * @param a - One side of a square.
	 * @return Area of a square.
	 * @throws IllegalArgumentException If the value of <b>a</b> is lower than 0.
	 */
	public static double getAreaOfSquare(double a) {
		
		if (a < 0) {
			throw new IllegalArgumentException("Inputed wrong value of a!");
		}
		
		return a * a;
	}
	
}
