package exercises;

public class Main {

	public static void main(String[] args) {
		printHello();
		System.out.println(getMax(10, 15));
	}
	
	/**
	 * Prints "Hello" on the console.
	 */
	public static void printHello() {
		System.out.println("Hello!");
	}
	
	
	/**
	 * Determines <code>which number</code> is bigger.
	 * <p>
	 * @param num1 - First number
	 * @param num2 - Second number
	 * @return Max number.
	 */
	public static int getMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}
	
	
}

