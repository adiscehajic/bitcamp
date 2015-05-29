package exercises;

class Drink {
	private String name; // plavi su jer su atributi
	private boolean isSoda;
	private int expirationYear;
	private String color;

	public Drink(String n, boolean s, int z, String c) {
		name = n;
		isSoda = s;
		expirationYear = z;
		color = c;
	}

	public String toString() {
		String s = "";
		s = s + "Name: " + name + "\n";
		s = s + "Is soda: " + isSoda + "\n";
		s = s + "Expiration year: " + expirationYear + "\n";
		s = s + "Color: " + color + "\n";
		return s;
	}

}
