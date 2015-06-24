package ba.bitcamp.w06d03.exercises;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Task1 extends JFrame {

	private static final long serialVersionUID = -8831783094730618134L;
	
	private JLabel text = new JLabel("Hello World");
	private JButton button = new JButton("Hello!");

	public Task1() {

		setLayout(new BorderLayout());

		add(text);
		text.setHorizontalAlignment(JLabel.CENTER);
		add(button, BorderLayout.SOUTH);
		button.addActionListener(new Action());
		
		setVisible(true);
		setSize(300, 200);
		setTitle("Task 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new Task1();
	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				JOptionPane.showMessageDialog(null, "Hello!");
				System.exit(0);
			}
		}

	}

}
