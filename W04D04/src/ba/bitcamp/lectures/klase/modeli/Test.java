package ba.bitcamp.lectures.klase.modeli;

public class Test {

	public static void getOlderPerson(String[] p1, String[] p2) {

		if (Integer.parseInt(p1[2]) > Integer.parseInt(p2[2])) {
			printer(p2);
		} else {
			printer(p1);
		}

	}

	public static void printer(String[] printable) {
		System.out.println("Starija osoba je: ");
		System.out.println("Ime: " + printable[0]);
		System.out.println("Prezime: " + printable[1]);
		System.out.println("Godina rodjenja: " + printable[2]);
		System.out.println("Adresa stanovanja: " + printable[3]);
		System.out.println("Broj LK: " + printable[4]);
		System.out.println("Email: " + printable[10]);
	}

	public static void getOlderPersonObject(Person p1, Person p2) {
		Integer ageDiff;
		if (p1.yearOfBirth > p2.yearOfBirth) {
			ageDiff = p1.yearOfBirth - p2.yearOfBirth;
			//printerObject(p2, ageDiff);
			getStorie(p2, p1, ageDiff);
		} else {
			ageDiff = p2.yearOfBirth - p1.yearOfBirth;
			//printerObject(p1, ageDiff);
			getStorie(p1, p2, ageDiff);
		}
	}

	public static void printerObject(Person printable, Integer ageDiff) {
		System.out.println("Starija osoba je: ");
		System.out.println("Ime: " + printable.firstName);
		System.out.println("Prezime: " + printable.lastName);
		System.out.println("Godina rodjenja: " + printable.yearOfBirth);
		System.out.println("Adresa stanovanja: " + printable.address);
		System.out.println("Broj LK: " + printable.pesonalID);
		System.out.println("Email: " + printable.email);
		System.out.println("Razlika u godinama je: " + ageDiff);
	}

	public static void getStorie(Person p1, Person p2, Integer ageDiff) {

		System.out
				.printf("Osoba %s %s rodjena %d, koja zivi u %s ulici je starija %d godina od osobe %s %s, rodjene %d koja zivi u %s ulici.",
						p1.firstName, p1.lastName, p1.yearOfBirth, p1.address,
						ageDiff, p2.firstName, p2.lastName, p2.yearOfBirth,
						p2.address);

	}

}
