package mmorpg_chat;
import java.net.*;
import java.io.*;
import java.util.*;

import mmorpg.Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Client
 * <p>
 * Client with all funkcionality.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class Client {

	// for I/O
	private ObjectInputStream reader; // to read from the socket
	private ObjectOutputStream writer; // to write on the socket
	private Socket socket;

	// if I use a GUI or not
	private ClientGUI clientGUI;

	// the server, the port and the username
	public String server;
	public static String username;
	private int port;

	/*
	 * Constructor called by console mode server: the server address port: the
	 * port number username: the username
	 */
	Client(String server, String username) {
		// which calls the common constructor with the GUI set to null
		this(server, username, null);
		this.port = Server.PORT;
	}

	/*
	 * Constructor call when used from a GUI in console mode the ClienGUI
	 * parameter is null
	 */
	Client(String server, String username, ClientGUI cg) {
		this.server = server;
		this.port = Server.PORT;
		this.username = username;
		// save if we are in GUI mode or not
		this.clientGUI = cg;
	}

	/*
	 * To start the dialog
	 */
	public boolean start() {
		// try to connect to the server
		try {
			socket = new Socket(server, port);					
		}
		// if it failed not much I can so
		catch (Exception ec) {
			display("Error connectiong to server:" + ec);
			return false;
		}

		String msg = "Connection accepted " + socket.getInetAddress() + ":"
				+ socket.getPort();
		display(msg);
		

		/* Creating both Data Stream */
		try {
			reader = new ObjectInputStream(socket.getInputStream());
			writer = new ObjectOutputStream(socket.getOutputStream());
		} catch (IOException eIO) {
			display("Exception creating new Input/output Streams: " + eIO);
			return false;
		}

		// creates the Thread to listen from the server
		new ListenFromServer().start();
		
		// Send our username to the server this is the only message that we
		// will send as a String. All other messages will be ChatMessage objects
		try {
			writer.writeObject(username);
		} catch (IOException eIO) {
			display("Exception doing login : " + eIO);
			disconnect();
			return false;
		}
		// success we inform the caller that it worked
		
		return true;
		
	}

	/*
	 * To send a message to the console or the GUI
	 */
	private void display(String msg) {
		clientGUI.append(msg + "\n");
	}

	/*
	 * To send a message to the server
	 */
	void sendMessage(ChatMessage msg) {
		try {
			writer.writeObject(msg);
		} catch (IOException e) {
			display("Exception writing to server: " + e);
		}
	}

	/*
	 * When something goes wrong Close the Input/Output streams and disconnect
	 * not much to do in the catch clause
	 */
	private void disconnect() {
		try {
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
			if (socket != null) {
				socket.close();
			}
		} catch (Exception e) {
		} // not much else I can do

		// inform the GUI
		if (clientGUI != null)
			clientGUI.connectionFailed();

	}

	/*
	 * To start the Client in console mode use one of the following command >
	 * java Client > java Client username > java Client username portNumber >
	 * java Client username portNumber serverAddress at the console prompt If
	 * the portNumber is not specified 1500 is used If the serverAddress is not
	 * specified "localHost" is used If the username is not specified
	 * "Anonymous" is used > java Client is equivalent to > java Client
	 * Anonymous 1500 localhost are eqquivalent
	 * 
	 * In console mode, if an error occurs the program simply stops when a GUI
	 * id used, the GUI is informed of the disconnection
	 */
	public static void main(String[] args) {
		
		// default values
		int portNumber = Server.PORT;
		String serverAddress = "localhost";
		String userName = "Anonymous";

		// create the Client object
		Client client = new Client(serverAddress, userName);
		// test if we can start the connection to the Server
		// if it failed nothing we can do
		if (!client.start())
			return;

		// wait for messages from user
		Scanner scan = new Scanner(System.in);
		// loop forever for message from the user
		while (true) {
			
			System.out.print("> ");
			// read message from user
			String msg = scan.nextLine();
			// logout if message is LOGOUT
			if (msg.equalsIgnoreCase("LOGOUT")) {
				client.sendMessage(new ChatMessage(ChatMessage.LOGOUT, ""));
				// break to do the disconnect
				break;
			}
			// message WhoIsIn
			else if (msg.equalsIgnoreCase("WHO_IS_ONLINE")) {
				client.sendMessage(new ChatMessage(ChatMessage.WHO_IS_ONLINE,
						""));
			} else { // default to ordinary message
				client.sendMessage(new ChatMessage(ChatMessage.MESSAGE, msg));
			}
		}
		// done disconnect
		client.disconnect();
	}

	/*
	 * a class that waits for the message from the server and append them to the
	 * JTextArea if we have a GUI or simply System.out.println() it in console
	 * mode
	 */
	class ListenFromServer extends Thread {

		public void run() {
			while (true) {
				
//				AppGameContainer appgc;
//				try {
//					appgc = new AppGameContainer(new Game("Game"));
//					appgc.setDisplayMode(800, 600, false);
//					appgc.setShowFPS(false);
//				//	if (ClientGUI.start) {					
//						appgc.start();
//					//}
//				} catch (SlickException e1) {
//					e1.printStackTrace();
//				}
				
				
				try {
					String msg = (String) reader.readObject();
					// if console mode print the message and add back the prompt
					if (clientGUI == null) {
						System.out.println(msg);
						System.out.print("> ");
					} else {
						clientGUI.append(msg);
					}
				} catch (IOException e) {
					display("Server has close the connection: " + e);
					if (clientGUI != null)
						clientGUI.connectionFailed();
					break;
				}
				// can't happen with a String object but need the catch anyhow
				catch (ClassNotFoundException e2) {
				}
			}
		}
	}
}
