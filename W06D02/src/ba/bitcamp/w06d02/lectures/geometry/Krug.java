package ba.bitcamp.w06d02.lectures.geometry;

public class Krug implements ITijelo {

	private double r;

	public Krug(double r) {
		this.r = r;
	}

	public double povrsina() {
		return r * r * Math.PI;
	}

	public double obim() {
		return 2 * r * Math.PI;
	}
	
	public String toString() {
		return String.format("Krug(r=%f)", r);
	}

}
