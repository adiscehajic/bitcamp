package ba.bitcamp.homework16.task01;

public class Main {

	public static void main(String[] args) {

		// Creating object temperature
		Temperature t1 = new Temperature(23);

		// Printing the temperature in ºC
		t1.getTemperatureInC();

		// Calculating temperature in ºK
		t1.getTemperatureInK();

		// Calculating temperature in ºF
		t1.getTemperatureInF();

	}

}
