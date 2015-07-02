package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task06 extends JFrame {

	private static final long serialVersionUID = 7664947637592876791L;

	private JPanel panel = new MyPanel();

	private int sizeY = 0;

	public Task06() {

		add(panel);

		addKeyListener(new Key());
		setSize(450, 300);
		setTitle("Task 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task06();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -2013160967732376768L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			sizeY = getHeight();
			g.fillRect(getWidth() / 2 - 20, sizeY - 40, 40, 40);
		}
	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				sizeY -= 10;
			}
			repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				sizeY += 5;
			}
			repaint();
		}

	}

}
