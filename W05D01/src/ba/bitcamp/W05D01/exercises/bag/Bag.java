package ba.bitcamp.W05D01.exercises.bag;

public class Bag {

	// Declaration of properties of bag
	private int maxCapacity;
	private int currentCapacity;

	// Creating constructor
	public Bag(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		currentCapacity = 0;
	}

	/**
	 * Prints the max capacity of bag.
	 * 
	 * @return Max capacity of bag.
	 */
	public int getMaxCapacity() {
		return maxCapacity;
	}

	/**
	 * Prints the current capacity of bag.
	 * 
	 * @return CUrrent capacity of bag.
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * Adding new things into a bag. If the capacity of new things is larger
	 * than capacity that is left, does not add new things.
	 * 
	 * @param number
	 *            - Capacity of new things.
	 * @return Current capacity after new things are added.
	 */
	public int addCapacity(int number) {
		if (maxCapacity - currentCapacity >= number) {
			currentCapacity += number;
		}
		return currentCapacity;
	}

	/**
	 * Subtracting things from a bag. If the capacity of things that we want to
	 * subtract is larger than capacity that is left, does not subtract.
	 * 
	 * @param number
	 *            - Capacity of things that we want to subtract.
	 * @return Current capacity after things are subtracted.
	 */
	public int subtractCapacity(int number) {
		if (maxCapacity - currentCapacity <= number) {
			currentCapacity -= number;
		}
		return currentCapacity;
	}

	/**
	 * Calculates how much free capacity is left into a bag.
	 * 
	 * @return Capacity of free space into a bag.
	 */
	public int getFreeSpace() {
		return maxCapacity - currentCapacity;
	}

}
