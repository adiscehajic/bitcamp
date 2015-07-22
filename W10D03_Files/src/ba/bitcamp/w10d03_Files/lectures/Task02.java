package ba.bitcamp.w10d03_Files.lectures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Task02 {

	public static void main(String[] args) {

//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (InstantiationException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IllegalAccessException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (UnsupportedLookAndFeelException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		JFileChooser fileChooser = new JFileChooser(
				System.getProperty("user.home"));

		int option = fileChooser.showOpenDialog(null);

		File file = null;

		if (option == fileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();

			Scanner in;
			try {
				in = new Scanner(file);
				while (in.hasNext()) {
					System.out.println(in.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
