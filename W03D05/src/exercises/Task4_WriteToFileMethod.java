package exercises;


public class Task4_WriteToFileMethod {

	public static void writeToFile(String filename, String msg) {
		
		TextIO.writeFile(filename);
		TextIO.putln(msg);
		
	}
	
	public static void main(String[] args) {

		writeToFile("test.txt", "BitCamp");
		
		
	}

}
