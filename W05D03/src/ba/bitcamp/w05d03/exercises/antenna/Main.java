package ba.bitcamp.w05d03.exercises.antenna;

public class Main {

	public static void main(String[] args) {
		
		// Creating object antenna
		Antenna antennaOne = new Antenna("Samsung", 5);
		
		// Printing information about antenna
		System.out.println(antennaOne);
		
		// Setting signal strength
		antennaOne.setSignalStrength(0);
		
		// Printing information about antenna
		System.out.println(antennaOne);
		
		// Checking if the inputed signal is ok
		System.out.println("Are the inputed signal and message ok? " + antennaOne.isSignalOk(3, "SMS38761849315"));
		
	}
	
}
