package ba.bitcamp.w05d04.exercises.tasks;

/**
 * This class describes a laptop. It is a subclass PortableComputer class. These
 * computers are intended for wide use, when portability matters.
 * 
 * @author adis.cehajic
 *
 */
public class Laptop extends PortableComputer {

	/*
	 * Declaring properties of laptop
	 */
	private Integer batteryCells;
	private Boolean hasBluetooth;
	private Boolean hasNumericalKeyboard;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 * @param weigth
	 * @param displaySize
	 * @param hasWiFi
	 * @param batteryCells
	 * @param hasBluetooth
	 * @param hasNumericalKeyboard
	 */
	public Laptop(String systemName, Integer ram, Integer price,
			Integer weigth, Integer displaySize, Boolean hasWiFi,
			Integer batteryCells, Boolean hasBluetooth,
			Boolean hasNumericalKeyboard) {
		super(systemName, ram, price, weigth, displaySize, hasWiFi);
		this.batteryCells = batteryCells;
		this.hasBluetooth = hasBluetooth;
		this.hasNumericalKeyboard = hasNumericalKeyboard;
	}

	/**
	 * Prints information about laptop
	 */
	public void printInformation() {
		super.printInformation();
		String s = "";
		s += "Battery cells: " + batteryCells + "\n";
		s += "Bluetooth: " + hasBluetooth + "\n";
		s += "Numerical keyboard: " + hasNumericalKeyboard + "\n";

		System.out.println(s);
	}

	/**
	 * Printing information about laptop.
	 */
	public void printTypeInfo() {
		System.out
				.println("These computers are intended for wide use, when portability matters.");
	}

	/*
	 * Get methods
	 */
	public Integer getBatteryCells() {
		return batteryCells;
	}

	public void setBatteryCells(Integer batteryCells) {
		this.batteryCells = batteryCells;
	}

	public Boolean getHasBluetooth() {
		return hasBluetooth;
	}

	/*
	 * Set methods
	 */
	public void setHasBluetooth(Boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public Boolean getHasNumericalKeyboard() {
		return hasNumericalKeyboard;
	}

	public void setHasNumericalKeyboard(Boolean hasNumericalKeyboard) {
		this.hasNumericalKeyboard = hasNumericalKeyboard;
	}

}
