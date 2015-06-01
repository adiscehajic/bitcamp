package exercises;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String link = in.nextLine();
		
		int counter = 0;
		
		for (int i = 0; i < link.length(); i++) {
			counter++;
			if(link.charAt(i) == '/') {
				break;
			}
			
			
		}
		
		System.out.println(counter);
		
		for (int i = counter + 1; i < link.length(); i++) {
			
			if(link.charAt(i) == '/'){
				break;
			}
			
			System.out.print(link.charAt(i));
			
		}	
			
			in.close();
			
		
	}

}
