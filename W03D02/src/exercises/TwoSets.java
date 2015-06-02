package exercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class TwoSets {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
//		g.setColor(Color.ORANGE);
//		g.drawOval(100, 100, 400, 100);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Cambria", Font.BOLD, 16));
		g.drawString("A = {1, 5, 8}", 235, 175);
		g.setColor(Color.BLUE);
		g.drawString("B = {2, 6, 3}", 235, 325);
		
		// Elements of set A
		g.setColor(Color.RED);
		g.drawString("1", 200, 100);
		g.drawString("5", 300, 80);
		g.drawString("8", 350, 130);
		
		// Dots of set A
		g.setColor(Color.BLACK);
		g.fillOval(195, 93, 3, 3);
		g.fillOval(295, 73, 3, 3);
		g.fillOval(345, 123, 3, 3);
		
		// Elements of set B
		g.setColor(Color.BLUE);
		g.drawString("2", 250, 240);
		g.drawString("6", 230, 270);
		g.drawString("3", 300, 260);
		
		// Dots of set A
		g.setColor(Color.BLACK);
		g.fillOval(245, 233, 3, 3);
		g.fillOval(225, 263, 3, 3);
		g.fillOval(295, 253, 3, 3);
		
//		g.setColor(Color.BLACK);
//		g.drawLine(150, 50, 150, 300);
//		g.drawLine(150, 50, 70, 150);
		
		g.setColor(Color.BLACK);
		g.drawOval(120, 50, 350, 100);
		g.drawOval(120, 200, 350, 100);
		
		

		
		
		// *******************
		w.setImage(img);
	}
}
