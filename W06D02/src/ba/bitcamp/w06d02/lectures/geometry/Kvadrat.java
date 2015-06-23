package ba.bitcamp.w06d02.lectures.geometry;

public class Kvadrat extends Pravougaonik {

	public Kvadrat(double a) {
		super(a, a);
	}

	public String toString() {
		return String.format("Kvadrat(a=%f)", getA());
	}

}
