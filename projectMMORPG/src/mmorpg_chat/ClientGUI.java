package mmorpg_chat;

import javax.swing.*;

import mmorpg.Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;


/**
 * GUI for client
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class ClientGUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	// will first hold "Username:", later on "Enter message"
	private JLabel label;
	// to hold the Username and later on the messages
	private JTextField tf;
	// to hold the server address an the port number
	private JTextField tfServer, tfPort;
	// to Logout and get the list of the users
	private JButton login, logout, whoIsOnline;
	// for the chat room
	private JTextArea ta;
	// if it is for connection
	private boolean connected;
	// the Client object
	private Client client;
	// the default port number
	private int defaultPort;
	private String defaultHost;

	public static boolean start = false;

	// Constructor connection receiving a socket number
	ClientGUI(String host) {
		super("Chat Client");
		
		defaultPort = Server.PORT;
		defaultHost = host;
		
		// The NorthPanel with
		JPanel northPanel = new JPanel(new GridLayout(3,1));
		// the server name and the port number
//		JPanel serverAndPort = new JPanel(new GridLayout(1,5, 1, 3));
		// the two JTextField with default value for server address and port number
		tfServer = new JTextField(host);
		tfPort = new JTextField("" + defaultPort);
		tfPort.setHorizontalAlignment(SwingConstants.RIGHT);

//		serverAndPort.add(new JLabel("Server Address:  "));
//		serverAndPort.add(tfServer);
//		serverAndPort.add(new JLabel("Port Number:  "));
//		serverAndPort.add(tfPort);
//		serverAndPort.add(new JLabel(""));
//		// adds the Server an port field to the GUI
//		northPanel.add(serverAndPort);

		// the Label and the TextField
		label = new JLabel("Enter your username below", SwingConstants.CENTER);
		northPanel.add(label);
		tf = new JTextField("Anonymous");
		tf.setBackground(Color.WHITE);
		northPanel.add(tf);
		add(northPanel, BorderLayout.SOUTH);

		// The CenterPanel which is the chat room
		ta = new JTextArea("Simplistic MMORPG Chat \n", 80, 80);
		JPanel centerPanel = new JPanel(new GridLayout(1,1));
		
		ta.setEditable(false);
		JScrollPane scrollChat = new JScrollPane(ta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		centerPanel.add(scrollChat);
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		
		add(centerPanel, BorderLayout.CENTER);

		// the 3 buttons
		login = new JButton("Login");
		login.addActionListener(this);
		
		logout = new JButton("Logout");
		logout.addActionListener(this);
		logout.setEnabled(false);		// you have to login before being able to logout
		
		whoIsOnline = new JButton("Who is online");
		whoIsOnline.addActionListener(this);
		whoIsOnline.setEnabled(false);		// you have to login before being able to Who is in

		JPanel southPanel = new JPanel();
		southPanel.add(login);
		southPanel.add(logout);
		southPanel.add(whoIsOnline);
		add(southPanel, BorderLayout.NORTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
		tf.requestFocus();
		
	}

	// called by the Client to append text in the TextArea 
	void append(String str) {
		ta.append(str);
		ta.setCaretPosition(ta.getText().length() - 1);
	}
	// called by the GUI is the connection failed
	// we reset our buttons, label, textfield
	void connectionFailed() {
		login.setEnabled(true);
		logout.setEnabled(false);
		whoIsOnline.setEnabled(false);
		label.setText("Enter your username: ");
		tf.setText("Anonymous");
		// reset port number and host name as a construction time
		tfPort.setText("" + defaultPort);
		tfServer.setText(defaultHost);
		// let the user change them
		tfServer.setEditable(false);
		tfPort.setEditable(false);
		// don't react to a <CR> after the user name
		tf.removeActionListener(this);
		connected = false;
	}
		
	/*
	* Button or JTextField clicked
	*/
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		// if it is the Logout button
		if(o == logout) {
			client.sendMessage(new ChatMessage(ChatMessage.LOGOUT, ""));
			return;
		}
		// if it the who is in button
		if(o == whoIsOnline) {
			client.sendMessage(new ChatMessage(ChatMessage.WHO_IS_ONLINE, ""));				
			return;
		}

		// ok it is coming from the JTextField
		if(connected) {
			// just have to send the message
			client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, tf.getText()));				
			tf.setText("");
			return;
		}
		
		if(o == login) {
			
			start = true;
			// ok it is a connection request
			String username = tf.getText().trim();
			// empty username ignore it
			if(username.length() == 0)
				return;
			// empty serverAddress ignore it
			String server = tfServer.getText().trim();
			if(server.length() == 0)
				return;
			// empty or invalid port numer, ignore it
			String portNumber = tfPort.getText().trim();
			if(portNumber.length() == 0)
				return;
			int port = 0;
			try {
				port = Integer.parseInt(portNumber);
			}
			catch(Exception en) {
				return;   // nothing I can do if port number is not valid
			}

			// try creating a new Client with GUI
			client = new Client(server, username, this);
			// test if we can start the Client
			if(!client.start()) 
				return;
			tf.setText("");
			label.setText("Enter your message: ");
			
			connected = true;
			
			// disable login button
			login.setEnabled(false);
			// enable the 2 buttons
			logout.setEnabled(true);
			whoIsOnline.setEnabled(true);
			// disable the Server and Port JTextField
			tfServer.setEditable(false);
			tfPort.setEditable(false);
			// Action listener for when the user enter a message
			tf.addActionListener(this);
			
			if (connected) {				
				new StartGame().start();
			}
		}
	}

	// to start the whole thing the server
	public static void main(String[] args) {
		// 92.36.159.184 
		// localhost
		new ClientGUI("localhost");
		
	}
	
	 class StartGame extends Thread {
		 
		public void run() {
				AppGameContainer appgc;
				try {
					appgc = new AppGameContainer(new Game("Game"));
					appgc.setDisplayMode(800, 600, false);
					appgc.setShowFPS(false);
					//appgc.setClearEachFrame(false);
					//GameContainer.enableSharedContext();
				
					//	if (ClientGUI.start) {					
						appgc.start();
					//}
				} catch (SlickException e1) {
					e1.printStackTrace();
				}
		}
	}

}

