package ba.bitcamp.w05d03.exercises.battery;

public class Main {

	public static void main(String[] args) {

		// Creating object battery
		Battery batteryOne = new Battery("Samsung", 5);

		// Printing battery status
		System.out.println(batteryOne);

		// Charging battery
		batteryOne.chargeBattery(15);

		// Printing battery status
		System.out.println(batteryOne);

		// Decreasing battery
		batteryOne.decreaseBatteryStatus(13);

		// Printing battery status
		System.out.println(batteryOne);
	}

}
