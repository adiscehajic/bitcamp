package mmorpg_chat;
import java.io.*;

/**
 * 
 * @author Adis Cehajic & Amra Sabic
 *
 */
public class ChatMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	/*
	 * Declaration of final constants (types of messages) : WHO_IS_ONLINE to
	 * receive the list of the users connected, MESSAGE an ordinary message,
	 * LOGOUT to disconnect from the Server
	 */
	protected static final int WHO_IS_ONLINE = 0, MESSAGE = 1, LOGOUT = 2;
	
	// Declaration of parameters
	private int type;
	private String message;

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param message
	 */
	ChatMessage(int type, String message) {
		this.type = type;
		this.message = message;
	}

	// Auto-generated getters for type and message

	int getType() {
		return type;
	}

	String getMessage() {
		return message;
	}
}
