package ba.bitcamp.w12d04_ThreadsAndNetworking.lectures;

import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {

		ChatPanel panel = new ChatPanel();

		add(panel);

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Chat");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}
