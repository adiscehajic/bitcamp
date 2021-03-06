package ba.bitcamp.w06d01.exercises.interfacee.task01;

public class Line implements Shape, Drawable {

	private int length;

	/**
	 * Constructor
	 * 
	 * @param length
	 */
	public Line(int length) {
		super();
		this.length = length;
	}

	/*
	 * Get and set methods
	 */
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * Draws line on console.
	 */
	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("*");
		}
		
	}

	/**
	 * Calculates the circumference of line.
	 */
	@Override
	public int getCircumference() {
		return 0;
	}

	/**
	 * Calculates the area of line.
	 */
	@Override
	public int getArea() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}
	
	

}
