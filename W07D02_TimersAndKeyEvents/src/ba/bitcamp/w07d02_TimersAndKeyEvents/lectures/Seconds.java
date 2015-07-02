package ba.bitcamp.w07d02_TimersAndKeyEvents.lectures;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Seconds extends JFrame {

	private static final long serialVersionUID = 6648045170453687340L;

	private long seconds = 0;
	private int minutes = 0;

	private JPanel panel = new MyPanel();

	public Seconds() {
		Timer timer1 = new Timer(1000, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				seconds++;
				if (seconds > 59) {
					seconds = 0;
					minutes++;
				}
			}
		});
		timer1.start();
		
//		panel.addMouseListener(new MouseAdapter() {
//			
//			public void mouseClicked(MouseEvent e) {
//				super.mouseClicked(e);
//				seconds++;
//				if (seconds > 59) {
//					seconds = 0;
//					minutes++;
//				}
//			}
//		});

		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 300);
		setTitle("Seconds");
		setLocationRelativeTo(null);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Seconds();
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -664523809159703344L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("Serif", Font.BOLD, 30));
			g.drawString(":" + Long.toString(seconds), getWidth() / 2 + 10,
					getHeight() / 2);
			repaint();
			g.drawString(Integer.toString(minutes), getWidth() / 2 - 10,
					getHeight() / 2);
			repaint();
		}
	}

}
