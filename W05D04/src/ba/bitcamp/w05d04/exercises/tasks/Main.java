package ba.bitcamp.w05d04.exercises.tasks;

public class Main {

	public static void main(String[] args) {

		DesktopComputer d = new DesktopComputer("Linux", 8, 1800, 4, 5, 2, 4, true, true);
		Laptop l = new Laptop("Windows", 4, 1500, 3, 17, true, 4, true, true);
		PocketPC p = new PocketPC("Windows", 8, 2000, 1, 10, true, true, false, false);
		Workstation w = new Workstation("Linux", 50, 10000, 15, 10, 50, 10, 20, true);

		d.printInformation();
		l.printInformation();
		p.printInformation();
		w.printInformation();

	}

}
