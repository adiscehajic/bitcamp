package ba.bitcamp.w06d02.exercises.homework;

public class Client extends Computer implements Connectable {

	private Computer connectedToComp;
	private Network connectedToNet;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param macAddress
	 */
	public Client(String name, char[] macAddress) {
		super(name, macAddress);
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "Connected to computer: " + connectedToComp + "\n";
		s += "Connected to network: " + connectedToNet + "\n";
		return s;
	}

	/**
	 * Checks if the two clients are equal.
	 * 
	 * @param obj
	 * @return
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (connectedToComp == null) {
			if (other.connectedToComp != null)
				return false;
		} else if (!connectedToComp.equals(other.connectedToComp))
			return false;
		if (connectedToNet == null) {
			if (other.connectedToNet != null)
				return false;
		} else if (!connectedToNet.equals(other.connectedToNet))
			return false;
		return true;
	}

	/**
	 * Connects the client computer to inputed computer.
	 * 
	 * @param comp
	 */
	public void connect(Computer comp) {
		if (connectedToComp != null || connectedToNet != null) {
			throw new IllegalArgumentException();
		}
		connectedToComp = comp;
	}

	/**
	 * Connects the client network to inputed network.
	 * 
	 * @param net
	 */
	public void connect(Network net) {
		if (connectedToComp != null || connectedToNet != null) {
			throw new IllegalArgumentException("");
		}
		connectedToNet = net;
	}

	/**
	 * Disconnects the client computer and network.
	 */
	public void disconnect() {
		connectedToComp = null;
		connectedToNet = null;
	}

	/*
	 * Get methods
	 */
	public Computer getConnectedToComp() {
		return connectedToComp;
	}

	public Network getConnectedToNet() {
		return connectedToNet;
	}
}
