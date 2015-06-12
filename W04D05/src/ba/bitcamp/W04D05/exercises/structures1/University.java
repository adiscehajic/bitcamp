package ba.bitcamp.W04D05.exercises.structures1;

public class University {

	String name;
	String city;
	int yearOfConstruction;
	Faculty[] faculties;
	

	public String toString() {
		
		String s = ""; 
		s += "Name: " + name + "\n";
		s += "City: " + city + "\n";
		s += "Year of construction: " + yearOfConstruction + "\n";
		
		for (int i = 0; i < faculties.length; i++) {
			s += "\n" + faculties[i] + "\n";
		}
		
		return s;
		
	}
	
	
}
