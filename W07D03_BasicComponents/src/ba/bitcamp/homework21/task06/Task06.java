package ba.bitcamp.homework21.task06;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Task06 extends JFrame {

	private static final long serialVersionUID = 6661846761469662967L;

	private JLabel label = new JLabel();
	private JTextField value = new JTextField();
	private JButton button = new JButton("Start");
	private Timer timer;
	private int number;

	public Task06() {

		setLayout(new GridLayout(3, 1));

		timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (number <= 0) {
					timer.stop();
				} else {
					number--;
					label.setText(String.valueOf(number));
				}
			}
		});

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		add(value);
		value.setHorizontalAlignment(JTextField.CENTER);
		value.setFont(new Font("Serif", Font.PLAIN, 20));

		add(button);
		button.setFont(new Font("Serif", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == button) {
					try {
						number = Integer.parseInt(value.getText());
						label.setText(String.valueOf(number));
					} catch (NumberFormatException e2) {
						JOptionPane.showMessageDialog(null,
								"You have inputed wrong number format!");
					}
					timer.start();
				}

			}
		});

		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 3");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task06();
	}

}
