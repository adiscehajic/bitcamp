package ba.bitcamp.w06d02.exercises.homework;

public class StarNetwork extends Network implements Functionable {

	//private Server server;

	public StarNetwork(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFunctioning() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Add computer in the computer array network.
	 * 
	 * @param pc
	 *            - Computer that user want to add.
	 */
	public void addComputer(Computer pc) {

		Client c = (Client) pc;

		Computer[] added = new Computer[getComputers().length + 1];

		// Checks if the network is empty
		if (getComputers()[0] == null) {
			added[0] = c;
			c.connect(this);
		} else {
			System.arraycopy(getComputers(), 0, added, 0, getComputers().length);
			added[added.length - 1] = c;
			c.connect(this);
			setComputers(added);
		}

	}

	/**
	 * Remove computer from the computer array network.
	 * 
	 * @param pc
	 *            - Computer that user want to remove.
	 */
	public void removeComputer(Computer pc) {

		Client c = (Client) pc;

		for (int i = 0; i < getComputers().length; i++) {
			if (c.equals(getComputers()[i])) {
				c.disconnect();
				getComputers()[i] = null;
			} else {
				throw new IllegalArgumentException();
			}
		}

		Computer[] removed = new Computer[getComputers().length - 1];

		for (int i = 0; i < removed.length; i++) {
			if (getComputers()[i] != null) {
				removed[i] = getComputers()[i];
			}
		}
		setComputers(removed);
	}

}
