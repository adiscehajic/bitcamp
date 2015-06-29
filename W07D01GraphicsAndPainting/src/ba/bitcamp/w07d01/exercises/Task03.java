package ba.bitcamp.w07d01.exercises;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task03 extends JFrame {

	private static final long serialVersionUID = -7471634134625566241L;

	private JPanel panel = new MyPanel();
	private String str = "";

	public Task03() {

		add(panel);

		setSize(500, 500);
		setTitle("Task 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task03();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -7923656443149432166L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawString(str, 250, 250);

			panel.addMouseListener(new Mouse());

			repaint();

		}
	}

	private class Mouse implements MouseListener {

		public void mouseReleased(MouseEvent e) {
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseClicked(MouseEvent e) {
			if (e.getButton() == MouseEvent.BUTTON1) {
				str = "Left button clicked!";
			} else if (e.getButton() == MouseEvent.BUTTON2) {
				str = "Middle button clicked!";
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				str = "Right button clicked!";
			}
		}

	}

}
