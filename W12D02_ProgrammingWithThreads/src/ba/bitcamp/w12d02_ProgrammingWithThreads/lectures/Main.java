package ba.bitcamp.w12d02_ProgrammingWithThreads.lectures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {

		try {
			JFileChooser file = new JFileChooser();
			file.showOpenDialog(null);
			
			BufferedReader reader = new BufferedReader(new FileReader(file.getSelectedFile()));

			Scanner input = new Scanner(System.in);

			System.out.println("Please insert word: ");
			String word = input.nextLine();
			int lineCounter = 0;
			
			while (reader.ready()) {
				String line = reader.readLine();
				lineCounter++;
				if (line.contains(word)) {
					System.out.println("Row number: " + lineCounter + " *** Row content: " + line);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
