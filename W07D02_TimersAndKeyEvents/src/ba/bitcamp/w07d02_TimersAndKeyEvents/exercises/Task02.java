package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task02 extends JFrame {

	private static final long serialVersionUID = 2526715471132273046L;

	private JLabel label = new JLabel();
	private String text = " ";

	public Task02() {

		addKeyListener(new Key());

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 30));

		setSize(450, 300);
		setTitle("Task 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task02();
	}

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				if (text.length() > 0) {
					text = text.substring(0, text.length() - 1);
				}
			} else {
				text += "" + e.getKeyChar();
				label.setText(text);
			}
			label.setText(text);
		}

		public void keyReleased(KeyEvent e) {

		}

	}

}
