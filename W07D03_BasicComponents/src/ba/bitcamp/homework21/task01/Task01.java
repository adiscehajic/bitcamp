package ba.bitcamp.homework21.task01;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Task01 extends JFrame {

	private static final long serialVersionUID = -7683707428503398793L;

	private JSlider slider = new JSlider(0, 100, 0);
	private JLabel label = new JLabel("Font check!");
	private int fontSize;

	public Task01() {

		setLayout(new BorderLayout());

		add(label);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD, fontSize));

		add(slider, BorderLayout.SOUTH);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				fontSize = slider.getValue();
				label.setFont(new Font("Serif", Font.BOLD, fontSize));
			}
		});

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 1");
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task01();
	}

}
