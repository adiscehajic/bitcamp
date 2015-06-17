package ba.bitcamp.w05d03.exercises.display;

public class Main {

	public static void main(String[] args) {

		// Creating object display
		Display displayOne = new Display("Samsung", 10);

		// Printing information about display
		System.out.println(displayOne);

		// Turning display on
		displayOne.turnOn();

		// Printing information about display
		System.out.println(displayOne);

		// Decreasing brightness of the display
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();
		displayOne.decreaseBrightness();

		// Turning display off
		displayOne.turnOff();

		// Printing information about display
		System.out.println(displayOne);

	}

}
