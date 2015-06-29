package ba.bitcamp.w07d01.exercises;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class contains one JFrame that contains one JPanel. The JPanel on it
 * draws two diagonals that go from one corner to the opposite corner.
 * 
 * @author adis.cehajic
 *
 */
public class Task02 extends JFrame {

	private static final long serialVersionUID = 8411714747232962415L;

	private JPanel panel = new MyPanel();

	public Task02() {

		add(panel);

		setSize(500, 500);
		setTitle("Task 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Task02();

	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 2722272379847920559L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;

			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			g2d.drawLine(0, 0, getWidth(), getHeight());
			g2d.drawLine(0, getHeight(), getWidth(), 0);

		}
	}

}
