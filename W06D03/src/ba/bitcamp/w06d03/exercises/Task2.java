package ba.bitcamp.w06d03.exercises;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task2 extends JFrame {

	private static final long serialVersionUID = -4786022955300990023L;
	
	private JButton button1 = new JButton("Do not exit");
	private JButton button2 = new JButton("Exit");
	private JLabel text = new JLabel("Choose one");

	public Task2() {

		setLayout(new BorderLayout());

		add(text);
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.SOUTH);

		text.setHorizontalAlignment(JLabel.CENTER);
		
		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		
		setVisible(true);
		setTitle("Task 2");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {

		new Task2();

	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button2) {
				System.exit(0);
			} else if (e.getSource() == button1) {
				text.setText("It did not exit!");
			}
		}

	}

}
