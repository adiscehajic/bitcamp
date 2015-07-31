package ba.bitcamp.w11d05_XMLJSON.exercises;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ServerGUI extends JFrame {

	private static final long serialVersionUID = 8931072840156836855L;

	private JPanel panel = new MyPanel();
	private static int x = 50;
	private static int y = 50;
		
	public static final int MOVE = 5;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;
	public static final int RECT_SIZE = 25;

	public ServerGUI() {

		add(panel);

		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Server GUI");
		setVisible(true);
		
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = 8068254161708623926L;

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.fillRect(x, y, RECT_SIZE, RECT_SIZE);
			repaint();
		}

	}
	
	public static void draw(String message, String ipAddress) {
		for (int i = 0; i < Server.list.size(); i++) {
			
			if (ipAddress.equals(Server.list.get(i))) {			
				if (message.equals("D")) {
					x += MOVE;
				} else if (message.equals("A")) {
					x -= MOVE;
				} else if (message.equals("W")) {
					y -= MOVE;
				} else if (message.equals("S")) {
					y += MOVE;
				}
			}
		}
	}
}
