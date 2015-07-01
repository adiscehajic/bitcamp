package ba.bitcamp.homework21.task03;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Task03 extends JFrame {

	private static final long serialVersionUID = 4357290275678898757L;

	private JTextField name = new JTextField();
	private JPasswordField password = new JPasswordField();
	private JLabel labelName = new JLabel("Username: ");
	private JLabel labelPassword = new JLabel("Password: ");

	public Task03() {

		setLayout(new GridLayout(2, 2));

		name.addKeyListener(new Key());
		password.addKeyListener(new Key());

		add(labelName);
		add(name);
		add(labelPassword);
		add(password);

		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 3");
		setVisible(true);
	}

	private class Key extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {

				String correctName = "Mujo";
				String correctPassword = "1234";
				String nameString = String.valueOf(name.getText());
				String passwordString = String.valueOf(password.getPassword());

				if (nameString.equals(correctName)
						&& passwordString.equals(correctPassword)) {
					System.exit(0);
				} else if (!nameString.equals(correctName)
						&& !passwordString.equals(correctPassword)) {
					JOptionPane.showMessageDialog(null,
							"Wrong username and password!");
				} else if (!nameString.equals(correctName)) {
					JOptionPane.showMessageDialog(null, "Wrong username!");
				} else if (!passwordString.equals(correctPassword)) {
					JOptionPane.showMessageDialog(null, "Wrong password!");
				}
			}
		}
	}

	public static void main(String[] args) {
		new Task03();
	}

}
