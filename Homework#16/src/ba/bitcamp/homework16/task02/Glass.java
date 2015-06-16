package ba.bitcamp.homework16.task02;

public class Glass {

	// Declaring properties of glass
	private String typeOfLiquid;
	private int capacityLiquid;
	private int maxCapacityLiquid;

	/**
	 * Constructor
	 * 
	 * @param maxCapacityLiquid
	 */
	public Glass(int maxCapacityLiquid) {

		this.typeOfLiquid = null;
		this.capacityLiquid = 0;
		this.maxCapacityLiquid = maxCapacityLiquid;

	}

	/**
	 * Prints the content of glass.
	 */
	public String toString() {
		return String.format(
				"Type of liquid: %s\nCapacity: %d\nMax capacity: %d\n",
				typeOfLiquid, capacityLiquid, maxCapacityLiquid);
	}

	/**
	 * Prints the type of liquid in the glass.
	 * 
	 * @return Type of liquid in the glass.
	 */
	public String getTypeOfLiquid() {
		return typeOfLiquid;
	}

	/**
	 * Prints max capacity of the glass.
	 * 
	 * @return Max capacity of the glass.
	 */
	public int getMaxCapacity() {
		return maxCapacityLiquid;
	}

	/**
	 * Prints the capacity of the glass that is not filled with liquid.
	 * 
	 * @return Capacity of the glass that is not filled with liquid.
	 */
	public int getCurrentCapacity() {
		return maxCapacityLiquid - capacityLiquid;
	}

	/**
	 * Add type and amount of liquid into a glass.
	 * <p>
	 * If the type of liquid is same as type of liquid into a glass it adds
	 * amount of liquid to the liquid in the glass.
	 * 
	 * @param liquidType
	 *            - Type of liquid that user pouring into a glass.
	 * @param amountLiquid
	 *            - The amount of liquid that is poured.
	 */
	public void addLiquid(String liquidType, int amountLiquid) {
		if (this.typeOfLiquid == null || this.typeOfLiquid.equals(liquidType)) {
			this.typeOfLiquid = liquidType;
			this.capacityLiquid += amountLiquid;
			if (this.capacityLiquid > this.maxCapacityLiquid) {
				capacityLiquid = maxCapacityLiquid;
			}
		}
	}

	/**
	 * Spills all liquid from the glass.
	 * 
	 * @return - Sets capacity of liquid to 0.
	 */
	public void emptyGlass() {
		this.typeOfLiquid = null;
		this.capacityLiquid = 0;
	}

}
