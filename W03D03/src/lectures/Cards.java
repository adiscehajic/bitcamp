package lectures;
import java.util.Arrays;


public class Cards {

	public static void main(String[] args) {

		int numOfCards = 52;
		
		int[] cards = new int[numOfCards];
		
		for (int i = 0; i < cards.length; i++) {
				cards[i] = i+1;
		}
		
		//for (int i = 0; i < cards.length; i++) {
			System.out.println(Arrays.toString(cards));
		//}
		
	}

}
