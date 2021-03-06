package ba.bitcamp.w05d05.lectures.thisandsuper;

import java.util.Random;
import java.util.Scanner;

/*
 * max broj od 1 do 99
 * maxBrojPokusaja 5
 * ako ne pogodi ispise poruku "Izgubio si!"
 */
public class PogodiBroj {

	/*
	 * Declaring properties
	 */
	public int maxBroj;
	public int maxBrojPokusaja;

	/**
	 * Constructor
	 * 
	 * @param maxBroj
	 *            - Range of numbers
	 * @param maxBrojPokusaja
	 *            - Number of tries that user have
	 */
	public PogodiBroj(int maxBroj, int maxBrojPokusaja) {
		super();
		this.maxBroj = maxBroj;
		this.maxBrojPokusaja = maxBrojPokusaja;
	}

	/**
	 * Constructor
	 * 
	 * @param maxBroj
	 *            - Range of numbers
	 */
	public PogodiBroj(int maxBroj) {
		this(maxBroj, (maxBroj / 100) + 1);
	}

	/**
	 * Constructor
	 */
	public PogodiBroj() {
		this(1000, 10);
	}

	/**
	 * Method that checks inputed number
	 * 
	 * @param maxBroj
	 * @param maxBrojPokusaja
	 */
	public void igraj(int maxBroj, int maxBrojPokusaja) {

		Scanner in = new Scanner(System.in);
		// Declaring variable that will count number of tries
		int pokusaj = 0;

		// Calling method generateBroj and generating random number
		int randNumber = generateBroj(maxBroj);

		// Playing the game
		do {
			// Inputing number
			System.out.println("Pokusaj pogoditi broj: ");
			int broj = in.nextInt();

			// Calculating if the inputed number is equal to the random number
			if (broj == randNumber) {
				System.out.println("Cestitam");
			} else {
				// Increasing number of tries
				pokusaj++;
				// If the number of tries is equal to the max number stops
				if (pokusaj == maxBrojPokusaja) {
					break;
				}
				System.out.println("Zao mi je pokusaj ponovo.");
			}

		} while (pokusaj < maxBrojPokusaja);

		// If the user has not guess the number prints message
		if (pokusaj == maxBrojPokusaja) {
			System.out.println("Looseru izgubio si");
		}

		in.close();

	}

	/**
	 * Generating the number in given range
	 * 
	 * @param maxBroj
	 *            - given range
	 * @return Random number
	 */
	public int generateBroj(int maxBroj) {
		this.maxBroj = maxBroj;
		// Declaring variable rand
		Random rand = new Random();

		// Declaring randomNumber in given range
		int randomBroj = rand.nextInt(this.maxBroj);

		return randomBroj;
	}

	/**
	 * Game level one
	 */
	public static void igrajLevelOne() {

		// Creating instance pb
		PogodiBroj pb = new PogodiBroj(100, 5);

		pb.igraj(pb.maxBroj, pb.maxBrojPokusaja);

	}

	/**
	 * Game level one
	 */
	public static void igrajLevelTwo() {

		// Creating instance pb
		PogodiBroj pb = new PogodiBroj(200);

		pb.igraj(pb.maxBroj, pb.maxBrojPokusaja);

	}

	/**
	 * Game level three
	 */
	public static void igrajLevelThree() {

		// Creating instance pb
		PogodiBroj pb = new PogodiBroj();

		pb.igraj(pb.maxBroj, pb.maxBrojPokusaja);

	}

}
