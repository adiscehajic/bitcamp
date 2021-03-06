package ba.bitcamp.w05d05.exercises;

public class Plant extends LifeForm {

	/*
	 * Declaring constants of plant poison quantity
	 */
	public static final int FEW = 1;
	public static final int MID = 2;
	public static final int MUCH = 3;

	/*
	 * Declaring properties of plant
	 */
	private Boolean isPoisonous;
	private int quantity;
	

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param isPoisonous
	 * @param quantity
	 */
	public Plant(Boolean isAlive, Boolean isPoisonous, int quantity) {
		super(isAlive);
		this.isPoisonous = isPoisonous;
		this.quantity = quantity;
	}

	/**
	 * Prints information about plant
	 */
	public String toString() {
		String s = super.toString();
		s += "Is poisonous: " + isPoisonous + "\n";
		s += "Quantity: " + quantity + "\n";
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plant other = (Plant) obj;
		if (isPoisonous == null) {
			if (other.isPoisonous != null)
				return false;
		} else if (!isPoisonous.equals(other.isPoisonous))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	/*
	 * Get and set methods
	 */
	public Boolean getIsPoisonous() {
		return isPoisonous;
	}

	public void setIsPoisonous(Boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
