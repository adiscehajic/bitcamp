package ba.bitcamp.w08d01_ArrayDetails.exercises;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task04 extends JFrame {

	private static final long serialVersionUID = -9095363538698487078L;

	private JPanel panel = new JPanel();

	private JLabel name = new JLabel("Name: ");
	private JLabel email = new JLabel("Email: ");
	private JTextField nameText = new JTextField(40);
	private JTextField emailText = new JTextField(40);

	private JTextArea area = new JTextArea();
	private JButton button = new JButton("Submit");

	private String str = "";

	public Task04() {

		setLayout(new BorderLayout());

		panel.setLayout(new GridLayout(2, 2));
		panel.add(name);
		name.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(nameText);
		panel.add(email);
		email.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(emailText);

		add(panel, BorderLayout.NORTH);
		add(area);
		area.setBorder(BorderFactory.createTitledBorder("Comment"));
		add(button, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String emailString = emailText.getText();

				int counterMonkey = 0;
				int counterDot = 0;
				for (int i = 0; i < emailString.length(); i++) {
					if (emailString.charAt(i) == '@') {
						counterMonkey++;
					} else if (emailString.charAt(i) == '.') {
						counterDot++;
					}
				}

				if (emailString.substring(emailString.indexOf('@'),
						emailString.length() - 2).indexOf('.') == -1) {
					JOptionPane.showMessageDialog(null,
							"Inputed wrong email format!");
					emailText.setText("");
				} else if (counterDot == 0 || counterMonkey == 0) {
					JOptionPane.showMessageDialog(null,
							"Inputed wrong email format!");
					emailText.setText("");
				} else {
					TextIO.readFile("src/ba/bitcamp/w08d01_ArrayDetails/exercises/text.txt");

					while (!TextIO.eof()) {
						str += TextIO.getln() + "\n";
					}

					TextIO.writeFile("src/ba/bitcamp/w08d01_ArrayDetails/exercises/text.txt");
					str += String.format(
							"Name: %s\nEmail: %s\nComment: \n%s\n",
							nameText.getText(), emailText.getText(),
							area.getText());

					TextIO.putln(str);
					TextIO.writeStandardOutput();
					TextIO.readStandardInput();

					JOptionPane.showMessageDialog(null,
							"Succecfully inserted comment!");
					System.exit(0);
				}
			}
		});

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 4");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task04();
	}

}
