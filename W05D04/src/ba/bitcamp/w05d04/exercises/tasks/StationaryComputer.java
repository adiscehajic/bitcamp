package ba.bitcamp.w05d04.exercises.tasks;

/**
 * Represents one stationary computer and it is a subclass of class
 * PersonalComputer.
 * 
 * @author adis.cehajic
 *
 */
public abstract class StationaryComputer extends PersonalComputer {

	/*
	 * Declaring properties of stationary computer
	 */
	private Integer processorSpeed;
	private Integer powerPSU;
	private Integer capacityHDD;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 * @param processorSpeed
	 * @param powerPSU
	 * @param capacityHDD
	 */
	public StationaryComputer(String systemName, Integer ram, Integer price,
			Integer processorSpeed, Integer powerPSU, Integer capacityHDD) {
		super(systemName, ram, price);
		this.processorSpeed = processorSpeed;
		this.powerPSU = powerPSU;
		this.capacityHDD = capacityHDD;
	}

	/**
	 * Prints information about stationary computer
	 */
	public void printInformation() {
		super.printInformation();
		String s = "";
		s += "Processor speed: " + processorSpeed + "\n";
		s += "Power PSU: " + powerPSU + "\n";
		s += "Capacity HDD: " + capacityHDD;

		System.out.println(s);
	}

	/*
	 * Get methods
	 */
	public Integer getProcessorSpeed() {
		return processorSpeed;
	}

	public Integer getPowerPSU() {
		return powerPSU;
	}

	public Integer getCapacityHDD() {
		return capacityHDD;
	}

	/*
	 * Set methods
	 */
	public void setProcessorSpeed(Integer processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public void setPowerPSU(Integer powerPSU) {
		this.powerPSU = powerPSU;
	}

	public void setCapacityHDD(Integer capacityHDD) {
		this.capacityHDD = capacityHDD;
	}

}
