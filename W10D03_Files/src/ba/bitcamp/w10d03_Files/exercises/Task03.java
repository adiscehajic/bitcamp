package ba.bitcamp.w10d03_Files.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task03 {

	public static void main(String[] args) {

		BufferedReader br = null;
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		JFileChooser open = new JFileChooser();

		int option = open.showOpenDialog(null);

		int counter = 0;
		
		if (option == open.APPROVE_OPTION) {
			try {
				br = new BufferedReader(new FileReader(open.getSelectedFile()));

				while (br.ready()) {
					String line = br.readLine().replaceAll("[^\\x00-\\x7f]+", " - ");
					
					
					StringTokenizer st = new StringTokenizer(line, " ");
					
					while (st.hasMoreTokens()) {
						String number = st.nextToken();
						String numbers = "";
						if (number.length() < 7) {
							
							for (int i = 0; i < number.length(); i++) {
								Character digit = (char) number.charAt(i);
								if (Character.isDigit(digit)) {
									numbers += digit;
								} 								
								
							}
							if (!numbers.equals("")) {
								list.add(Integer.parseInt(numbers));
								counter++;
								
							}
						}
					} 

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println(counter);
			System.out.println(list);
			System.out.println(list.size());
		}

	}
}
