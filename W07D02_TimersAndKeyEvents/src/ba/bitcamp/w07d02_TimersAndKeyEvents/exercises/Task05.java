package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task05 extends JFrame {

	private static final long serialVersionUID = 8375592687196998983L;

	private JPanel panel = new MyPanel();
	private int sizeX = 0;
	private int sizeY = 0;

	public Task05() {

		add(panel);

		addKeyListener(new Controls());

		setSize(450, 300);
		setTitle("Task 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task05();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -7598114823506764707L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.fillRect(sizeX, sizeY, 30, 30);
		}
	}

	private class Controls implements KeyListener {

		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (sizeX > 0) {
					sizeX -= 5;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (sizeX + 30 < panel.getWidth()) {
					sizeX += 5;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				if (sizeY > 0) {
					sizeY -= 5;
				}
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				if (sizeY + 30 < panel.getHeight()) {
					sizeY += 5;
				}
			}
			repaint();
		}

		public void keyReleased(KeyEvent e) {
		}

	}

}
