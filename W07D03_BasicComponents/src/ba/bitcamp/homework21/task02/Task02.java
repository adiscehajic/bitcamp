package ba.bitcamp.homework21.task02;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task02 extends JFrame {

	private static final long serialVersionUID = -2396697234139864843L;

	private JLabel label = new JLabel("Font check!");
	private JCheckBox boxOne = new JCheckBox("Bold");
	private JCheckBox boxTwo = new JCheckBox("Italic");
	private JButton button = new JButton("Refresh");

	public Task02() {

		setLayout(new GridLayout(4, 1));

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.PLAIN, 30));

		boxOne.setHorizontalAlignment(JCheckBox.CENTER);
		boxOne.setFont(new Font("Serif", Font.PLAIN, 20));
		
		boxTwo.setHorizontalAlignment(JCheckBox.CENTER);
		boxTwo.setFont(new Font("Serif", Font.PLAIN, 20));
		
		button.setHorizontalAlignment(JButton.CENTER);
		button.setFont(new Font("Serif", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == button) {
					if (boxOne.isSelected() && boxTwo.isSelected()) {
						label.setFont(new Font("Serif",
								Font.ITALIC | Font.BOLD, 30));
					} else if (boxOne.isSelected()) {
						label.setFont(new Font("Serif", Font.BOLD, 30));
					} else if (boxTwo.isSelected()) {
						label.setFont(new Font("Serif", Font.ITALIC, 30));
					} else {
						label.setFont(new Font("Serif", Font.PLAIN, 30));
					}
				}
			}
		});

		add(label);
		add(boxOne);
		add(boxTwo);
		add(button);

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 2");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task02();
	}
}
