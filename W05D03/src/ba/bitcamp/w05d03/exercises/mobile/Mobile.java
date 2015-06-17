package ba.bitcamp.w05d03.exercises.mobile;

import ba.bitcamp.w05d03.exercises.antenna.Antenna;
import ba.bitcamp.w05d03.exercises.battery.Battery;
import ba.bitcamp.w05d03.exercises.display.Display;
import ba.bitcamp.w05d03.exercises.speaker.Speaker;

public class Mobile {

	/*
	 * Declaring properties of mobile phone
	 */
	private String manufacturer;
	private Display display;
	private Battery battery;
	private Antenna antenna;
	private Speaker speaker;
	private int batteryConsumption;
	private int baterryStatus;
	private boolean isOn;

	/**
	 * Constructor
	 * 
	 * @param manufacturer
	 * @param display
	 * @param battery
	 * @param antenna
	 * @param speaker
	 */
	public Mobile(String manufacturer, Display display, Battery battery,
			Antenna antenna, Speaker speaker) {
		this.manufacturer = manufacturer;
		this.display = display;
		this.battery = battery;
		this.antenna = antenna;
		this.speaker = speaker;
		this.batteryConsumption = this.antenna.getBatteryConsumption();

		this.baterryStatus = battery.getBatteryStatus();
		this.isOn = false;
	}

	/**
	 * Prints information about mobile phone.
	 */
	public String toString() {
		String s = "";

		s += "Manufacturer: " + manufacturer + "\n";
		s += display + "\n";
		s += battery + "\n";
		s += antenna + "\n";
		s += speaker + "\n";
		s += "Battery consumption is: " + batteryConsumption + "\n";
		s += "Battery stauts is: " + baterryStatus + "\n";
		s += "Is on: " + isOn + "\n";

		return s;
	}

	/**
	 * Turns mobile phone on.
	 */
	public void turnOn() {
		isOn = true;
	}

	/**
	 * Turns mobile phone off.
	 */
	public void turnOff() {
		isOn = false;
	}

	/**
	 * Prints information about battery status.
	 * 
	 * @param time
	 */
	public void getMobileBaterryStatus(int time) {

		if (isOn == true) {
			baterryStatus -= batteryConsumption * time;
		}

		if (baterryStatus <= 0) {
			turnOff();
		}
	}

	/**
	 * Calculates the amount of battery consumption of mobile phone.
	 * 
	 * @return
	 */
	public int setBatteryConsumption() {
		if (display.getIsOn() == true) {
			this.batteryConsumption += display.getBatteryConsumption();
		}
		if (speaker.getIsOn() == true) {
			this.batteryConsumption += speaker.getBatteryConsumption();
		}
		return this.batteryConsumption;
	}

}
