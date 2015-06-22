package ba.bitcamp.w06d01.exercises.interfacee.task01;

public class Rectangle implements Shape, Drawable {

	private int width;
	private int length;

	/**
	 * Constructor
	 * 
	 * @param width
	 * @param lenght
	 */
	public Rectangle(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	/*
	 * Get and set methods
	 */
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLenght(int length) {
		this.length = length;
	}

	/**
	 * Draws rectangle on console.
	 */
	@Override
	public void drawOnConsole() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/**
	 * Calculates the circumference of the rectangle.
	 */
	@Override
	public int getCircumference() {
		return 2 * width + 2 * length;
	}

	/**
	 * Calculates the area of the rectangle.
	 */
	@Override
	public int getArea() {
		return width * length;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	

}
