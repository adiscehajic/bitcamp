package ba.bitcamp.w06d02.lectures.geometry.voz;

import ba.bitcamp.w06d02.lectures.geometry.ITijelo;
import ba.bitcamp.w06d02.lectures.geometry.KompleksnoTijelo;
import ba.bitcamp.w06d02.lectures.geometry.Kvadrat;
import ba.bitcamp.w06d02.lectures.geometry.Pravougaonik;

public class Lokomotiva extends Baza {

	private int brojDimnjaka;

	public Lokomotiva(double duzina, final double visina, double velicinaTocka,
			double velicinaKabine, final double procenatProzoraNaKabini,
			int brojDimnjaka) {
		super(duzina, visina, velicinaTocka);
		// dodaj kabinu - kabina je kvadrat, kome je dio povrsine pod prozorima
		// kabina je anonimna klasa bazirana na kvadratu
		dodajDio(new Kvadrat(velicinaKabine) { // anonimna klasa

			public double povrsina() {
				return super.povrsina() * (1 - procenatProzoraNaKabini);
			}

		});

		// dodaj dimnjake
		// dimnjak je inner klasa
		for (int i = 0; i < brojDimnjaka; i++) {
			dodajDio(new Dimnjak(velicinaKabine));
		}

		// dodaj prednje svjetlo
		// svjetlo je anonimna klasa koja direktno implementira interface
		// ITijelo
		ITijelo svjetlo = new ITijelo() {

			public double povrsina() {
				return (visina / 2) * (visina / 2) * Math.PI / 2;
			}

			public double obim() {
				return visina + visina * Math.PI;
			}
		};

		dodajDio(svjetlo);
	}

	public String toString() {
		return String.format("Lokomotiva dimnjaka = %d", brojDimnjaka);
	}

	private class Dimnjak extends KompleksnoTijelo {
		public Dimnjak(double visina) {
			super(new Pravougaonik(visina / 3, visina), new Pravougaonik(
					visina / 3 + 10, 10));
		}
	}

}
