package ba.bitcamp.w06d01.exercises.interfacee.task04;

public class StringBuilderCamp {

	char[] array;

	/**
	 * Constructor
	 */
	public StringBuilderCamp() {
		super();
		array = new char[0];
	}

	/**
	 * Converts an array of character into a string and prints.
	 */
	public String toString() {
		String s = "";

		for (int i = 0; i < array.length; i++) {
			s += array[i];
		}

		return s;
	}

	public void append(Object o) {
		String s = o.toString();
		
		//char[] newChar = new char[]
	}
	
	
	static class StringBuilderCampHelp {

		/**
		 * Increases an array for inputed number of elements.
		 * 
		 * @param number
		 *            - A number of elements for which user wants to increase an
		 */
		public static char[] increase(char[] array, int number) {

			char[] newChar = new char[array.length + number];

			array = newChar;

			return array;
		}

		/**
		 * Inputs the string in the char array on wanted position.
		 * 
		 * @param array
		 *            - An array in which user want to put an string.
		 * @param str
		 *            - String that user want to input in an array.
		 * @param position
		 *            - Position on which user want to input string.
		 * @return An array with inputed string.
		 */
		public static char[] offset(char[] array, String str, int position) {

			char[] newChar = new char[array.length + str.length()];

			int offset = str.length() + position;

			for (int i = 0; i < array.length; i++) {
				if (i < position) {
					newChar[i] = array[i];
				} else if (i >= position) {
					newChar[offset++] = array[i];
				}
			}

			for (int i = position; i < position + str.length(); i++) {
				newChar[i] = str.charAt(i - position);
			}

			array = newChar;

			return array;
		}

		/**
		 * Moves all element in an array for one index in the .
		 * 
		 * @param array
		 * @return
		 */
		public static char[] shift(char[] array) {

			char[] newChar = new char[array.length];

			for (int i = 0; i < newChar.length; i++) {
				if (i < array.length - 1) {
					newChar[i + 1] = array[i];
				} else {
					newChar[0] = array[array.length - 1];
				}
			}

			array = newChar;

			return array;
		}

	}

}
