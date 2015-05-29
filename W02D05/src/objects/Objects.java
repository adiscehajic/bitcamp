package objects;

import models.Planeta;

public class Objects {

	public static void main(String[] args) {

		Planeta pl = new Planeta(1000, 600, "Lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		pl.racunajTezinu();
		System.out.println("PL tezina: " + pl.racunajTezinu());
		System.out.println("PL masa: " + pl.vrijednostMase());

		Planeta bl = new Planeta(435, 444, "Kocka", "Kockasia");
		System.out.println("BL tezina: " + bl.racunajTezinu());
		System.out.println("BL masa: " + bl.vrijednostMase());
		
		bl.dodajMasu(-300);
		System.out.println("BL tezina " + bl.racunajTezinu());
		System.out.println("BL masa: " + bl.vrijednostMase());
		
		
		
	}

}
