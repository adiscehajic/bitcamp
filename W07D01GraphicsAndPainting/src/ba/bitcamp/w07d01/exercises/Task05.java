package ba.bitcamp.w07d01.exercises;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class contains one JFrame that contains one JPanel. The JPanel on it
 * draws two diagonals that go from one corner to the opposite corner, only when
 * the mouse is directly over the JPanel.
 * 
 * @author adis.cehajic
 *
 */
public class Task05 extends JFrame {

	private static final long serialVersionUID = 8411714747232962415L;

	private JPanel panel = new MyPanel();
	private boolean draw = false;

	public Task05() {

		add(panel);
		panel.addMouseListener(new Mouse());

		setSize(500, 500);
		setTitle("Task 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task05();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 2722272379847920559L;

		protected void paintComponent(Graphics g) {

			super.paintComponent(g);

			Graphics2D g2d = (Graphics2D) g;
			if (draw == true) {
				g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(0, 0, getWidth(), getHeight());
				g2d.drawLine(0, getHeight(), getWidth(), 0);
			}
		}
	}

	private class Mouse implements MouseListener {
		public void mouseReleased(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
			draw = false;
			repaint();
		}

		public void mouseEntered(MouseEvent e) {
			draw = true;
			repaint();
		}

		public void mouseClicked(MouseEvent e) {
		}
	}

}
