package ba.bitcamp.w08d01_ArrayDetails.exercises;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Task02 extends JFrame {

	private static final long serialVersionUID = -5335187740361545961L;

	private JLabel label = new JLabel("Enter email: ");
	private JTextField text = new JTextField();
	private JButton button = new JButton("Check");
	private JLabel labelDialog = new JLabel("Email is not taken!");

	private String[] emails = new String[] { "adis.cehajic@bitcamp.ba",
			"dinko.hodyic@bitcamp.ba", "gordan.masic@bitcamp.ba",
			"zaid.zerdo@bitcamp.ba" };

	public Task02() {

		setLayout(new BorderLayout());

		add(label, BorderLayout.WEST);
		label.setFont(new Font("Serif", Font.PLAIN, 25));
		add(text, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		button.setFont(new Font("Serif", Font.PLAIN, 25));
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < emails.length; i++) {
					if (text.getText().equals(emails[i])) {
						labelDialog.setText("Email is taken!");
					}
				}
				new MyDialog();
			}
		});

		setSize(400, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 2");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task02();
	}
	
	public class MyDialog extends JDialog {

		private static final long serialVersionUID = -7260571470072730993L;
		
		
		public MyDialog() {
			
			add(labelDialog);
			labelDialog.setHorizontalAlignment(JLabel.CENTER);
			labelDialog.setFont(new Font("Serif", Font.BOLD, 25));
			
			setModalityType(ModalityType.MODELESS);
			setSize(400, 100);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setTitle("Dialog");
			setVisible(true);
		}
		
	}

}
