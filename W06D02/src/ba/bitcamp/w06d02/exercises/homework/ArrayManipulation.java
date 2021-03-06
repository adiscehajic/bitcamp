package ba.bitcamp.w06d02.exercises.homework;

public class ArrayManipulation {

	/**
	 * Extends inputed array for one element with value of null.
	 * 
	 * @param array
	 *            - An array that user wants to expand.
	 */
	public static Computer[] extendArray(Computer[] array) {

		Computer[] added = new Computer[array.length + 1];

		// Checks if the array is empty
		if (array[0] == null) {
			added[1] = null;
		} else {
			System.arraycopy(array, 0, added, 0, array.length);
			added[added.length - 1] = null;
		}
		return added;
	}

	/**
	 * Shrinks inputed array for element on inputed index.
	 * 
	 * @param array
	 *            - An array that user want to shrink.
	 * @param index
	 *            - Index on which user want to delete element.
	 */
	public static Computer[] shrinkArray(Computer[] array, int index) {
		Computer[] removed = new Computer[array.length - 1];

		for (int i = 0; i < removed.length; i++) {
			if (array[i] != array[index]) {
				removed[i] = array[i];
			}
		}
		return removed;
	}

}
