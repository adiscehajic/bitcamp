package ba.bitcamp.w05d02.lectures.point;

public class Circle {

	// Declaring properties of circle
	private Point center;
	private int radius;

	/**
	 * Constructor
	 * 
	 * @param center
	 * @param radius
	 */
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	/**
	 * Checks if the one circle intersects with another.
	 * <p>
	 * Two circles intersects if the distance between them is smaller than sum
	 * of their radiuses.
	 * 
	 * @param second
	 *            - Circle with user compares.
	 * @return True if the two circles does intersect and false if two circles
	 *         does not intersect.
	 */
	public boolean intersect(Circle second) {

		if (center.getDistance(second.center) > (this.radius + second.radius)) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * Prints the circle.
	 */
	public String toString() {
		return String.format("Circle has center %s and radius %d", center,
				radius);
	}

	/**
	 * Calculates if the two circles are equal.
	 * 
	 * @param other
	 *            - Circle with whom user compares first circle.
	 * @return True if the circles are equal and false if the circles are not
	 *         equal.
	 */
	public boolean equals(Circle other) {
		if (this.center.equals(other.center) && this.radius == other.radius) {
			return true;
		} else {
			return false;
		}
	}

	public Point getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}

	public void setCenter(Point other) {
		this.center = other;
	}

	public void setRadius(int other) {
		this.radius = other;
	}
}
