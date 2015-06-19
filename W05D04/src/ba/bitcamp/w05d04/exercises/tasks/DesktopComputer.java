package ba.bitcamp.w05d04.exercises.tasks;

/**
 * This class describes a desktop computer. It is a subclass StationaryComputer
 * class. These computers are intended for wide use.
 * 
 * @author adis.cehajic
 *
 */
public class DesktopComputer extends StationaryComputer {

	/*
	 * Declaring properties of desktop computer
	 */
	private Integer spaceForRAM;
	private Boolean isOverclock;
	private Boolean hasOpticalDrive;

	/**
	 * Constructor
	 * 
	 * @param systemName
	 * @param ram
	 * @param price
	 * @param processorSpeed
	 * @param powerPSU
	 * @param capacityHDD
	 * @param spaceForRAM
	 * @param isOverClock
	 * @param hasOpticalDrive
	 */
	public DesktopComputer(String systemName, Integer ram, Integer price,
			Integer processorSpeed, Integer powerPSU, Integer capacityHDD,
			Integer spaceForRAM, Boolean isOverClock, Boolean hasOpticalDrive) {
		super(systemName, ram, price, processorSpeed, powerPSU, capacityHDD);
		this.spaceForRAM = spaceForRAM;
		this.isOverclock = isOverClock;
		this.hasOpticalDrive = hasOpticalDrive;
	}

	/**
	 * Prints information about desktop computer
	 */
	public void printInformation() {
		super.printInformation();
		String s = "";
		s += "Space for RAM: " + spaceForRAM + "\n";
		s += "Overclock: " + isOverclock + "\n";
		s += "Has optical drive: " + hasOpticalDrive + "\n";

		System.out.println(s);
	}

	/**
	 * Printing information about desktop computer.
	 */
	public void printTypeInfo() {
		System.out.println("These computers are intended for wide use.");
	}

	/*
	 * Get methods
	 */
	public Integer getSpaceForRAM() {
		return spaceForRAM;
	}

	public void setSpaceForRAM(Integer spaceForRAM) {
		this.spaceForRAM = spaceForRAM;
	}

	public Boolean getIsOverclock() {
		return isOverclock;
	}

	/*
	 * Set methods
	 */
	public void setIsOverclock(Boolean isOverclock) {
		this.isOverclock = isOverclock;
	}

	public Boolean getHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(Boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

}
