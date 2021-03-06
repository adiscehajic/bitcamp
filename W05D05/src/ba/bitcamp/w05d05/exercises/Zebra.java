package ba.bitcamp.w05d05.exercises;

public class Zebra extends Animal {

	/*
	 * Declaring constants of zebra state
	 */
	public static final int HEALTHY = 1;
	public static final int SICK = 2;
	public static final int DEADLY_SICK = 3;

	/*
	 * declaring properties of zebra
	 */
	private int age;
	private int state;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param weigth
	 * @param eating
	 * @param age
	 * @param state
	 */
	public Zebra(Boolean isAlive, int weigth, int eating, int age, int state) {
		super(isAlive, weigth, eating, 50);
		this.age = age;
		this.state = state;
	}

	/**
	 * Prints information about zebra
	 */
	public String toString() {
		String s = super.toString();
		s += "Age: " + age + "\n";
		if (state == 1) {
			s += "State: Healthy\n";
		} else if (state == 2) {
			s += "State: Sick\n";
		} else if (state == 3) {
			s += "State: Deadly sick\n";
		}
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
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	/*
	 * Get and set methods
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	/**
	 * Method enables zebra to eat plants.
	 * <p>
	 * If the inputed lifeform is not plant, print message. If the plant is
	 * poisonous than zebra gets sick, depending on how much is the plant
	 * poisonous.
	 */
	public void eat(LifeForm lf) {
		if (lf instanceof Plant) {

			Plant p = (Plant) lf;

			if (p.getIsPoisonous() == false) {
				this.state = HEALTHY;
			} else if (p.getIsPoisonous() == true) {
				this.setIsAlive(false);
			}
//			if (p.getQuantity() == p.FEW) {
//				this.state = SICK;
//			} else if (p.getQuantity() == p.MID) {
//				this.state = SICK;
//			} else if (p.getQuantity() == p.MUCH) {
//				this.state = DEADLY_SICK;
//			}
		} else {
			System.out.println("Zebra eats only plants!");
		}

	}

}
