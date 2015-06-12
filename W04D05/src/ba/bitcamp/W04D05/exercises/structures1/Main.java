package ba.bitcamp.W04D05.exercises.structures1;

public class Main {

	public static void main(String[] args) {
		
		University u1 = new University();
		
		u1.name = "UNSA";
		u1.city = "Sarajevo";
		u1.yearOfConstruction = 1949;
		
		u1.faculties = new Faculty[3];
		
		u1.faculties[0] = new Faculty();
		u1.faculties[0].name = "Pravni fakultet";
		u1.faculties[0].isBologna = true;
		u1.faculties[0].departments = new String[2];
		u1.faculties[0].departments[0] = "Krivicno pravo";
		u1.faculties[0].departments[1] = "Notarski odsjek";		
		
		u1.faculties[1] = new Faculty();
		u1.faculties[1].name = "Elektrotehnicki fakultet";
		u1.faculties[1].isBologna = true;
		u1.faculties[1].departments = new String[2];
		u1.faculties[1].departments[0] = "Telekomunikacije";
		u1.faculties[1].departments[1] = "Elektroenergetika";
		
		
		System.out.println(u1);
	

	}
	
	
}
