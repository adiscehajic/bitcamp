package ba.bitcamp.w10d02_StreamsReadersWriters.lectures;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


public class MainUser {
	public static void main(String[] args) {

		User u = new User("John", 26);

		OutputStream os;
		try {
			os = new FileOutputStream("user.dat", true);
			InputStream is = new FileInputStream("user.dat");
			ObjectOutputStream osw = new ObjectOutputStream(os);
			osw.writeObject(u);
			
			ObjectInputStream ois = new ObjectInputStream(is);
			User fromFile = (User) ois.readObject();
			
			System.out.println(fromFile);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
