package ba.bitcamp.w07d01.exercises;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Prints on JPanel mouse coordinates ie. X and Y coordinates relative to the
 * JPanel.
 * 
 * @author adis.cehajic
 *
 */
public class Task06 extends JFrame {

	private static final long serialVersionUID = -7149989818261478792L;

	private JPanel panel = new MyPanel();

	private String stringX = "";
	private String stringY = "";

	public Task06() {

		add(panel);
		panel.addMouseMotionListener(new Mouse());

		setSize(500, 500);
		setTitle("Task 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task06();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -8462784953552039152L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawString("X: " + stringX, 200, 200);
			g.drawString("Y: " + stringY, 250, 200);
			// repaint();
		}

	}

	private class Mouse implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {

			stringX = Integer.toString(e.getX());
			stringY = Integer.toString(e.getY());
			repaint();

		}

	}

}
