package ba.bitcamp.w10d03_Files.lectures;

import java.io.File;

public class Task01 {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.home") + "\n");
		
		File directory = new File("/Users/.localized");
		String[] files;
		
		if (directory.isDirectory() == false) {
			if (directory.exists() == false) {
				System.out.println("There is no such directory.");
			} else {
				System.out.println("The file is not a directory.");
			}
		} else {
			files = directory.list();
			System.out.println("Files in directory are:");
			for (int i = 0; i < files.length; i++)
				System.out.println(files[i]);
		}
	}
}
