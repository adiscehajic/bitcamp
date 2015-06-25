package ba.bitcamp.w06d03.exercises;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 8843780307513792785L;
	
	private JButton button1 = new JButton("Button 1");
	private JButton button2 = new JButton("Button 2");
	private JLabel label = new JLabel("Press one to disable the other...");

	public static int counter = 0;

	public Task3() {

		setLayout(new BorderLayout());

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		button1.setFont(new Font("Calibri", Font.PLAIN, 16));
		button2.setFont(new Font("Calibri", Font.PLAIN, 16));
		button2.setEnabled(false);
		label.setFont(new Font("Comic sans ms", Font.BOLD, 18));

		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);

		button1.addActionListener(new Action());
		button2.addActionListener(new Action());

		setVisible(true);
		setSize(500, 350);
		setTitle("Task 3");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Task3();
	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == button1) {
				button2.setEnabled(true);
				button1.setEnabled(false);
				counter++;

			} else if (e.getSource() == button2) {
				button1.setEnabled(true);
				button2.setEnabled(false);
				counter++;
			}

			if (counter == 5) {
				System.exit(0);
			}

		}

	}

}
