import java.awt.Color;
import java.awt.Graphics;

public class Obstacles {

	private int x;
	private int y;
	private int gameWidth;
	private int gameHeight;
	private int obstacleHeigth = 100 + (int) (Math.random() * 200);
	private int resetPosition;
	private Color color;
	
	private boolean isUp;

	public Obstacles(int x, int y, int gameWidth, int gameHeight,
			int resetPosition, boolean isUp) {
		this.x = x;
		this.y = y;
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		this.resetPosition = resetPosition;
		this.isUp = isUp;
		// resetPosition();
	}

	public void resetPosition() {
		if (isUp) {
			x = gameWidth + resetPosition;
			y = 0;
		} else {
			x = gameWidth + resetPosition;
			y = gameHeight - obstacleHeigth;
		}
	}

	public void move() {
		if (x > -(150)) {
			x -= 5;
		} else {
			obstacleHeigth = 100 + (int) (Math.random() * 200);
			resetPosition();
		}
	}

	public void draw(Graphics g) {
		System.out.println(obstacleHeigth);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x, y, 150, obstacleHeigth);
	}

}
