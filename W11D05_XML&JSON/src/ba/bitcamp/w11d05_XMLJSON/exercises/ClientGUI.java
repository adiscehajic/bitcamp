package ba.bitcamp.w11d05_XMLJSON.exercises;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClientGUI extends JFrame {

	private static final long serialVersionUID = 4116758223434890059L;

	private JPanel panel = new MyPanel();
	private int x = 50;
	private int y = 50;
		
	public static final int MOVE = 5;
	public static final int WIDTH = 600;
	public static final int HEIGHT = 600;
	public static final int RECT_SIZE = 25;

	public ClientGUI() {

		addKeyListener(new KeyAction());

		add(panel);

		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Client GUI");
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

	private class KeyAction extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT && x < WIDTH - RECT_SIZE) {
				x += MOVE;
				Client.sendToServer("D");
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT && x > 0) {
				x -= MOVE;
				Client.sendToServer("A");
			} else if (e.getKeyCode() == KeyEvent.VK_UP && y > 0) {
				y -= MOVE;
				Client.sendToServer("W");
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN && y < HEIGHT - RECT_SIZE) {
				y += MOVE;
			Client.sendToServer("S");
			}	
			repaint();
		}
	}

}
