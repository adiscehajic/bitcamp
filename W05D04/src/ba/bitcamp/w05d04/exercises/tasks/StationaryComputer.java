package ba.bitcamp.w05d04.exercises.tasks;

/**
 * Represents one stationary computer and it is a subclass of class
 * PersonalComputer.
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
