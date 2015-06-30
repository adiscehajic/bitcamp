package ba.bitcamp.w07d02_TimersAndKeyEvents.lectures;

import javax.swing.JFrame;

public class GameRunner {

	public static void main(String[] args) {

		RacingGame racingGame = new RacingGame(800, 600);

		JFrame window = new JFrame("Racing Game");

		window.setSize(800, 600);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setContentPane(racingGame);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
