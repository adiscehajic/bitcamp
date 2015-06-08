package exercises;

import java.awt.Font;

public class Task2_FontDetails {

	public static void main(String[] args) {
		Font f = new Font("Arial", Font.ITALIC, 19);
		
		printFontDetails(f);
		
	}
	
	/**
	 * Prints details of created font object.
	 * 
	 * @param f - Type font object
	 * @throws NullPointerException If parameter f is null.
	 */
	public static void printFontDetails(Font f){	
		
		System.out.println(f.getSize());
		System.out.println(f.isItalic());
		System.out.println(f.getFontName());	
	}
	
}
