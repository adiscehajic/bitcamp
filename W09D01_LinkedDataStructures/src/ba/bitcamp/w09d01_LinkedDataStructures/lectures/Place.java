package ba.bitcamp.w09d01_LinkedDataStructures.lectures;

public class Place {

	private String name;
	private Place next;

	public Place(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Place getNext() {
		return next;
	}

	public void setNext(Place next) {
		this.next = next;
	}

}
