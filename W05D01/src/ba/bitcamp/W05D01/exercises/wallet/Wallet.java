package ba.bitcamp.W05D01.exercises.wallet;

import javax.crypto.IllegalBlockSizeException;

public class Wallet {

	private int balance;
	CreditCard[] cards;

	// Creating constructor
	public Wallet(int numofCards) {
		cards = new CreditCard[numofCards];
		balance = 0;
	}

	/**
	 * Add money into a wallet.
	 * 
	 * @param amount
	 *            - Amount of money that we want to put in wallet.
	 */
	public void addMoney(int amount) {
		balance += amount;
	}

	/**
	 * Subtract money from a wallet.
	 * 
	 * @param amount
	 *            - Amount of money that we want to take from wallet.
	 */
	public void subtracMoney(int amount) {
		if (balance > amount) {
			balance -= amount;
		}
	}
	
	
	public int getWalletBallance() {
		return balance;
	}

	/**
	 * Add new cards into wallet. If the wallet is full of cards outputs message
	 * that there is no more place.
	 * 
	 * @param card - Credit card that we want to put into a wallet.
	 */
	public void addCard(CreditCard card) {

		int i = 0;
		int counter = cards.length;
		
		try {
			while (counter > 0) {

				if (cards[i] == null) {
					cards[i] = card;
					break;
				} else {
					i++;
				}
				counter--;
				if (counter == 0) {
					throw new IllegalBlockSizeException();
				}
			}
		} catch (IllegalBlockSizeException ex) {
			System.out.println("You have enough credit cards!");
		}

	}

}
