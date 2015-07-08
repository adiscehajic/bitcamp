package ba.bitcamp.w08d03_ArrayList.exercises;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task06_AnArrayOfFonts extends JFrame {

	private static final long serialVersionUID = -73116019704205333L;

	private Font[] fonts = new Font[40];

	public Task06_AnArrayOfFonts() {
		setLayout(new GridLayout(40, 1));

		for (int i = 0; i < fonts.length; i++) {
			fonts[i] = new Font("Serif", Font.BOLD, i + 1);
		}

		for (int i = 0; i < 40; i++) {
			JLabel label = new JLabel("Label " + (i + 1));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setFont(fonts[i]);
			add(label);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 1200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task06_AnArrayOfFonts();
	}

}
