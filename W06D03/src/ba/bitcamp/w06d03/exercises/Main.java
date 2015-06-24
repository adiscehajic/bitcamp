package ba.bitcamp.w06d03.exercises;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	private static final long serialVersionUID = 608731909889445202L;

	private JLabel text = new JLabel("Ovo je neki tekst");
	private JButton button1 = new JButton("Exit");
	private JButton button2 = new JButton("Left");
	private JButton button3 = new JButton("Right");

	/*
	 * Konstruktor koji pravi prozor
	 */
	public Main() {

		setLayout(new BorderLayout());

		add(text);
		add(button1, BorderLayout.SOUTH);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.EAST);

		button1.addActionListener(new Action());
		button2.addActionListener(new Action());
		button3.addActionListener(new Action());

		setVisible(true);
		setTitle("Prozor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(true);

	}

	public static void main(String[] args) {

		new Main();

	}

	private class Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
				System.exit(0);
			} else if (e.getSource() == button2) {
				text.setText("Pritisnuo si lijevo dugme");
			} else if (e.getSource() == button3) {
				text.setText("Pritisnuo si desno dugme");
			}
		}

	}

}
