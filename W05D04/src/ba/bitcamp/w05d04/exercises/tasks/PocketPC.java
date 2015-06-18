package ba.bitcamp.w05d04.exercises.tasks;

/**
 * This class describes a pocket pc. It is a subclass PortableComputer class.
 * These computers are intended for wide use, when portability matters.
 * 
 * @author adis.cehajic
 *
 */
public class PocketPC extends PortableComputer {

	/*
	 * Declaring properties of pocket pc
	 */
	private Boolean hasTouchInterface;
	private Boolean hasSIMCardSlot;
	private Boolean hasMicroSDCardSlot;

	/**
	 * Printing information about pocket pc.
	 */
	public void printTypeInfo() {
		System.out
				.println("These computers are intended for wide use, when portability matters.");
	}
	
	/*
	 * Get methods
	 */
	public Boolean getHasTouchInterface() {
		return hasTouchInterface;
	}

	public void setHasTouchInterface(Boolean hasTouchInterface) {
		this.hasTouchInterface = hasTouchInterface;
	}

	public Boolean getHasSIMCardSlot() {
		return hasSIMCardSlot;
	}

	/*
	 * Set methods
	 */
	public void setHasSIMCardSlot(Boolean hasSIMCardSlot) {
		this.hasSIMCardSlot = hasSIMCardSlot;
	}

	public Boolean getHasMicroSDCardSlot() {
		return hasMicroSDCardSlot;
	}

	public void setHasMicroSDCardSlot(Boolean hasMicroSDCardSlot) {
		this.hasMicroSDCardSlot = hasMicroSDCardSlot;
	}

}
