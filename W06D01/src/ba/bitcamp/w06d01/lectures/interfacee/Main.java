package ba.bitcamp.w06d01.lectures.interfacee;

public class Main {

	public static void main(String[] args) {

		Foo[] foos = new Foo[5];

		for (int i = 0; i < foos.length; i++) {
			foos[i] = new Foo(i + 1);
		}

		System.out.println(getMax(foos));

		Bar[] bars = new Bar[3];
		bars[0] = new Bar("A");
		bars[1] = new Bar("AB");
		bars[2] = new Bar("ABC");
		
		System.out.println(getMax(bars));

	}

	/**
	 * Printing the max value of foo in an array of foos.
	 * 
	 * @param foos
	 *            - An array of foos.
	 * @return The value of max foo.
	 */
	public static Compare getMax(Compare[] array) {

		Compare max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max.compare(array[i]) == -1) {
				max = array[i];
			}
		}

		return max;
	}

//	/**
//	 * Printing the bar that has the longest name length.
//	 * 
//	 * @param bars
//	 *            - An array of bars.
//	 * @return The bar with longest name length.
//	 */
//	public static Bar getMax(Bar[] bars) {
//		Bar max = bars[0];
//		for (int i = 0; i < bars.length; i++) {
//			if (max.compare(bars[i]) == -1) {
//				max = bars[i];
//			}
//		}
//		return max;
//	}

}
