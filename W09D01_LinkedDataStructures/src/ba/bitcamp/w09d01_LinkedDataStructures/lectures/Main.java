package ba.bitcamp.w09d01_LinkedDataStructures.lectures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// System.out
		// .println("Insert destination from where you want to travel: ");
		// Place placeFrom = new Place(in.nextLine());
		//
		// System.out.println("Insert destination to where you want to travel: ");
		// Place placeTo = new Place(in.nextLine());
		//
		// Trip userTrip = new Trip(placeFrom, placeTo);
		//
		// System.out.println("\nYour desired trip is: \n" + userTrip);
		//
		
		Trip trip = new Trip();

		System.out.println("Insert places that you want to visit: ");
		while (true) {
			String destination = in.nextLine();
			if (!destination.equals("")) {
				trip.add(new Place(destination));			
			} else {
				break;
			}
		}

		System.out.printf("You want to visit places: \n%s",
		trip);

		in.close();
	}
}
