package ba.bitcamp.homework23;

public class StringFormat {

	public static void main(String[] args) {

		// String str1 = "Adis %.3d";
		// //
		// System.out.println(str1.indexOf("%.") + 2);

		System.out.println(format("Adis %.9d sdsdsd %.7f", 123, 12356.55));

		// System.out.printf("Adis %.3d", 1235);
	}

	public static String format(String str, Object... o) {
		int counter = 0;
		String newString = "";

		for (int j = 0; j < str.length(); j++) {
			int index = 0;

			// Checking if the inputed value is Integer and if in the string is %.NUMBERd
			if (j < str.length() - 2) {
				if (str.substring(j, j + 2).equals("%.")) {
					index = str.indexOf("%.");
				}
				if (index >= 0
						&& str.substring(index + 3, index + 4).equals("d")
						&& (o[counter] instanceof Integer)) {
					int number = Integer.parseInt("" + str.charAt(index + 2));
					System.out.println(number);
					newString = "" + o[counter];
					if (number < newString.length()) {
						str = str.substring(0, j)
								+ newString.substring(0, number)
								+ str.substring(j + 4, str.length());
						counter++;
					} else {
						int division = number - newString.length();
						String zeros = "";
						for (int i = 0; i < division; i++) {
							zeros += 0;
						}
						newString = zeros + newString;
						str = str.substring(0, j) + newString
								+ str.substring(j + 4, str.length());
						counter++;
					}
				}
			} else {
				if (str.substring(str.length() - 2, str.length()).equals("%.")) {
					index = str.indexOf("%.");
				}
				if (index >= 0
						&& str.substring(index + 3, str.length()).equals("d")
						&& (o[counter] instanceof Integer)) {
					int number = Integer.parseInt("" + str.charAt(index + 2));
					System.out.println(number);
					newString = "" + o[counter];

					str = str.substring(0, str.length() - 2) + newString;
				}

			}

			// Checking if the inputed value is Integer and if in the string is %d
			if (j < str.length() - 2) {
				if (str.substring(j, j + 2).equals("%d")
						&& (o[counter] instanceof Integer)) {
					newString = "" + o[counter];

					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				}
			} else {
				if (str.substring(str.length() - 2, str.length()).equals("%d")
						&& (o[counter] instanceof Integer)) {
					newString = "" + o[counter];
					str = str.substring(0, str.length() - 2) + newString;
				}
			}
			
			
			
			// Checking if the inputed value is Double and if in the string is %.NUMBERf
			if (j < str.length() - 2) {
				if (str.substring(j, j + 2).equals("%.")) {
					index = str.indexOf("%.");
				}
				if (index >= 0
						&& str.substring(index + 3, index + 4).equals("f")
						&& ((o[counter] instanceof Double) || (o[counter] instanceof Integer))) {
					int number = Integer.parseInt("" + str.charAt(index + 2));
					newString = "" + o[counter];
					if (number < newString.substring(newString.indexOf("."), newString.length()).length()) {
						str = str.substring(0, j)
								+ newString.substring(0, newString.indexOf(".") + number + 1)
								+ str.substring(j + 4, str.length());
						counter++;
					} else {
						int division = number - newString.substring(newString.indexOf("."), newString.length()).length() + 1;
						String zeros = "";
						for (int i = 0; i < division; i++) {
							zeros += 0;
						}
						newString = newString + zeros;
						str = str.substring(0, j) + newString
								+ str.substring(j + 4, str.length());
						counter++;
					}
				}
			} else {
				if (str.substring(str.length() - 2, str.length()).equals("%.")) {
					index = str.indexOf("%.");
				}
				if (index >= 0
						&& str.substring(index + 3, str.length()).equals("f")
						&& ((o[counter] instanceof Double) || (o[counter] instanceof Integer))) {
					int number = Integer.parseInt("" + str.charAt(index + 2));
					newString = "" + o[counter];

					str = str.substring(0, str.length() - 2) + newString;
				}

			}

			// Checking if the inputed value is Double and if in the string is %f
			if (j < str.length() - 2) {
				if (str.substring(j, j + 2).equals("%f")
						&& ((o[counter] instanceof Double) || (o[counter] instanceof Integer))) {
					newString = "" + o[counter];

					str = str.substring(0, j) + newString
							+ str.substring(j + 2, str.length());
					counter++;
				}
			} else {
				if (str.substring(str.length() - 2, str.length()).equals("%f")
						&& ((o[counter] instanceof Double) || (o[counter] instanceof Integer))) {
					newString = "" + o[counter];
					str = str.substring(0, str.length() - 2) + newString;
				}
			}
			
		}

		return str;

	}

}
