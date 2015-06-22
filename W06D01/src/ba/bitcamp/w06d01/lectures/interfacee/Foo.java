package ba.bitcamp.w06d01.lectures.interfacee;

public class Foo implements Compare, Comparable {

	private int foones;

	public Foo(int foones) {
		super();
		this.foones = foones;
	}

	public int getFoones() {
		return foones;
	}

	public void setFoones(int foones) {
		this.foones = foones;
	}

	public String toString() {
		return "Foo: " + foones;
	}

	/**
	 * Compares two foos and returns value for a status of comparing.
	 *
	 * @param other
	 *            - Second foo.
	 * @return The result of comparing.
	 */
	@Override
	public int compare(Object o) {
		if (o instanceof Foo) {
			Foo other = (Foo) o;
			if (this.foones > other.foones) {
				return 1;
			} else if (this.foones == other.foones) {
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int compareTo(Object o) {
		return compare(o);
	}
}
