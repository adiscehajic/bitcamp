package ba.bitcamp.W04D04.exercises;

import java.lang.ProcessBuilder.Redirect;

public class Task3_StudentBook {

	public static void main(String[] args) {

		String filename1 = "src/ba/bitcamp/W04D04/exercises/grades.in";
		String filename2 = "src/ba/bitcamp/W04D04/exercises/courses.in";

		TextIO.readFile(filename1);
		int counter = 0;
		for (int i = 0; i < 10; i++) {
						
			
			System.out.print("(" + TextIO.getlnInt()+ ") ");
//			TextIO.readFile(filename2);
//			System.out.println(TextIO.getln());
		} 
		
		//readGrades(filename1);
	}
	
	/**
	 * Reads grades from file Grades
	 * @param filename Location of a file Grades
	 */
	public static void readGrades(String filename){
		
		TextIO.readFile(filename);

			int counter = 0;
			while (counter <= 10) {
				System.out.println("(" + TextIO.getInt()+ ")");
				
				counter++;
			}
		
		TextIO.readStandardInput();
	}
	
	public static void readCourses(String filename) {
		
		TextIO.readFile(filename);

		int counter = 0;
		while (counter < 10) {
			System.out.println(TextIO.getln());
			
			counter++;
		}
	
	TextIO.readStandardInput();
		
		
	}

}
