package exercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task6_APIPackages {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		String[] str = { "lang", "util", "io", "awt", "net", "applet" };

		g.setColor(Color.BLACK);
		g.drawRect(300, 50, 100, 40);
		System.out.println("Drawing first rect!");

		g.setFont(new Font("Cambria", Font.BOLD, 12));
		g.drawString("API Packages", 310, 73);
		System.out.println("Writing tekst!");

		int x = 120;
		for (int i = 0; i < 600; i += 100) {
			g.drawRect(x, 140, 60, 40);
			x += 80;
			System.out.println("Drawing rectangle!");
		}

		int x3 = 130;
		for (int i = 0; i < str.length; i++) {
			g.drawString(str[i], x3, 165);
			x3 += 80;
			System.out.println("Writing tekst!");
		}

		int x1 = 150;
		int x2 = 150;
		for (int i = 0; i < 600; i += 100) {
			g.drawLine(x1, 110, x2, 140);
			x1 += 80;
			x2 += 80;
			System.out.println("Drawing lines!");
		}

		g.drawLine(150, 110, 550, 110);
		System.out.println("Drawing big line!");

		g.drawLine(350, 90, 350, 110);
		System.out.println("Drawing small line!");

		// *******************
		w.setImage(img);
	}
}
