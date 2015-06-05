package exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Task5_DrawRectangles {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {

		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		// **** Draw here ****

		drawRectangles(5, 2, g);

		// *******************

		w.setImage(img);

	}

	public static void drawRectangles(int N, int M, Graphics g) {
		for (int i = 0; i < N * 50; i += 50) {
			for (int j = 0; j < M * 50; j += 50) {
				g.setColor(Color.BLACK);
				g.drawRect(j, i, 50, 50);

			}
		}

	}

}
