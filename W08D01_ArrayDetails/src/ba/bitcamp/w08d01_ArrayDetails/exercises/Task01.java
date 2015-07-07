package ba.bitcamp.w08d01_ArrayDetails.exercises;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class Task01 extends JFrame {

	private static final long serialVersionUID = 4766412159083096129L;

	private JButton button1 = new JButton("Button 1");
	private JButton button2 = new JButton("Button 2");

	public Task01() {

		setLayout(new GridLayout(1, 2));

		add(button1);
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new MyDialogOne();
			}
		});
		
		add(button2);
		button2.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
			new MyDialogTwo();				
			}
		});

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 1");
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task01();
	}
	
	public class MyDialogOne extends JDialog {

		private static final long serialVersionUID = -7801127601786737392L;

		public MyDialogOne() {
			setModalityType(ModalityType.MODELESS);
			setSize(450, 300);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setTitle("Modeless");
			setVisible(true);
		}
	}
	
	public class MyDialogTwo extends JDialog {

		private static final long serialVersionUID = -7801127601786737392L;

		public MyDialogTwo() {
			setModalityType(ModalityType.APPLICATION_MODAL);
			setSize(450, 300);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setTitle("Application Modal");
			setVisible(true);
		}
	}

}
