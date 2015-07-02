package ba.bitcamp.w07d01.exercises;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class contains one JFrame that contains one JLabel. The JLabel initially
 * has the text "Not clicked". If the user clicks on the JLabel then the text is
 * changed to "It is clicked".
 * 
 * @author adis.cehajic
 *
 */
public class Task01 extends JFrame {

	private static final long serialVersionUID = -1938708005143374604L;

	private JLabel label = new JLabel("Not clicked!");

	private Font font1 = new Font("Serif", Font.PLAIN, 25);
	private Font font2 = new Font("Serif", Font.BOLD, 25);

	public Task01() {

		label.setFont(font1);
		label.setHorizontalAlignment(JLabel.CENTER);

		label.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
				if (e.getSource() == label) {
					label.setFont(font2);
					label.setText("It is clicked!");
				}
			}
		});

		add(label);

		setSize(450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Task 1");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task01();
	}

}
