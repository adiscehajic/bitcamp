package ba.bitcamp.w07d03_BasicComponents.lectures;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main extends JFrame {

	private static final long serialVersionUID = 2619965155009883913L;

	public static void main(String[] args) {
		int fullWidth = 400;
		int fullHeight = 600;

		JFrame window = new JFrame();
		JPanel container = new JPanel();

		// Labels
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setForeground(Color.BLUE);
		nameLabel.setFont(new Font("Serif", Font.ITALIC, 25));
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(Color.BLUE);
		emailLabel.setFont(new Font("Serif", Font.PLAIN, 25));

		// TextFields
		JTextField nameField = new JTextField(25);
		JTextField emailField = new JTextField(25);

		// TextArea
		JTextArea terms = new JTextArea(10, 30);
		terms.setText("Today is a very hard day. I have'nt sleep very well and that is why I am very tired. I'm gona try to stay awake.");
		terms.setLineWrap(true);
		terms.setEditable(false);

		// Button
		JButton submit = new JButton("Submit");
		submit.setEnabled(true);

		// CheckBox
		JCheckBox cb = new JCheckBox("I accept terms and conditions");
		// cb.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// JCheckBox cb = (JCheckBox) e.getSource();
		// submit.setEnabled(cb.isSelected());
		// }
		// });
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!cb.isSelected()) {
					// Creating JOptionPane
					JOptionPane error = new JOptionPane("You have not accepted terms and conditions!", JOptionPane.ERROR_MESSAGE);
					error.createDialog(window, "Ha Ha!").setVisible(true);;
					
					nameField.setText("");
					emailField.setText("");
				} else {
					String name = nameField.getText();
					String email = emailField.getText();
					System.out.println("Name: " + name + " Email: " + email);
				}
			}
		});
		
		container.add(nameLabel);
		container.add(nameField);
		container.add(emailLabel);
		container.add(emailField);
		container.add(terms);
		container.add(cb);
		container.add(submit);

		window.add(container);

		window.setSize(fullWidth, fullHeight);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("Basic Components");
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}

}
