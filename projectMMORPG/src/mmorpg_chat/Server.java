package mmorpg_chat;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import mmorpg.Game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

/**
 * Server
 * <p>
 * Server with all funkcionality.
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class Server {

	protected static final int PORT = 1902;
	// Declaration of parameters
	private static int uniqueId;
	private ArrayList<Clients> clients;
	private ServerGUI serverGUI;
	private SimpleDateFormat dateFormat;
	private int port;
	private boolean keepRunning;

	/**
	 * Empty constructor
	 * <p>
	 * To change port? <------ provjeri treba li ti prazni konstruktor uopste
	 * 
	 * @param port
	 */
	public Server() {
		this(null);
		this.port = PORT;
	}

	/**
	 * Constructor
	 * 
	 * @param port
	 * @param serverGUI
	 */
	public Server(ServerGUI serverGUI) {
		// GUI or not
		this.serverGUI = serverGUI;
		// the port
		this.port = PORT;
		// to display hh:mm:ss
		dateFormat = new SimpleDateFormat("HH:mm:ss");
		// ArrayList for the Client list
		clients = new ArrayList<Clients>();
	}

	/**
	 * Method to start Server
	 */
	public void start() {
		keepRunning = true;
		/* create socket server and wait for connection requests */
		try {
			// the socket used by the server
			ServerSocket serverSocket = new ServerSocket(port);

			// infinite loop to wait for connections
			while (keepRunning) {
				// format message saying we are waiting
				display("Server waiting for Clients on port " + port + ".");

				Socket socket = serverSocket.accept(); // accept connection
				// if I was asked to stop
				if (!keepRunning) {
					break;
				}
				Clients c = new Clients(socket); // make a thread of it
				clients.add(c); // save it in the ArrayList
				c.start();
			}
			// I was asked to stop
			try {
				serverSocket.close();
				for (int i = 0; i < clients.size(); ++i) {
					Clients tc = clients.get(i);
					try {
						tc.reader.close();
						tc.writer.close();
						tc.socket.close();
					} catch (IOException e) {
						display("Failed to close.." + e);
					}
				}
			} catch (Exception e) {
				String msg = dateFormat.format(new Date())
						+ " Failed to close..\n";
				display(msg);
			}
		}
		// something went bad
		catch (IOException e) {
			String msg = dateFormat.format(new Date())
					+ " Exception on new ServerSocket: " + e + "\n";
			display(msg);
		}
	}

	/*
	 * For the GUI to stop the server
	 */
	protected void stop() {
		keepRunning = false;
		// connect to myself as Client to exit statement
		// Socket socket = serverSocket.accept();
		try {
			new Socket("localhost", port);
		} catch (Exception e) {
			// TODO write smthing
		}
	}

	/*
	 * Display an event (not a message) to the console or the GUI
	 */
	private void display(String msg) {
		String time = dateFormat.format(new Date()) + " " + msg;
		serverGUI.appendEvent(time + "\n");
	}

	/*
	 * to broadcast a message to all Clients
	 */
	private synchronized void broadcast(String message) {
		// add HH:mm:ss and \n to the message
		String time = dateFormat.format(new Date());
		String messageLf = time + " " + message + "\n";
		serverGUI.appendRoom(messageLf); // append in the room window

		// we loop in reverse order in case we would have to remove a Client
		// because it has disconnected
		for (int i = clients.size(); --i >= 0;) {
			Clients ct = clients.get(i);
			// try to write to the Client if it fails remove it from the list
			if (!ct.writeMsg(messageLf)) {
				clients.remove(i);
				display("Disconnected Client " + ct.username
						+ " removed from list.");
			}
		}
	}

	// for a client who log off using the LOGOUT message
	synchronized void remove(int id) {
		// scan the array list until we found the Id
		for (int i = 0; i < clients.size(); ++i) {
			Clients ct = clients.get(i);
			// found it
			if (ct.id == id) {
				clients.remove(i);
				return;
			}
		}
	}

	/*
	 * To run as a console application just open a console window and: > java
	 * Server > java Server portNumber If the port number is not specified 1500
	 * is used
	 */
	public static void main(String[] args) {

		// create a server object and start it
		Server server = new Server();
		server.start();
	}

	/** One instance of this thread will run for each client */
	class Clients extends Thread {
		// the socket where to listen/talk
		Socket socket;
		ObjectInputStream reader;
		ObjectOutputStream writer;
		// my unique id (easier for deconnection)
		int id;
		// the Username of the Client
		String username;
		// the only type of message a will receive
		ChatMessage msg;
		// the date I connect
		String date;

		// Constructore
		Clients(Socket socket) {
			// a unique id
			id = ++uniqueId;
			this.socket = socket;
			/* Creating both Data Stream */
			System.out
					.println("Thread trying to create Object Input/Output Streams");
			try {
				// create output first
				writer = new ObjectOutputStream(socket.getOutputStream());
				reader = new ObjectInputStream(socket.getInputStream());
				// read the username
				username = (String) reader.readObject();
				display(username + " just connected.");
			} catch (IOException e) {
				display("Exception creating new Input/output Streams: " + e);
				return;
			}
			// have to catch ClassNotFoundException
			// but I read a String, I am sure it will work
			catch (ClassNotFoundException e) {
			}
			date = new Date().toString() + "\n";
		}

		// what will run forever
		public void run() {
			
			// to loop until LOGOUT
			boolean keepGoing = true;
			while (keepGoing) {
				// read a String (which is an object)
				try {
					msg = (ChatMessage) reader.readObject();
				} catch (IOException e) {
					display(username + " Exception reading Streams: " + e);
					break;
				} catch (ClassNotFoundException e2) {
					break;
				}
				// the message part of the ChatMessage
				String message = msg.getMessage();

				// Switch on the type of message receive
				switch (msg.getType()) {

				case ChatMessage.MESSAGE:
					broadcast(username + ": " + message);
					break;
				case ChatMessage.LOGOUT:
					display(username + " disconnected with a LOGOUT message.");
					keepGoing = false;
					break;
				case ChatMessage.WHO_IS_ONLINE:
					writeMsg("List of the users connected at "
							+ dateFormat.format(new Date()) + "\n");
					// scan al the users connected
					for (int i = 0; i < clients.size(); ++i) {
						Clients ct = clients.get(i);
						writeMsg((i + 1) + ") " + ct.username + " since "
								+ ct.date);
					}
					break;
				}
			}
			// remove myself from the arrayList containing the list of the
			// connected Clients
			remove(id);
			close();
		}

		// try to close everything
		private void close() {
			// try to close the connection
			try {
				if (writer != null) {
					writer.close();
				}
				if (reader != null) {
					reader.close();
				}
				if (socket != null) {
					socket.close();
				}
			} catch (Exception e) {
				display("Failed to close.. \n" );
			}
		}

		/*
		 * Write a String to the Client output stream
		 */
		private boolean writeMsg(String msg) {
			// if Client is still connected send the message to it
			if (!socket.isConnected()) {
				close();
				return false;
			}
			// write the message to the stream
			try {
				writer.writeObject(msg);
			}
			// if an error occurs, do not abort just inform the user
			catch (IOException e) {
				display("Error sending message to " + username);
				display(e.toString());
			}
			return true;
		}
	}
}
