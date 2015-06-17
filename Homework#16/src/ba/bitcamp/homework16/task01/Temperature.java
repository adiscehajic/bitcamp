package ba.bitcamp.homework16.task01;

public class Temperature {

	// Declaring properties of temperature
	private double temp;

	/**
	 * Constructor
	 * 
	 * @param temperature
	 */
	public Temperature(int temperature) {
		this.temp = temperature;
	}

	/**
	 * Prints temperature
	 */
	public String toString() {
		return String.format("Temperature is %.2f", temp);
	}

	public double getAltitude() {
		return temp;
	}

	public void setAltitude(int altitude) {
		this.temp = altitude;
	}

	/**
	 * Prints the temperature in celsiuses.
	 */
	public void getTemperatureInC() {
		System.out.printf("%.0f°C\n", temp);
	}

	/**
	 * Prints the temperature in kelvins.
	 */
	public void getTemperatureInK() {
		System.out.printf("%.0f°C is %.2f°K\n", temp, temp + 273.15);
	}

	/**
	 * Prints the temperature in farenheits.
	 */
	public void getTemperatureInF() {
		System.out.printf("%.0f°C is %.2f°F\n", temp, temp * 1.8 + 32);
	}

}
