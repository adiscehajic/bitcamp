package ba.bitcamp.w05d04.exercises.tasks;

public abstract class PersonalComputer {

	/*
	 * Declaring properties of personal computer
	 */
	private String systemName;
	private Integer ram;
	private Integer price;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 */
	public PersonalComputer(String systemName, Integer ram, Integer price) {
		super();
		this.systemName = systemName;
		this.ram = ram;
		this.price = price;
	}

	/**
	 * Prints information about personal computer
	 */
	public void printInformation() {
		String s = "";
		s += "System name: " + systemName + "\n";
		s += "RAM: " + ram + "\n";
		s += "Price: " + price;

		System.out.println(s);
	}

	/*
	 * Get methods
	 */
	public String getSystemName() {
		return systemName;
	}

	public Integer getRam() {
		return ram;
	}

	public Integer getPrice() {
		return price;
	}

	/*
	 * Set methods
	 */

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

}
