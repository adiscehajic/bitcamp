package ba.bitcamp.w12d02_ProgrammingWithThreads.exercises;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task01 extends JFrame {

	private static final long serialVersionUID = 3344758345733610748L;
	
	private JPanel panel = new JPanel();
	private JButton add = new JButton("Add");
	private JButton stop = new JButton("Stop");

	private static boolean isRunning = true;

	private static ArrayList<Thread> list = new ArrayList<Thread>();

	public Task01() {

		panel.setLayout(new GridLayout(2, 1));

		add.setFont(new Font("Serif", Font.BOLD, 25));
		add.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MyThread t = new MyThread();
				t.start();
				list.add(t);
			}
		});

		stop.setFont(new Font("Serif", Font.BOLD, 25));
		stop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				isRunning = false;

				for (int i = 0; i < list.size(); i++) {
					try {
						Thread.sleep(200);
						System.out.println(list.get(i).isAlive());
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		panel.add(add);
		panel.add(stop);

		add(panel);

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Thread Creator");
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task01();
	}

	private class MyThread extends Thread {

		public void run() {
			int number = 1;
			while (isRunning) {
				System.out.println(number++);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (number == 100) {
					break;
				}
			}
		}

	}

}
