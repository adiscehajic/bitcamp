package ba.bitcamp.w06d01.exercises.interfacee.task03;

public class Main {

	public static void main(String[] args) {
		
		Clock c = new Clock(12, 56, 12);

		c.addToFile("src/ba/bitcamp/w06d01/exercises/interfacee/task03/test.txt", Clock.AMPM_FORMAT);
		
	}
	
}
