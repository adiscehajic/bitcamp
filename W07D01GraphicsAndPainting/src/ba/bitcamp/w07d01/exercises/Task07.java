package ba.bitcamp.w07d01.exercises;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task07 extends JFrame {

	private static final long serialVersionUID = 1444552219098013404L;

	private int[] values = new int[] { 10, 68, 50, 30, 60, 40, 20, 0, 10, 100 };

	private JPanel panel = new MyPanel();
	
	public Task07() {

		add(panel);
		
		setSize(500, 500);
		setTitle("Task 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task07();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 1617452727256211441L;

		protected void paintComponent(Graphics g) {

			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D) g;

			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke());
			
			g2d.drawLine(getWidth() / 12, getHeight() - 100, (getWidth() / 12) * 11, getHeight() - 100);
			
			int x = getWidth() / 12;
			
			for (int i = 0; i < values.length; i++) {
				g2d.fillRect(x, getHeight() -  values[i] - 100, getWidth() / 12, values[i]);
				x += getWidth() / 12;
			}
		}
	}

}
