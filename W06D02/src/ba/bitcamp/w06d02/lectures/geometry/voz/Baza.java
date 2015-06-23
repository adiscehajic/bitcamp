package ba.bitcamp.w06d02.lectures.geometry.voz;

import ba.bitcamp.w06d02.lectures.geometry.KompleksnoTijelo;
import ba.bitcamp.w06d02.lectures.geometry.Krug;
import ba.bitcamp.w06d02.lectures.geometry.Pravougaonik;

public class Baza extends KompleksnoTijelo {

	private double duzina;
	private double visina;
	private double velicinaTocka;

	public Baza(double duzina, double visina, double velicinaTocka) {
		super(new Krug(velicinaTocka), new Krug(velicinaTocka),
				new Pravougaonik(duzina, visina));
	}

	public String toString() {
		return String.format(
				"Baza duzina = %f,  visina = %f, velicina tocka: %f", duzina,
				visina, velicinaTocka);
	}

}
