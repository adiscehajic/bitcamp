package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Task03Test {
	
	public static void main(String[] args) {

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("task03.txt")));
			
			LinkedList<Employee> list = (LinkedList<Employee>) ois.readObject();
			
			System.out.println(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
