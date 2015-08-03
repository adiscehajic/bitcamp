package ba.bitcamp.w12d01_Recapitulation.exercises;

public class Message {

	private String name;
	private String timestamp;
	private String message;
	
	public Message() {
		name = null;
		timestamp = null;
		message = null;
	}

	public Message(String name, String timestamp, String message) {
		super();
		this.name = name;
		this.timestamp = timestamp;
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
