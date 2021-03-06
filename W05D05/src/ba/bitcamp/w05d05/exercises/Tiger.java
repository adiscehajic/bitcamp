package ba.bitcamp.w05d05.exercises;

public class Tiger extends Animal {

	/*
	 * Declaring constants of tiger state
	 */
	public static final int STANDSTILL = 1;
	public static final int HUNTING = 2;
	public static final int EATING = 3;

	/*
	 * declaring properties of tiger
	 */
	private int speed;
	private int state;

	/**
	 * Constructor
	 * 
	 * @param isAlive
	 * @param weigth
	 * @param eating
	 * @param speed
	 * @param state
	 */
	public Tiger(Boolean isAlive, int weigth, int eating, int speed, int state) {
		super(isAlive, weigth, eating, 50);
		this.speed = speed;
		this.state = state;
	}

	/**
	 * Prints information about tiger
	 */
	public String toString() {
		String s = super.toString();
		s += "Speed: " + speed + "\n";
		if (state == 1) {
			s += "State: Standstill\n";
		} else if (state == 2) {
			s += "State: Hunting\n";
		} else if (state == 3) {
			s += "State: Eating\n";
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
		Tiger other = (Tiger) obj;
		if (speed != other.speed)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	/*
	 * Get and set methods
	 */
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	/**
	 * Method enables tiger to eat animals.
	 * <p>
	 * If the inputed lifeform is not animal or if it is a tiger, print message.
	 * If the animal is sick than tiger dies.
	 */
	public void eat(LifeForm lf) {
		if (lf instanceof Animal && !(lf instanceof Tiger)
				&& this.getIsAlive() == true) {
			if (this.state == HUNTING) {
				this.state = EATING;
			} else if (this.state == STANDSTILL) {
				System.out.println("Tiger is resting!");
			} else if (this.state == EATING) {
				System.out.println("Tiger is already eating!");
			}

			Zebra z = (Zebra) lf;

			if (z.getState() == Zebra.DEADLY_SICK || z.getState() == Zebra.SICK) {
				this.setHealthIndex(-(z.getWeight()/2));
			} else if (z.getState() == Zebra.HEALTHY){
				this.setHealthIndex(z.getWeight()/10);
			}
			
		} else if (this.getIsAlive() == false) {
			System.out.println("Tiger is dead!");
		} else {
			System.out.println("Can't eat same spicies!");
		}
	}

}
