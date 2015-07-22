package ba.bitcamp.w10d03_Files.exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;

public class Task02 {

	public static final String NOTHING = "0";
	public static final String ONE_PAIR = "1";
	public static final String TWO_PAIRS = "2";
	public static final String THREE_OF_A_KIND = "3";
	public static final String STRAIGHT = "4";
	public static final String FLUSH = "5";
	public static final String FULL_HOUSE = "6";
	public static final String FOUR_OF_A_KIND = "7";
	public static final String STRAIGHT_FLUSH = "8";
	public static final String ROYAL_FLUSH = "9";

	// 0: Nothing in hand, 501209 instances,(1.000063)
	// 1: One pair, 422498 instances,(0.999832)
	// 2: Two pairs, 47622 instances, (1.001746)
	// 3: Three of a kind, 21121 instances, (0.999647)
	// 4: Straight, 3885 instances, (0.989897)
	// 5: Flush, 1996 instances, (1.015569)
	// 6: Full house, 1424 instances, (0.988491)
	// 7: Four of a kind, 230 instances, (0.957934)
	// 8: Straight flush, 12 instances, (0.866426)
	// 9: Royal flush, 3 instances, (1.948052)

	public static void main(String[] args) {

		BufferedReader br = null;

		JFileChooser open = new JFileChooser();

		int option = open.showOpenDialog(null);

		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int counter6 = 0;
		int counter7 = 0;
		int counter8 = 0;
		int counter9 = 0;
		int counter10 = 0;

		if (option == open.APPROVE_OPTION) {
			try {
				br = new BufferedReader(new FileReader(open.getSelectedFile()));
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String last = "";
			try {
				while (br.ready()) {
					String line = br.readLine();

					StringTokenizer st = new StringTokenizer(line, ",");

					do {
						last = st.nextToken();
					} while (st.hasMoreTokens());

					switch (last) {
					case NOTHING:
						counter1++;
						break;
					case ONE_PAIR:
						counter2++;
						break;
					case TWO_PAIRS:
						counter3++;
						break;
					case THREE_OF_A_KIND:
						counter4++;
						break;
					case STRAIGHT:
						counter5++;
						break;
					case FLUSH:
						counter6++;
						break;
					case FULL_HOUSE:
						counter7++;
						break;
					case FOUR_OF_A_KIND:
						counter8++;
						break;
					case STRAIGHT_FLUSH:
						counter9++;
						break;
					case ROYAL_FLUSH:
						counter10++;
						break;
					}

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out
				.printf("Nothing in hand: %d instances\nOne pair: %d instances\nTwo pairs: %d instances\nThree of a kind: %d instances\nStraight: "
						+ "%d instances\nFlush: %d instances\nFull house: %d instances\nFour of a kind: %d instances\nStraight flush: %d instances\nRoyal flush: %d instances\n",
						counter1, counter2, counter3, counter4, counter5,
						counter6, counter7, counter8, counter9, counter10);

	}
}
