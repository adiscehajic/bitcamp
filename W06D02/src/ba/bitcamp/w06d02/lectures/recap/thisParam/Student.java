package ba.bitcamp.w06d02.lectures.recap.thisParam;

public class Student {

	private String ime;
	private int[] ocjene;

	public Student(String ime, int... ocjene) {
		this.ime = ime;
		this.ocjene = ocjene;
	}

	@Override
	public String toString() {
		return ime + ":" + prosjecnaStaticOcjena(this);
	}

	public double prosjecnaInstanceOcjena() {
		return prosjecnaStaticOcjena(this);
	}

	public static double prosjecnaStaticOcjena(Student st) {
		int suma = 0;

		for (int o : st.ocjene) {
			suma += o;
		}
		return (double) suma / st.ocjene.length;
	}

}
