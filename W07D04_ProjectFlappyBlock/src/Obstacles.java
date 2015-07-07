import java.awt.Color;
import java.awt.Graphics;

public class Obstacles {

	public int x;
	public int y;
	private int gameWidth;
	private int gameHeight;
	private int obstacleHeigth = 100 + (int) (Math.random() * 200);
	private int resetPosition;
	
	private boolean isUp;

	public Obstacles(int x, int y, int gameWidth, int gameHeight,
			int resetPosition, boolean isUp) {
		this.x = x;
		this.y = y;
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		this.resetPosition = resetPosition;
		this.isUp = isUp;
	}

	public void resetObstaclePosition() {
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
			
			resetObstaclePosition();
		}
	}

	public void draw(Graphics g) {

		int o = obstacleHeigth;

		if (isUp) {
			g.setColor(new Color(44, 176, 48));
			System.out.println(o);
			g.fill3DRect(x, y, 150, gameHeight - o - 200, true);
			//g.fillRect(x, y, 150, gameHeight - o - 200);
		} else {
			g.setColor(new Color(44, 176, 48));
			System.out.println(o);
			g.fill3DRect(x, y, 150, o, true);
			//g.fillRect(x, y, 150, o);
		}

	}

}
