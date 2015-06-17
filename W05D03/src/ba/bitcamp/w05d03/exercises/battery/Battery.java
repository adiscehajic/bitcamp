package ba.bitcamp.w05d03.exercises.battery;

public class Battery {

	/*
	 * Declaring properties of battery
	 */
	private String manufacturer;
	private int batteryStatus;
	private int speedOfCharging;

	private static final int MAX = 100;
	private static final int MIN = 0;

	/**
	 * Constructor
	 * 
	 * @param manufacturer
	 *            - The manufacturer of battery.
	 * @param speedOfCharging
	 *            - The speed of battery charging.
	 */
	public Battery(String manufacturer, int speedOfCharging) {
		this.manufacturer = manufacturer;
		this.batteryStatus = 50;
		this.speedOfCharging = speedOfCharging;
	}

	/*
	 * Get methods
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	public int getBatteryStatus() {
		return batteryStatus;
	}

	/**
	 * Charges battery for the time that user inputs.
	 * 
	 * @param time
	 *            - The time how long will battery charge.
	 */
	public void chargeBattery(int time) {
		if (batteryStatus + (time * speedOfCharging) < MAX) {
			batteryStatus += time * speedOfCharging;
		} else {
			batteryStatus = MAX;
		}
	}

	/**
	 * Decreases battery status for the inputed amount.
	 * 
	 * @param amount
	 *            - The amount for what user want to decrease battery.
	 */
	public void decreaseBatteryStatus(int amount) {
		if (amount < MIN || amount > MAX) {
			throw new IllegalArgumentException(
					"Battery can only be decreased for value from 1 to 100!");
		}
		if (batteryStatus - amount > MIN) {
			batteryStatus -= amount;
		} else {
			batteryStatus = MIN;
		}

	}

	/**
	 * Prints the manufacturer and status of the battery
	 */
	public String toString() {
		return String.format(
				"Battery manufacturer: %s\nBattery status: %d%%\n",
				manufacturer, batteryStatus);
	}

}
