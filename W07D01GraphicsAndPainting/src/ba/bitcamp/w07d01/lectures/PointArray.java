package ba.bitcamp.w07d01.lectures;

public class PointArray {

	private Point[] points;
	private int length;

	public PointArray() {
		this.points = new Point[10];
		this.length = 0;
	}

	/**
	 * Add point to the points array.
	 * 
	 * @param p
	 */
	public void addPoint(Point p) {
		if (length == points.length) {
			resize();
		}
		this.points[length++] = p;
	}

	public int getLength() {
		return length;
	}

	public Point elementAt(int index) {
		return points[index];
	}

	/**
	 * Resizes the length of points array.
	 */
	public void resize() {
		Point[] temp = new Point[points.length * 2];
		for (int i = 0; i < points.length; i++) {
			temp[i] = points[i];
		}
		points = temp;
	}

}
