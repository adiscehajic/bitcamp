package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Task03 extends JFrame {

	private static final long serialVersionUID = -8111301710524346524L;

	private JPanel panel = new MyPanel();
	private int positionX = 0;
	private int positionY = 0;
	private int valueX = 5;
	private int valueY = 5;

	public Task03() {
		add(panel);
		Timer timer = new Timer(25, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (positionY + 30 >= panel.getHeight()) {
					valueY = -5;
				} else if (positionX + 30 > panel.getWidth()) {
					valueX = -5;
				} else if (positionY <= 0) {
					valueY = 5;
				} else if (positionX <= 0) {
					valueX = 5;
				}

				positionX += valueX;
				positionY += valueY;

				panel.repaint();
			}
		});

		timer.start();

		setSize(450, 300);
		setTitle("Task 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task03();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -1668083405302559138L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.fillRect(positionX, positionY, 30, 30);
		}
	}

}
