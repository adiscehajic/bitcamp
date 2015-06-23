package ba.bitcamp.w06d02.lectures.geometry.voz;

import ba.bitcamp.w06d02.lectures.geometry.KompleksnoTijelo;

public class Voz extends KompleksnoTijelo {

	public Voz(double duzinaBaze, double visinaBaze, int brojVagona) {
		super(
				new Lokomotiva(duzinaBaze, visinaBaze, 10, duzinaBaze / 2, 0.3,
						2));
		for (int i = 0; i < brojVagona; i++) {
			dodajDio(new Baza(duzinaBaze, visinaBaze, 10));
		}
	}

	public String toString() {
		return super.toString().replace("Kompleksno tijelo", "Voz");
	}

}
