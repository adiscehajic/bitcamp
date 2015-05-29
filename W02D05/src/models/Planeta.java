package models;

public class Planeta {
	
	private static final Integer g = 10;
	private Integer tezina;
	private Integer masa;
	private String oblik;
	private String ime;

	/**
	 * Ovo je defaultni konstruktor nase klase
	 * @param tezina
	 * @param masa
	 * @param oblik
	 * @param ime
	 */
	public Planeta(Integer tezina, Integer masa, String oblik, String ime) {
		super();
		this.tezina = tezina;
		this.masa = masa;
		this.oblik = oblik;
		this.ime = ime;
	}

	/**
	 * Metoda za dodavanje mase
	 * 
	 * @param dodatak
	 */
	public void dodajMasu(Integer dodatak) {
		this.masa += dodatak;
	}
	
	/**
	 * Metoda za ispis vrijednosti mase
	 * @return
	 */
	public Integer vrijednostMase() {
		return this.masa;
	}
	
	/**
	 * Metoda za racunanje tezine tijela
	 * @return
	 */
	public Integer racunajTezinu(){
		this.tezina = this.masa * g;
		return this.tezina;
	}

}
