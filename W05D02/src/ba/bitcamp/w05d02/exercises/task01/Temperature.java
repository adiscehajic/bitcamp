package ba.bitcamp.w05d02.exercises.task01;

public class Temperature {

	// Declaring properties of temperature
	private double temp;

	/**
	 * Constructor
	 * 
	 * @param altitude
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
		System.out.printf("%.0fºC\n", temp);
	}

	/**
	 * Prints the temperature in kelvins.
	 */
	public void getTemperatureInK() {
		System.out.printf("%.0fºC is %.2fºK\n", temp, temp + 273.15);
	}

	/**
	 * Prints the temperature in farenheits.
	 */
	public void getTemperatureInF() {
		System.out.printf("%.0fºC is %.2fºF\n", temp, temp * 1.8 + 32);
	}

}
