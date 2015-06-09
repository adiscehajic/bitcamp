package lectures;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {

		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		star(g, 35);
		
		
		

		
		g.setColor(Color.YELLOW);
		g.fillOval(200, 160, 50, 50);
		g.fillOval(235, 185, 50, 50);
		g.fillOval(225, 225, 50, 50);
		g.fillOval(170, 190, 50, 50);
		g.fillOval(180, 225, 50, 50);
		
		g.setColor(Color.WHITE);
		g.fillOval(200, 197, 50, 50);
		

		// *******************
		w.setImage(img);
	}

	public static void star(Graphics g, int x) {
		g.setColor(Color.BLACK);

		g.drawLine(4 * x, x, 2 * x, 6 * x);
		g.drawLine(4 * x, x, 6 * x, 6 * x);
		g.drawLine(x, 3 * x, 7 * x, 3 * x);
		g.drawLine(x, 3 * x, 6 * x, 6 * x);
		g.drawLine(2 * x, 6 * x, 7 * x, 3 * x);

	}
	
	public static void flower(Graphics g, int x){
		
		g.setColor(Color.YELLOW);
		g.fillOval(200, 160, 50, 50);
		g.fillOval(235, 185, 50, 50);
		g.fillOval(225, 225, 50, 50);
		g.fillOval(170, 190, 50, 50);
		g.fillOval(180, 225, 50, 50);
		
		g.setColor(Color.WHITE);
		g.fillOval(200, 197, 50, 50);
		
		
		
	}

}
