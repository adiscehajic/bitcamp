package ba.bitcamp.w05d02.lectures.point;

public class Point {

	// Declaring properties of point
	private int xCoord;
	private int yCoord;

	/**
	 * Constructor
	 * 
	 * @param xCoord
	 * @param yCoord
	 */
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	/**
	 * Prints the parameters of point.
	 */
	public String toString() {
		return String.format("(%d, %d)", xCoord, yCoord);
	}

	/**
	 * Calculates the distance between two points in the coordinate system.
	 * 
	 * @param second
	 *            - Point with which user calculate distance.
	 * @return Distance between two points.
	 */
	public double getDistance(Point second) {
		return Math.sqrt(Math.pow(this.xCoord - second.xCoord, 2)
				+ Math.pow(this.yCoord - second.yCoord, 2));
	}

	/**
	 * Compares two points and checks if there are equal.
	 * 
	 * @param second
	 *            - Point with which user compare first point.
	 * @return True if points are equal and false if the points are not equal.
	 */
	public boolean equals(Point second) {

		if (this.xCoord == second.xCoord && this.yCoord == second.yCoord) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Calculates the distance of the point from the origin.
	 * 
	 * @return Distance of the point from the origin.
	 */
	public double getDistanceFromOrigin() {
		return Math.sqrt(Math.pow(xCoord, 2) + Math.pow(yCoord, 2));
	}

	public int getXCoord() {
		return xCoord;
	}

	public int getYCoord() {
		return yCoord;
	}

	public void setXCoord(int x) {
		this.xCoord = x;
	}

	public void setYCoord(int y) {
		this.yCoord = y;
	}

}
