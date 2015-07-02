package ba.bitcamp.w07d01.exercises;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class contains one JFrame that contains one JLabel. The JLabel looks
 * different compared to what a mouse does. If the mouse is on the JLabel JLabel
 * then becomes brighter, and if you go out with JLabel then return to the old
 * paint. When the user presses and holds the JLabel then JLabel bolds and come
 * back when the user release.
 * 
 * @author adis.cehajic
 *
 */
public class Task04 extends JFrame {

	private static final long serialVersionUID = 2796556772552350381L;

	private JLabel label = new JLabel("BITcamp");

	public Task04() {

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Serif", Font.PLAIN, 30));

		label.addMouseListener(new MouseListener() {

			public void mouseReleased(MouseEvent e) {
				label.setFont(new Font("Serif", Font.PLAIN, 30));
			}

			public void mousePressed(MouseEvent e) {
				label.setFont(new Font("Serif", Font.BOLD, 30));
			}

			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.BLACK);
			}

			public void mouseEntered(MouseEvent e) {
				label.setForeground(Color.GRAY);
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		add(label);

		setSize(500, 500);
		setTitle("Task 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task04();
	}

}
