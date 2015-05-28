package exercises;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

import Lectures.TextIO;

public class MultiplicationGame {

	public static void main(String[] args) {

		TextIO.readFile("src/exercises/Test");

		int score = TextIO.getInt();
		String dateTime = TextIO.getlnString();

		TextIO.putln("Highscore is: " + score + "\nSet at:" + dateTime);

		Scanner in = new Scanner(System.in);

		int counter = 0;

		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 9 + 1);
			int num2 = (int) (Math.random() * 9 + 1);
			int computing = num1 * num2;

			TextIO.putf("How much is %d * %d?", num1, num2);
			int userTry = in.nextInt();

			if (userTry == computing) {
				counter++;
			}

			if (counter == 5 && i == 4) {
				TextIO.putln("You are on fire!\nTry this!");
				for (int j = i + 1; j < 10; j++) {
					int num3 = (int) (Math.random() * 100 + 1);
					int num4 = (int) (Math.random() * 9 + 1);
					int computing2 = num3 * num4;

					TextIO.putf("How much is %d * %d?", num3, num4);
					int userTry2 = in.nextInt();

					if (userTry2 == computing2) {
						counter++;
					}
					i++;
				}
			}
		}

		TextIO.writeFile("src/exercises/Test");
		
		if (counter > score) {
			TextIO.put(counter + " ");
		} else {
			TextIO.putln("Your score is not highscore!");
		}

		GregorianCalendar gc = new GregorianCalendar();
		TimeZone tz = gc.getTimeZone();
		gc.add(GregorianCalendar.MILLISECOND, +tz.getDSTSavings());
		TextIO.putln(gc.getTime());

		in.close();
	}

}
