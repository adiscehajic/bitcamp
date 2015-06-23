package ba.bitcamp.w06d02.lectures.geometry;

public class Pravougaonik implements ITijelo {

	private double a, b;

	public Pravougaonik(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double povrsina() {
		return a * b;
	}

	public double obim() {
		return 2 * (a + b);
	}

	public String toString() {
		return String.format("Pravougaonik(a=%f, b=%f)", a, b);
	}

	public double getA() {
		return a;
	}

}
