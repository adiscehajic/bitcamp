package ba.bitcamp.w07d02_TimersAndKeyEvents.exercises;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task01 extends JFrame {

	private static final long serialVersionUID = 6132671250255153343L;

	private JLabel label = new JLabel();

	public Task01() {

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, 30));

		addFocusListener(new Focus());
		
		setSize(450, 300);
		setTitle("Task 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task01();
	}
	
	private class Focus implements FocusListener {

		public void focusGained(FocusEvent e) {
			label.setText("In Focus!");
			repaint();
		}

		public void focusLost(FocusEvent e) {
			label.setText("Not in Focus!");
			repaint();
			
		}
		
	}

}
