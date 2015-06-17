package ba.bitcamp.w05d03.lectures.cards;

/**
 * This class represents a Card from a standard deck The values go from 1 - 13
 * 11 / Jack 12 - Queen 13 - King Suits go from 0 - 4 0 = Hearts 1 - Diamonds 2
 * - Clubs 3 - Spades 4 - Joker
 * 
 * @author adis.cehajic
 *
 */
public class Card {

	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 13;
	private static final int MIN_SUIT = 0;
	private static final int MAX_SUIT = 4;

	public static final int HEARTS = 0;
	public static final int DIAMONDS = 1;
	public static final int CLUBS = 2;
	public static final int SPADES = 3;
	public static final int JOKER = 4;
	
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;

	/*
	 * Declaring properties of card
	 */
	private int value;
	private int suit;
	private boolean isJoker = false;

	public Card() {
		this.suit = 4;
		this.value = 1;
		isJoker = true;
	}

	/**
	 * Constructor
	 * 
	 * @param value
	 *            - Value of card
	 * @param suit
	 *            - Suit of card
	 */
	public Card(int value, int suit) throws IllegalArgumentException {

		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException(
					"Value must be in range 1 to 13!");
		}

		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4!");
		}

		this.value = value;
		this.suit = suit;
		if (suit == 4) {
			this.isJoker = true;
		}

	}

	public int getValue() {
		return value;
	}

	public int getSuit() {
		return suit;
	}

	public void setValue(int value) {

		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Joker");
		}

		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException(
					"Value must be in range 1 to 13!");
		}

		this.value = value;
	}

	public void setSuit(int suit) {

		if (isJoker == false) {
			throw new UnsupportedOperationException(
					"Can't change the value of a non Joker");
		}

		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit must be in range 0 to 4!");
		}

		this.suit = suit;
	}

	public String getValueString() {
		if (value == 1 || value > 10) {
			switch (value) {
			case ACE:
				return "Ace";
			case JACK:
				return "Jack";
			case QUEEN:
				return "Queen";
			case KING:
				return "King";
			default:
				return "";
			}
		} else {
			return Integer.toString(value);
		}

	}

	public String getSuitString() {
		switch (suit) {
		case HEARTS:
			return "Hearts";
		case DIAMONDS:
			return "Diamonds";
		case CLUBS:
			return "Clubs";
		case SPADES:
			return "Spades";
		default:
			return "Joker";
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String getCard(){
		return getValueString() + " " + getSuitString();
	}

	/**
	 * Prints information about card.
	 */
	public String toString() {
		return getCard();
	}

	
}
