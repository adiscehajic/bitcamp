
import javax.swing.JFrame;


public class GamePlay {

	public static void main(String[] args) {
		
		FlappyBlock flappyBlock = new FlappyBlock(800, 600);
		
		JFrame window = new JFrame("Flappy block");
		
		
		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setContentPane(flappyBlock);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}
	
}
