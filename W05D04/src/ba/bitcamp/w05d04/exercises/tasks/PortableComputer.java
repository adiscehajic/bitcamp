package ba.bitcamp.w05d04.exercises.tasks;

/**
 * Represents one portable computer and it is a subclass of class
 * PersonalComputer.
 * 
 * @author adis.cehajic
 *
 */
public abstract class PortableComputer extends PersonalComputer {

	/*
	 * Declaring properties of portable computer
	 */
	private Integer weight;
	private Integer displaySize;
	private Boolean hasWiFi;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 * @param weigth
	 * @param displaySize
	 * @param hasWiFi
	 */
	public PortableComputer(String systemName, Integer ram, Integer price,
			Integer weigth, Integer displaySize, Boolean hasWiFi) {
		super(systemName, ram, price);
		this.weight = weigth;
		this.displaySize = displaySize;
		this.hasWiFi = hasWiFi;
	}

	/**
	 * Prints information about portable computer
	 */
	public void printInformation() {
		super.printInformation();
		String s = "";
		s += "Weight: " + weight + "\n";
		s += "Display size: " + displaySize + "\n";
		s += "Has WiFi: " + hasWiFi;

		System.out.println(s);
	}

	/*
	 * Get methods
	 */
	public Integer getWeight() {
		return weight;
	}

	public Integer getDisplaySize() {
		return displaySize;
	}

	public Boolean getHasWiFi() {
		return hasWiFi;
	}

	/*
	 * Set methods
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public void setDisplaySize(Integer displaySize) {
		this.displaySize = displaySize;
	}

	public void setHasWiFi(Boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}

}
