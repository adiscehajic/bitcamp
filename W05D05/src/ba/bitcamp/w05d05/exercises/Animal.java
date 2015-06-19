package ba.bitcamp.w05d05.exercises;

public abstract class Animal extends LifeForm {

	/*
	 * Declaring constants of what animal eats
	 */
	public static final int CARNIVORE = 1;
	public static final int HERBIVORE = 2;

	public static final int MIN_HEALTH_INDEX = 0;
	public static final int MAX_HEALTH_INDEX = 100;

	/*
	 * Declaring properties of animal
	 */
	private int weight;
	private int eating;
	private int healthIndex;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param weigth
	 * @param eating
	 */
	public Animal(Boolean isAlive, int weigth, int eating, int healthIndex) {
		super(isAlive);
		this.healthIndex = healthIndex;
		this.weight = weigth;
		this.eating = eating;
	}

	/**
	 * Prints information about animal
	 */
	public String toString() {
		String s = super.toString();
		s += "Weight: " + weight + "\n";
		if (eating == 1) {
			s += "Eating: Carnivore\n";
		} else if (eating == 2) {
			s += "Eating: Herbivore\n";
		}
		s += "Health index: " + healthIndex + "\n";

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
		Animal other = (Animal) obj;
		if (eating != other.eating)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	/*
	 * Get and set methods
	 */
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getEating() {
		return eating;
	}

	public void setEating(int eating) {
		this.eating = eating;
	}

	public int getHealthIndex() {
		return healthIndex;
	}

	public void setHealthIndex(int healthIndex) {
		this.healthIndex += healthIndex;
		
		if (this.healthIndex > MAX_HEALTH_INDEX) {
			this.healthIndex = MAX_HEALTH_INDEX;
		} else if (this.healthIndex < MIN_HEALTH_INDEX) {
			this.healthIndex = MIN_HEALTH_INDEX;
			this.setIsAlive(false);
		}

	}

	public abstract void eat(LifeForm lf);

}
