import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Block {

	public int x;
	public int y;
	private int moveY;
	private int ground;

	private static final int JUMP = 20;
	private static final int DOWN = 2;
	private static final int WIDTH = 40;
	private static final int HEIGHT = 30;

	public Block(int width, int height) {
		super();
		this.x = width;
		this.y = height;
		this.ground = height * 2 + 150;
	}

	public void draw(Graphics g) {
		g.setColor(new Color(185, 185, 185));
		g.fill3DRect(x, (int) y, WIDTH, HEIGHT, true);
		//g.fillRect(x, (int) y, WIDTH, HEIGHT);

	}

	public boolean colide(Obstacles obstacle) {
		if (obstacle.x + WIDTH < x) {
			if (obstacle.y < y && obstacle.y + HEIGHT > y) {
				return true;
			} else if (obstacle.y > y && y + HEIGHT > obstacle.y) {
				return true;
			}
		}
		return false;
	}

	public void jump() {

		if (moveY > 0) {
			moveY = 0;
		}
		moveY -= JUMP;
	}

	public void down() {
		if (moveY < 20) {
			moveY += DOWN;
		}
		y += moveY;

	}

	public boolean crash() {

		if (y > ground) {
			y = ground;
			return true;
		}  else {
			return false;
		}
	}

	

}
