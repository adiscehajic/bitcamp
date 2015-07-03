import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FlappyBlock extends JPanel implements ActionListener {

	private static final long serialVersionUID = -4055775700740040546L;

	private int gameWidth;
	private int gameHeight;

	private Block mainBlock;
	private Obstacles firstObstacle;
	private Obstacles secondObstacle;

	private Obstacles thirdObstacle;
	private Obstacles fourthObstacle;

	private Timer timer;
	private Timer timerObstacle;
	private Timer timerBlock;

	private BufferedImage image;

	public FlappyBlock(int width, int height) {
		try {
			image = ImageIO.read(new File("src/images4.jpg"));
		} catch (Exception ex) {
			System.out.println("Greska");
		}

		this.gameWidth = width;
		this.gameHeight = height;

		mainBlock = new Block(width / 4, height / 2 - 100);
		
		firstObstacle = new Obstacles(width + 150, height - 130, width, height,
				150, false);
		secondObstacle = new Obstacles(width + 700, height - 100, width,
				height, 150, false);

		thirdObstacle = new Obstacles(width + 150, 0, width, height, 150, true);
		fourthObstacle = new Obstacles(width + 700, 0, width, height, 150, true);

		timer = new Timer(25, this);
		timerBlock = new Timer(5, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (mainBlock.y < 0) {
					
					mainBlock.down();
					timer.stop();
					timerBlock.start();
				}
				
				repaint();
				
			}
			
		});
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					mainBlock.jump();
				}
				repaint();
			}
		});

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				((Component) e.getSource()).requestFocus();
			}
		});

		addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				//timer.stop();
				//timerBlock.stop();
			}

			public void focusGained(FocusEvent e) {
				timer.start();
				timerBlock.start();
			}
		});
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// if (mainBlock.colide(firstObstacle)) {
		// mainBlock.crash();
		// }
		g.drawImage(image, 0, 0, null);

		mainBlock.draw(g);
		firstObstacle.draw(g);
		secondObstacle.draw(g);
		thirdObstacle.draw(g);
		fourthObstacle.draw(g);
	}

	public void actionPerformed(ActionEvent e) {
		
		if (mainBlock.crash()) {
			timer.stop();
		} else {
			mainBlock.down();
			firstObstacle.move();
			secondObstacle.move();
			thirdObstacle.move();
			fourthObstacle.move();
		}

		repaint();
	}

}
