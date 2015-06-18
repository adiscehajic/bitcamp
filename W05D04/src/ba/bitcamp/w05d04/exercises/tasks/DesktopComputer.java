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
