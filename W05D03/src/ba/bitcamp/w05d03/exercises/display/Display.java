package ba.bitcamp.w05d03.exercises.display;

public class Display {

	/*
	 * Declaring
	 */
	private String manufacturer;
	private int brightness;
	private boolean isOn;
	private int batteryConsumption;

	private static final int MIN_BRIGHTNESS = 0;
	private static final int MAX_BRIGHTNESS = 100;

	/**
	 * Constructor
	 * 
	 * @param manufacturer
	 *            - The manufacturer of the display.
	 * @param batteryConsumption
	 *            - Battery consumption of the display.
	 */
	public Display(String manufacturer, int batteryConsumption) {
		this.manufacturer = manufacturer;
		this.brightness = 100;
		this.isOn = false;
		this.batteryConsumption = batteryConsumption;
	}

	/*
	 * Get method
	 */
	public int getBatteryConsumption() {
		return batteryConsumption;
	}
	
	public boolean getIsOn(){
		return isOn;
	}

	/**
	 * Turns display on.
	 */
	public void turnOn() {
		isOn = true;
	}

	/**
	 * Turns display off.
	 */
	public void turnOff() {
		isOn = false;
	}

	/**
	 * Increases display brightness for 10.
	 */
	public void increaseBrightness() {
		if (isOn == true && brightness < MAX_BRIGHTNESS) {
			brightness += 10;
		}
	}

	/**
	 * Decreases display brightness for 10.
	 */
	public void decreaseBrightness() {
		if (isOn == true && brightness > MIN_BRIGHTNESS) {
			brightness -= 10;
		}
	}

	/**
	 * Prints display manufacturer and display brightness.
	 */
	public String toString() {
		String s = "Display manufacturer: " + manufacturer + "\n";

		if (isOn == true) {
			s += "Brightness: " + brightness + "\n";
		} else {
			s += "Off";
		}

		return s;
	}

}
