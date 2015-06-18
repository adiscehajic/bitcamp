package ba.bitcamp.w05d04.exercises.inheritance;

public class Main {

	public static void main(String[] args) {

		University u = new University();
		u.location = "Hrasnicka cesta 17";
		u.area = 500;
		u.population = 1200;
		u.name = "IUS";
		u.isItPublic = false;
		u.numberOIfFaculties = 3;
		u.numberOfStaff = 200;

		Hospital h = new Hospital();
		h.area = 100;
		h.hasCTMashine = false;
		h.isItPublic = false;
		h.location = "Adresa 1";
		h.numberOfBeds = 10;
		h.numberOfSurgeons = 1;
		h.population = 50;

		Jail j = new Jail();
		j.area = 1000;
		j.location = "Adresa 2";
		j.population = 70;
		j.hasGym = true;
		j.numberOfCells = 50;
		j.numberOfFreeCells = 30;
		
	}

}
