package ba.bitcamp.w09d01_LinkedDataStructures.lectures;

public class Trip {

	private Place start;

	public Place getStart() {
		return start;
	}

	public void setStart(Place start) {
		this.start = start;
	}

	public void add(Place newPlace) {
		if (start == null) {
			start = newPlace;
		} else {
			Place last = start;

			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newPlace);
		}
	}
	
	public String toString() {
		String result = "";
		
		Place currentPlace = start;
		
		while (currentPlace != null) {
			result += currentPlace.getName() + "\n";
			currentPlace = currentPlace.getNext();		
		}
		return result;
	}

}
