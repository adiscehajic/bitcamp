package exercises;

public class ExtensionNameMethod {

	public static String getExtension(String filename) {
		String extension = "";

		int counter = 0;

		for (int i = 0; i < filename.length(); i++) {
			if (filename.charAt(i) == '.') {
				break;
			}
			counter++;
		}

		for (int i = counter; i < filename.length(); i++) {
			extension += filename.charAt(i);
		}

		return extension;
	}

	public static void main(String[] args) {

		String str = getExtension("movie.avi");

		System.out.println("Extension is: " + str);

	}

}
