package ba.bitcamp.w05d03.lectures.cards;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

public class Deck {

	private Card[] cards;
	private int numberOfDealtCards = 0;

	public Deck(boolean includeJokers) {
		if (includeJokers == true) {
			this.cards = new Card[54];
			cards[53] = new Card();
			cards[52] = new Card();
		} else {
			this.cards = new Card[52];
		}

		generateCards();
		shuffleCards();
	}

	private void generateCards() {

		int counter = 0;
		
		for (int j = Card.ACE; j <= Card.KING; j++) {
			cards[counter++] = new Card(j, Card.HEARTS);
			cards[counter++] = new Card(j, Card.DIAMONDS);
			cards[counter++] = new Card(j, Card.SPADES);
			cards[counter++] = new Card(j, Card.CLUBS);
		}

	}
	
	public void shuffleCards(){
		
		Random rand = new Random();
		
		for (int i = 0; i < cards.length; i++) {
			int first = rand.nextInt(cards.length);
			int second = rand.nextInt(cards.length);
			Card temp = cards[first];
			cards[first] = cards[second];
			cards[second] = temp;
		}
	}
	
	public int remainingCards(){
		return cards.length - numberOfDealtCards;
	}
	
	public boolean isEmpty(){
		return remainingCards() == 0;
	}
	
	public Card dealCard(){	
		if (isEmpty()) {
			throw new UnsupportedOperationException("Deck is empty!");
		}
		return cards[numberOfDealtCards++];
	}
	
	
	

}
