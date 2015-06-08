package lectures;

public class PrintHelloWorld {

	public static void main(String[] args) {
		// sayHello();
		// sayHello("Adis");

		if (args.length == 0) {
			System.out.println("Usage: Untitled.jar Name1, Name2,..");
		} else {
//			for (int i = 0; i < args.length; i++) {
//				sayHello(args[i]);
//			}
			
			for (String name : args) {
				sayHello(name);
			}
		}


	}

	/**
	 * Prints Hello World to the screen.
	 * <p>
	 * Sends string "Hello World" to the standard output.
	 */
	public static void sayHello() {
		System.out.println("Hello World!");
	}

	/**
	 * Greets user by name.
	 * 
	 * @param name
	 *            Name of a user to greet.
	 */
	public static void sayHello(String name) {
		System.out.printf("Hello, %s!\n", name);
	}

}
