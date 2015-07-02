package ba.bitcamp.w07d02_TimersAndKeyEvents.lectures;

import java.awt.Color;
import java.awt.Graphics;

public class Vehicle {
	public int x;
	public int y;
	public Color color;
	public boolean crached = false;
	public long crashTime;
	
	
	private static final int STEP = 5;
	private static final int WIDTH = 40;
	private static final int HEIGHT = 60;

	public Vehicle(int x, int y, Color color) {
		super();

		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void draw(Graphics g) {
		if (isCrashed()) {
			g.setColor(Color.RED);
		} else {
			g.setColor(color);
		}
		g.fillRect(x, y, WIDTH, HEIGHT);

	}

	public void moveLeft() {
		x -= STEP;
	}

	public void moveRight() {
		x += STEP;
	}

	public boolean colide(Vehicle other) {
		if (other.y + HEIGHT > y) {

			if (other.x < x && other.x + WIDTH > x) {
				return true;
			} else if (other.x > x && x + WIDTH > other.x) {
				return true;
			}
		}
		return false;
	}

	public boolean isCrashed() {
		if (crached) {
			if (System.currentTimeMillis() - crashTime > 3000) {
				crached = false;
			}
		}
		return crached;
	}

	public void crash() {
		crached = true;
		crashTime = System.currentTimeMillis();
	}
}
