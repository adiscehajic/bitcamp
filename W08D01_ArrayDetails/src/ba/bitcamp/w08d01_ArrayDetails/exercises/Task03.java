package ba.bitcamp.w08d01_ArrayDetails.exercises;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Task03 extends JFrame {

	private static final long serialVersionUID = -7516757260480495805L;

	private JMenuBar bar = new JMenuBar();
	private JMenu menu = new JMenu("Insert Text");
	private JMenuItem item = new JMenuItem("Insert");
	private JTextArea area = new JTextArea("sas");

	public Task03() {

		setJMenuBar(bar);
		bar.add(menu);
		menu.add(item);
		item.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new MyDialog();
			}
		});

		add(area);
		area.setEditable(false);

		setSize(450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Task 3");
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task03();
	}

	private class MyDialog extends JDialog {

		private static final long serialVersionUID = 1689243683047722354L;

		private JLabel label1 = new JLabel("Insert text: ");
		private JLabel label2 = new JLabel();
		private JTextField text = new JTextField(30);
		private JTextField index = new JTextField(30);

		public MyDialog() {

			setModalityType(ModalityType.APPLICATION_MODAL);
			setLayout(new FlowLayout());
			add(label1);
			add(text);
			add(label2);
			add(index);
			
			if (area.getText().length() > 0) {
				label2.setText(String.format(
						"Insert index from %d to %d: ", 0, area.getText().length()));
			} else {
				label2.setText(String.format(
						"Insert index %d: ", 0, area.getText().length()));
			}

			index.addKeyListener(new KeyAdapter() {

				public void keyPressed(KeyEvent e) {
					super.keyPressed(e);
					try {
						if (e.getKeyCode() == KeyEvent.VK_ENTER) {
							String str = area.getText();
							String str2 = str.substring(0,
									Integer.parseInt(index.getText()))
									+ text.getText()
									+ str.substring(
											Integer.parseInt(index.getText()),
											str.length());
							area.setText(str2);
							dispose();
						}
					} catch (StringIndexOutOfBoundsException ex) {
						JOptionPane.showMessageDialog(null,
								"Inputed index does not exist!");
					}
				}

			});

			setSize(450, 150);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(null);
			setTitle("Dialog");
			setVisible(true);
		}
	}

}
