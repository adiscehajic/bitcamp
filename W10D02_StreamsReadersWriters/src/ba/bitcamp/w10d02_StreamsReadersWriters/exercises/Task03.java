package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.LinkedList;

public class Task03 {


	public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", 52, 2000);
		Employee emp2 = new Employee("Phillip", 52, 2000);
		Employee emp3 = new Employee("", 52, 2000);
		Employee emp4 = new Employee("John", 52, 2000);
		Employee emp5 = new Employee("John", 52, 2000);
		
		LinkedList<Employee> employees = new LinkedList<Employee>();
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("task03.txt")));
			oos.writeObject(employees);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
