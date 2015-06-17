package ba.bitcamp.w05d03.exercises.mobile;

import ba.bitcamp.w05d03.exercises.antenna.Antenna;
import ba.bitcamp.w05d03.exercises.battery.Battery;
import ba.bitcamp.w05d03.exercises.display.Display;
import ba.bitcamp.w05d03.exercises.speaker.Speaker;

public class Main {

	public static void main(String[] args) {

		Display displayOne = new Display("Samsung", 15);
		Battery batteryOne = new Battery("Samsung", 5);
		Antenna antennaOne = new Antenna("Samsung", 3);
		Speaker speakerOne = new Speaker("Samsung", 5, 5);

		Mobile mobileOne = new Mobile("Samsung", displayOne, batteryOne,
				antennaOne, speakerOne);
		
		mobileOne.turnOn();
		
		
		System.out.println(mobileOne);
		displayOne.turnOn();
		mobileOne.getMobileBaterryStatus(1);
		
		System.out.println(mobileOne);

	}

}
