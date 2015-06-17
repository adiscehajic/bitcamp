package ba.bitcamp.w05d03.exercises.speaker;

public class Speaker {

	/*
	 * Declaring properties of speaker
	 */
	private String manufacturer;
	private double price;
	private boolean isOn;
	private int soundVolume;
	private int batteryConsumption;

	/**
	 * Constructor
	 * 
	 * @param manufacturer
	 *            - The manufacturer of the speaker.
	 * @param price
	 *            - The price of the speaker.
	 * @param batteryConsumption
	 *            - The battery consumption of the speaker.
	 */
	public Speaker(String manufacturer, double price, int batteryConsumption) {
		this.manufacturer = manufacturer;
		if (price < 0) {
			throw new IllegalArgumentException("Please input price higher than 0!");
		}
		this.price = price;
		this.isOn = false;
		this.soundVolume = 0;
		if (batteryConsumption < 0) {
			throw new IllegalArgumentException("Please input battery consumption higher than 0!");
		}
		this.batteryConsumption = batteryConsumption;
	}

	/**
	 * Prints battery manufacturer and sound volume.
	 */
	public String toString() {

		String s = "";
		s += "Speaker manufacturer: " + manufacturer + "\n";
		if (isOn == true) {
			s += "Sound volume: " + getSoundVolume() + "\n";
		} else {
			s += "Off\n";
		}

		return s;
	}

	/*
	 * Get methods
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public boolean getIsOn() {
		return isOn;
	}

	public int getSoundVolume() {
		return soundVolume;
	}

	public int getBatteryConsumption() {
		return batteryConsumption;
	}

	/**
	 * Turns speaker on.
	 */
	public void enable() {
		isOn = true;
	}

	/**
	 * Turns speaker off.
	 */
	public void disable() {
		isOn = false;
	}

	/**
	 * Increases sound volume for 10.
	 */
	public void increaseVolume() {
		if (isOn == true) {
			if (soundVolume < 100) {
				soundVolume += 10;
			} else {
				soundVolume = 100;
			}
		}
	}

	/**
	 * Lowers sound volume for 10.
	 */
	public void lowerVolume() {
		if (isOn == true) {
			if (soundVolume > 10 && soundVolume <= 100) {
				soundVolume -= 10;
			} else if (soundVolume < 11) {
				soundVolume = 0;
				disable();
			}
		}
	}

}
