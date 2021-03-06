package ba.bitcamp.w05d05.exercises;

public abstract class LifeForm {

	/*
	 * Declaring properties of lifeform
	 */
	private Boolean isAlive;

	/**
	 * Constructor
	 * 
	 * @param isAlive - Is the animal alive
	 */
	public LifeForm(Boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	/**
	 * Prints information about lifeform
	 */
	public String toString(){
		String s = "";
		s += "Is alive: " + isAlive + "\n";
		return s;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive == null) {
			if (other.isAlive != null)
				return false;
		} else if (!isAlive.equals(other.isAlive))
			return false;
		return true;
	}

	/*
	 * Get and set methods
	 */
	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

}
