package ba.bitcamp.w10d03_Files.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task01 {

	public static void main(String[] args) {

		BufferedReader br = null;

		JFileChooser open = new JFileChooser();

		open.showOpenDialog(null);

		try {
			br = new BufferedReader(new FileReader(open.getSelectedFile()));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		
		try {
			br.readLine();
			while (br.ready()) {

				String line = br.readLine();

				StringTokenizer st = new StringTokenizer(line, ",");
				String name = st.nextToken();
				String surname = st.nextToken();
				String gender = st.nextToken();
				String position = st.nextToken();
				String salary = st.nextToken();
				
				Employee emp = new Employee(name, surname, gender, position, salary);
				list.add(emp);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Collections.sort(list);
		System.out.println(list);

	}

}
