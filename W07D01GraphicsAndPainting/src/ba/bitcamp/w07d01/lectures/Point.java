package ba.bitcamp.w07d01.lectures;

import java.awt.Color;

public class Point {

	public static final int FIRST = 5;
	public static final int SECOND = 10;
	public static final int THIRD = 20;
	
	private int x;
	private int y;
	private int size;
	
	private Color color;
	
	public Point(int x, int y, int size, Color color){
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
}
