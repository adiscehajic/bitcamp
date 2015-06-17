package ba.bitcamp.homework16.task02;

public class Main {

	public static void main(String[] args) {

		// Creating object glass
		Glass glassOne = new Glass(15);

		// Printing object glass
		System.out.println(glassOne);

		// Printing the type of liquid in the glass
		System.out.println(glassOne.getTypeOfLiquid());

		// Printing current capacity in the glass
		System.out.println(glassOne.getCurrentCapacity());

		// Adding some liquid into a glass
		glassOne.addLiquid("Water", 10);

		// Printing the glass
		System.out.println(glassOne);

		// Adding more liquid into a glass
		glassOne.addLiquid("Water", 10);

		// Printing the glass
		System.out.println(glassOne);

		// Adding different liquid into a glass
		glassOne.addLiquid("Juice", 5);

		// Printing the glass
		System.out.println(glassOne);

		// Spilling the liquid from the glass
		glassOne.emptyGlass();

		// Printing the glass
		System.out.println(glassOne);

		// Adding different liquid into a glass
		glassOne.addLiquid("Juice", 20);

		// Printing the glass
		System.out.println(glassOne);

	}

}
