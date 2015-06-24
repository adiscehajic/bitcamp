package ba.bitcamp.w06d03.lectures.gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HelloWorldGUI2 {

	private static class TestPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Test!", 20, 20);
		}
	}

	private static class HelloWorldDisplay extends TestPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hello World!", 20, 40);
		}
	}

	public static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// System.exit(0);
		}
	}

	public static class ButtonHandler2 implements ActionListener {
		JButton button;

		public ButtonHandler2(JButton button) {
			super();
			this.button = button;
		}

		public void actionPerformed(ActionEvent e) {
			String buttonText = button.getText();
			button.setText(buttonText + buttonText);
		}
	}

	public static void main(String[] args) {

		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("OK");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);
		
		okButton.addActionListener(new ButtonHandler2(okButton));

		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.CENTER);
		content.add(okButton, BorderLayout.SOUTH);

		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(250, 100);
		window.setLocation(850, 500);
		window.setVisible(true);

	}

}
