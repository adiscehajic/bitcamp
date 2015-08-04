package ba.bitcamp.w12d02_ProgrammingWithThreads.exercises;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Task03 extends JFrame {

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JButton button = new JButton("Start");
	private static int counter = 0;
	private int click = 0;
	
	public Task03() {

		panel.setLayout(new BorderLayout());

		panel.add(label, BorderLayout.CENTER);
		panel.add(button, BorderLayout.SOUTH);

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 30));

		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (click < 1) {
					new MyThread().start();
					counter = 0;
					click++;
				}

			}
		});
		add(panel);

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Prime numbers counter");
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task03();
	}

	private class MyThread extends Thread {

		public void run() {
			for (int i = 2; i < 10000; i++) {			
				if (isPrime(i)) {
					counter++;
				}
				if (i == 10000 - 1) {
					label.setText(counter + "");
				}
			}
		}
	}

	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
