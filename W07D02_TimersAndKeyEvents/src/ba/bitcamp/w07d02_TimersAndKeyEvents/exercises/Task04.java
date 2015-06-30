package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * The window contains the text "Get ready ..." and suddenly changes to
 * "Press a key now!". Then the user must press a button on the keyboard, and
 * the program will print out the window how many milliseconds needed to the
 * user presses the button. If pressed too soon then the text is changed to
 * "Too early!" and disables further play before the application is restarted.
 * 
 * @author adis.cehajic
 *
 */
public class Task04 extends JFrame {

	private static final long serialVersionUID = -6373693657037021190L;

	private JLabel label = new JLabel("Get ready...");

	private long start = 0;
	private long stop = 0;

	public Task04() {

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 30));

		Timer timer = new Timer((int) (Math.random() * 10000),
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (label.getText().equals("Get ready...")) {
							label.setText("Press a key now!");
							start = System.currentTimeMillis();
						}
					}
				});

		timer.start();

		addKeyListener(new Key());

		setSize(450, 300);
		setTitle("Task 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task04();
	}

	private class Key implements KeyListener {

		public void keyTyped(KeyEvent e) {
		}

		public void keyPressed(KeyEvent e) {
			if (label.getText().equals("Press a key now!")) {
				stop = System.currentTimeMillis();
				label.setText(stop - start + " ms");
			} else if (label.getText().equals("Get ready..")) {
				label.setText("Too early!");
			}
		}

		public void keyReleased(KeyEvent e) {
		}

	}

}
