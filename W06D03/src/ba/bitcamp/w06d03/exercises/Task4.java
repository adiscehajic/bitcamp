package ba.bitcamp.w06d03.exercises;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame {

	private static final long serialVersionUID = -5273028760373580591L;

	private JButton button = new JButton("Button");
	private JLabel label = new JLabel();

	public Task4() {

		setLayout(new BorderLayout());

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Calibri", Font.PLAIN, 18));
		add(button, BorderLayout.SOUTH);

		button.addActionListener(new Action());

		setVisible(true);
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Task 4");
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Task4();
	}

	private class Action implements ActionListener {
		private int counter = 1;

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				switch (counter) {
				case 1:
					label.setText("Don't press it.");
					counter++;
					break;
				case 2:
					label.setText("I told you not to press it.");
					counter++;
					break;
				case 3:
					label.setText("Look, it's simple. Don't press it.");
					counter++;
					break;
				case 4:
					label.setText("You are really stubborn guy! Don't press it.");
					counter++;
					break;
				}

				if (counter > 4) {
					counter = 1;
				}

			}

		}

	}

}
