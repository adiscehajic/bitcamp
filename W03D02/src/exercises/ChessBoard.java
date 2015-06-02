package exercises;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ChessBoard {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 400, 400);

		int x = 0;
		int y = 0;

		for (int i = 0; i < 8; i++) {
			x = 50 * i;
			for (int j = 0; j < 8; j++) {
				g.fillRect(x, y, 50, 50);
				y = 50 * j;
			}
		}
		// for (int i = 0; i <= 350; i += 100) {
		// for (int j = 0; j <= 350; j += 100) {
		// g.setColor(Color.BLACK);
		// g.fill3DRect(j, i, 50, 50, true);
		// }
		// for (int z = 50; z <= 350; z += 100) {
		// g.setColor(Color.BLACK);
		// g.fill3DRect(z, i+50, 50, 50, true);
		// }
		// }

		// *******************
		w.setImage(img);
	}
}
