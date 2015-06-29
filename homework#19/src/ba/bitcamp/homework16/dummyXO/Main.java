package ba.bitcamp.homework16.dummyXO;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	public static int counterX = 0;
	public static int counterO = 0;

	private static class ButtonHandler implements ActionListener {
		JButton button;

		public ButtonHandler(JButton button) {
			super();
			this.button = button;
		}

		int counter = 0;

		public void actionPerformed(ActionEvent e) {

			String buttonText;

			if (button.getText() == "" && counter < 2 && counterX == counterO) {
				buttonText = "X";
				button.setText(buttonText);
				counterX++;
			} else if (button.getText() == "" && counterX > counterO) {
				buttonText = "O";
				button.setText(buttonText);
				counterO++;
			} else if (button.getText() == "X" && counter < 1) {
				buttonText = "X";
				button.setText(buttonText);
				counter++;
			} else if (button.getText() == "X" && counter == 1) {
				buttonText = "O";
				button.setText(buttonText);
				counter = 0;
			} else if (button.getText() == "O" && counter < 1) {
				buttonText = "O";
				button.setText(buttonText);
				counter++;
			} else if (button.getText() == "O" && counter == 1) {
				buttonText = "X";
				button.setText(buttonText);
				counter = 0;
			}
		}
	}

	public static void main(String[] args) {

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3, 3));

		JButton okButton1 = new JButton("");
		okButton1.addActionListener(new ButtonHandler(okButton1));

		JButton okButton2 = new JButton();
		okButton2.addActionListener(new ButtonHandler(okButton2));

		JButton okButton3 = new JButton();
		okButton3.addActionListener(new ButtonHandler(okButton3));

		JButton okButton4 = new JButton();
		okButton4.addActionListener(new ButtonHandler(okButton4));

		JButton okButton5 = new JButton();
		okButton5.addActionListener(new ButtonHandler(okButton5));

		JButton okButton6 = new JButton();
		okButton6.addActionListener(new ButtonHandler(okButton6));

		JButton okButton7 = new JButton();
		okButton7.addActionListener(new ButtonHandler(okButton7));

		JButton okButton8 = new JButton();
		okButton8.addActionListener(new ButtonHandler(okButton8));

		JButton okButton9 = new JButton();
		okButton9.addActionListener(new ButtonHandler(okButton9));

		content.add(okButton1);
		content.add(okButton2);
		content.add(okButton3);
		content.add(okButton4);
		content.add(okButton5);
		content.add(okButton6);
		content.add(okButton7);
		content.add(okButton8);
		content.add(okButton9);

		JFrame window = new JFrame("Dummy X-O");
		window.setContentPane(content);
		window.setSize(400, 300);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
