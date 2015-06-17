package ba.bitcamp.w05d03.exercises.antenna;

public class Antenna {

	/*
	 * Declaring properties of antenna
	 */
	private String manufacturer;
	private int signalStrength;
	private int batteryConsumption;

	public static final int MIN_SIGNAL = 0;
	public static final int MAX_SIGNAL = 4;

	/**
	 * Constructor
	 * 
	 * @param manufacturer
	 *            - The manufacturer of the antenna.
	 * @param batteryConsumption
	 *            - The battery consumption of the antenna.
	 */
	public Antenna(String manufacturer, int batteryConsumption) {
		this.manufacturer = manufacturer;
		this.signalStrength = 4;
		this.batteryConsumption = batteryConsumption;
	}

	/*
	 * Get methods
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	public int getSignalStrength() {
		return signalStrength;
	}

	public int getBatteryConsumption() {
		return batteryConsumption;
	}
	
	/**
	 * Sets the strength of signal on inputed value.
	 * 
	 * @param value
	 *            - The value on which user want to put signal strength.
	 */
	public void setSignalStrength(int value) {
		if (value >= MIN_SIGNAL && value <= MAX_SIGNAL) {
			signalStrength = value;
		} else {
			throw new NumberFormatException(
					"The signal strength can only be between 0 and 4!");
		}
	}

	/**
	 * Checks if the inputed signal strength and signal message are ok.
	 * 
	 * @param signalValue
	 *            - Value of signal strength.
	 * @param signalMessage
	 *            - Message that user want to check.
	 * @return
	 */
	public boolean isSignalOk(int signalValue, String signalMessage) {
		if (signalValue >= MIN_SIGNAL
				&& signalValue <= MAX_SIGNAL
				&& (signalMessage.substring(0, 3).equals("CAL") || signalMessage
						.substring(0, 3).equals("SMS"))
				&& signalMessage.substring(3, 6).equals("387")
				&& (signalMessage.substring(3, signalMessage.length()).length() >= 11)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Prints the manufacturer and signal strength of the antenna.
	 */
	public String toString() {
		return String.format("Antenna manufacturer: %s\nSignal strength: %d\n",
				manufacturer, signalStrength);
	}
}
