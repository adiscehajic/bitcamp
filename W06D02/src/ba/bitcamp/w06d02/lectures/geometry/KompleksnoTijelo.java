package ba.bitcamp.w06d02.lectures.geometry;

import java.util.Arrays;

public class KompleksnoTijelo implements ITijelo {

	ITijelo[] dijelovi;

	public KompleksnoTijelo(ITijelo... pocetniDijelovi) {
		dijelovi = pocetniDijelovi;
		// TODO Provjeri da li su dijelovi razliciti od null
		// TODO Enkapsuliraj bolje - kopiraj niz
	}

	@Override
	public String toString() {
		return String.format("Kompleksno tijelo (%s)",
				Arrays.toString(dijelovi));
	}

	public void dodajDio(ITijelo dio) {

		if (dio != null && dio != this) {
			// Dijelovi ne moze biti nikad null / moze biti samo prazan niz
			ITijelo[] novi = new ITijelo[dijelovi.length + 1];
			System.arraycopy(dijelovi, 0, novi, 0, dijelovi.length);

			novi[novi.length - 1] = dio;
			dijelovi = novi;
		} else {
			throw new UnsupportedOperationException(
					"Ne moze se dodati null dio ili sam sebe kao dio!");
		}

	}

	@Override
	public double povrsina() {

		// Dijelovi ne moze biti nikad null / moze biti samo prazan niz
		double ukupnaPovrsina = 0;
		for (ITijelo dio : dijelovi) {
			ukupnaPovrsina += dio.povrsina();
		}
		return ukupnaPovrsina;

	}

	@Override
	public double obim() {

		// Dijelovi ne moze biti nikad null / moze biti samo prazan niz
		double ukupanObim = 0;
		for (ITijelo dio : dijelovi) {
			ukupanObim += dio.obim();
		}
		return ukupanObim;

	}

}
