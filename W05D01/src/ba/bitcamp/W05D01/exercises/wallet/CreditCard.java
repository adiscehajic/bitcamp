package ba.bitcamp.W05D01.exercises.wallet;

public class CreditCard {

	private int number;
	private String bank;
	private int isValidMonth;
	private int isValidYear;
	private int balance;

	// Creating constructor
	public CreditCard() {
		balance = 0;
	}

	/**
	 * Add inputed amount of money into a card amount.
	 * 
	 * @param number
	 *            - Amount of money that we want to add.
	 */
	public void addMoney(int number) {
		balance += number;
	}

	/**
	 * Subtract inputed amount of money from a card amount.
	 * 
	 * @param number
	 *            - Amount of money that we want to subtract.
	 */
	public void subtractMoney(int number) {
		balance -= number;
	}

	/**
	 * Prints the card balance.
	 * 
	 * @return Card balance.
	 */
	public int getCardBalance() {
		return balance;
	}

}
