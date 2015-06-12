package ba.bitcamp.W04D05.exercises.structures1;

import java.util.Arrays;

public class Faculty {

	String name;
	Boolean isBologna;
	String[] departments;
	
	
	public String toString() {
		
		String s = "Name: " + name + "\n";
		s = s + "Bologna? " + isBologna + "\n";
		s = s + "Departments: " + Arrays.toString(departments);
		
		return s;
	}
	
	
}
