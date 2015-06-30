package ba.bitcamp.w07d02_TimersAndKeyEvents.lectures;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

public class RacingGame extends JPanel implements ActionListener {

	private static final long serialVersionUID = 2689236561661564312L;

	private int roadWidth;
	private int roadHeight;

	private Vehicle myVehicle;
	private AnimatedVehicle otherVehicle;

	private Timer timer;

	public RacingGame(int roadWidth, int roadHeight) {
		this.roadWidth = roadWidth;
		this.roadHeight = roadHeight;
		this.myVehicle = new Vehicle(roadWidth / 2 - 20, roadHeight - 95,
				Color.BLUE);
		this.otherVehicle = new AnimatedVehicle(Color.GREEN, roadWidth,
				roadHeight); // provjeriti
		timer = new Timer(1000 / 25, this);

		addKeyListener(new MyVehicleControl());

		addMouseListener(new MouseAdapter() {

			public void mouseClicked(MouseEvent e) {
				((Component) e.getSource()).requestFocus();
			}
		});

		addFocusListener(new FocusListener() {

			public void focusLost(FocusEvent e) {
				timer.stop();
			}

			public void focusGained(FocusEvent e) {
				timer.start();
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		otherVehicle.moveDown();
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (myVehicle.colide(otherVehicle)) {
			myVehicle.crash();
			otherVehicle.resetPosition();
		}
		myVehicle.draw(g);
		otherVehicle.draw(g);
	}

	private class MyVehicleControl extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				if (myVehicle.x > 40) {
					myVehicle.moveLeft();
				}
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				if (myVehicle.x + 80 < roadWidth) {
					myVehicle.moveRight();
				}
			}
			repaint();
		}
	}

}
