package ba.bitcamp.w11D02_Networking.exercises.guiNetwork;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChatPanel extends JPanel {

	private static final long serialVersionUID = -5533260342842566689L;
	
	private JTextField text = new JTextField("Enter message");
	private JButton button = new JButton("Send");
	
	public ChatPanel() {
		
		setLayout(new BorderLayout());
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Socket socket;
				try {
					socket = new Socket("10.0.82.98", 8888);

					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
					
					writer.write(text.getText());
					text.setText("");
					writer.newLine();
					writer.flush();
				} catch (UnknownHostException e1) {
					e1.printStackTrace();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
				
			}
		});
		
		add(text, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
			
	}
}
