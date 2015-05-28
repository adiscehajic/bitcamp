package exercises;

public class Main {

	public static void main(String[] args) {
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int counter = 0;

		do {
			one = 0;
			two = 0;
			three = 0;
			four = 0;
			five = 0;

			counter++;
			System.out.println(counter);

			for (int i = 1; i <= 1000; i++) {

				int d = (int) (Math.random() * 5 + 1);

				if (d == 1) {
					one++;
				} else if (d == 2) {
					two++;
				} else if (d == 3) {
					three++;
				} else if (d == 4) {
					four++;
				} else {
					five++;
				}

			}

		} while (one != two || two != three || three != four || four != five);

		System.out.println("One: " + one);
		System.out.println("Two: " + two);
		System.out.println("Three: " + three);
		System.out.println("Four: " + four);
		System.out.println("FIve: " + five);
	}

}
