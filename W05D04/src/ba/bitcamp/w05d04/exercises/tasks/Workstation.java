package ba.bitcamp.w05d04.exercises.tasks;

/**
 * This class describes a single workstation. It is a subclass
 * StationaryComputer class. These computers are much more complex than standard
 * computers. Workstations are intended for research and scientific work with
 * many calculations.
 * 
 * @author adis.cehajic
 *
 */
public class Workstation extends StationaryComputer {

	/*
	 * Declaring properties of workstation
	 */
	private Integer numberOfDisplays;
	private Integer numberOfProcessorCores;
	private Boolean hasECCMemory;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 * @param processorSpeed
	 * @param powerPSU
	 * @param capacityHDD
	 * @param numberOfDisplays
	 * @param numberOfProcessorCores
	 * @param hasECCMemory
	 */
	public Workstation(String systemName, Integer ram, Integer price,
			Integer processorSpeed, Integer powerPSU, Integer capacityHDD,
			Integer numberOfDisplays, Integer numberOfProcessorCores,
			Boolean hasECCMemory) {
		super(systemName, ram, price, processorSpeed, powerPSU, capacityHDD);
		this.numberOfDisplays = numberOfDisplays;
		this.numberOfProcessorCores = numberOfProcessorCores;
		this.hasECCMemory = hasECCMemory;
	}

	/**
	 * Prints information about workstation
	 */
	public void printInformation() {
		super.printInformation();
		String s = "";
		s += "Number of displays: " + numberOfDisplays + "\n";
		s += "Number of processor cores: " + numberOfProcessorCores + "\n";
		s += "Has ECC memory: " + hasECCMemory + "\n";

		System.out.println(s);
	}

	/**
	 * Printing information about workstations.
	 */
	public void printTypeInfo() {
		System.out
				.println("These computers are much more complex than standard computers. "
						+ "Workstations are intended for research and scientific work with "
						+ "many calculations.");
	}

	/*
	 * Get methods
	 */
	public Integer getNumberOfDisplays() {
		return numberOfDisplays;
	}

	public Integer getNumberOfProcessorCores() {
		return numberOfProcessorCores;
	}

	public Boolean getHasECCMemory() {
		return hasECCMemory;
	}

	/*
	 * Set methods
	 */
	public void setNumberOfDisplays(Integer numberOfDisplays) {
		this.numberOfDisplays = numberOfDisplays;
	}

	public void setNumberOfProcessorCores(Integer numberOfProcessorCores) {
		this.numberOfProcessorCores = numberOfProcessorCores;
	}

	public void setHasECCMemory(Boolean hasECCMemory) {
		this.hasECCMemory = hasECCMemory;
	}

}
