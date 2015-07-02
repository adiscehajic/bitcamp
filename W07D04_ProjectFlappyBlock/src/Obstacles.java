import java.awt.Graphics;

public class Obstacles extends Block {

	private int gameWidth;
	private int gameHeight;
	private int obstacleHeigth = 100 + (int) (Math.random() * 200);

	// ubaci reset position

	public Obstacles(int gameWidth, int gameHeight) {
		super(0, 0);
		this.gameWidth = gameWidth;
		this.gameHeight = gameHeight;
		resetPosition();
	}

	public void resetPosition() {
		x = gameWidth + 150;
		y = gameHeight - obstacleHeigth;
	}

	public void move() {
		if (x > (-150)) {
			x -= 5;
		} else {
			obstacleHeigth = 100 + (int) (Math.random() * 200);
			resetPosition();
		}
	}

	public void draw(Graphics g) {
		System.out.println(obstacleHeigth);
		g.fillRect(x, y, 150, obstacleHeigth);
	}

}
