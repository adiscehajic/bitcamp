package task01;

public class Main {

	public static void main(String[] args) {
		
		char[] characters = {'p', 'o', 'i', 'n', 't'};
		
		CampStringBuilder c = new CampStringBuilder(characters);
		
		c.append("of");
		c.preppend("of");
		System.out.println(c.toString());
		
	}
	
	
}