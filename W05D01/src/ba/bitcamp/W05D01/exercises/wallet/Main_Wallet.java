package ba.bitcamp.W05D01.exercises.wallet;

public class Main_Wallet {

	public static void main(String[] args) {

		// Creating of wallet
		Wallet walletOne = new Wallet(2);
		
		// Checking the balance of wallet
		System.out.println("Balance of wallet is: " + walletOne.getWalletBallance());
		
		// Creating of cards
		CreditCard cardOne = new CreditCard();
		CreditCard cardTwo = new CreditCard();
		CreditCard cardThree = new CreditCard();
		
		// Adding money on card one
		cardOne.addMoney(7900);
		
		System.out.println("Card one balance is: " + cardOne.getCardBalance());

		walletOne.addCard(cardOne);
		
		walletOne.addCard(cardTwo);

		walletOne.addCard(cardThree);
//
//		System.out.println(Arrays.toString(walletOne.cards));

	}
}
