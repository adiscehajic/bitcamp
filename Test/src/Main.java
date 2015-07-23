import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Exhibit> exhibits = new ArrayList<Exhibit>();

		// Creating exhibits
		Exhibit e1 = new Exhibit("Paintwork1", "desc1");
		Exhibit e2 = new Exhibit("Paintwork2", "desc 2");
		Exhibit e3 = new Exhibit("Paintwork3", "desc 2");

		// Creating artworks
		Artwork a1 = new Artwork("Picture 1", "desc1", "Picasso",
				Artwork.Period.CONTEMPORARY_ART);
		Artwork a2 = new Artwork("Picture 2", "desc21", "Rembrant",
				Artwork.Period.MODERN_ART);
		Artwork a3 = new Artwork("Picture 3", "desc21", "Van Gogh",
				Artwork.Period.NEOCLASSIC);
		Artwork a4 = new Artwork("Picture 4", "desc21", "Michellangelo",
				Artwork.Period.RENASCENCE);

		// Creating artefacts
		Artefact art1 = new Artefact("Statue", "Statue", "Egipt",
				Artefact.Period.MIDDLE_AGE);
		Artefact art2 = new Artefact("Steal", "Steal", "Egipt",
				Artefact.Period.MIDDLE_AGE);
		Artefact art3 = new Artefact("Monolit", "Monolit", "Egipt",
				Artefact.Period.MIDDLE_AGE);
		Artefact art4 = new Artefact("Obelisk", "Obelisk", "Egipt",
				Artefact.Period.MIDDLE_AGE);

		// Adding all to the exhibit list.
		exhibits.add(e1);
		exhibits.add(e3);
		exhibits.add(e2);
		exhibits.add(a1);
		exhibits.add(a2);
		exhibits.add(a3);
		exhibits.add(a4);
		exhibits.add(art1);
		exhibits.add(art2);
		exhibits.add(art3);
		exhibits.add(art4);

		System.out.println(a1.fitsSearch("picture"));

		// Sorting all elements by name.
		Collections.sort(exhibits);

		// Creating employees.
		Employee emp1 = new Employee("John", "Doe", Employee.MALE, 1950.00,
				Employee.Position.CONSERVATOR);
		Employee emp2 = new Employee("Mike", "Mayers", Employee.MALE, 1500.00,
				Employee.Position.ADMINISTRATOR);
		Employee emp3 = new Employee("Max", "Zerdo", Employee.MALE, 700.00,
				Employee.Position.INTERN);
		Employee emp4 = new Employee("Steve", "Livingston", Employee.MALE,
				1700.00, Employee.Position.CURATOR);
		Employee emp5 = new Employee("Lara", "Doe", Employee.FEMALE, 2000.00,
				Employee.Position.DIRECTOR);

		ArrayList<Employee> employees = new ArrayList<Employee>();

		// Adding employees to the list.
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		// Creating museum.
		Museum museum = new Museum("Earth museum", exhibits, employees);

		// Printing museum.
		System.out.println(museum);
		System.out.println();

		// Searches all exhibits and employees that have inputed string.
		museum.search("l");

	}
}
