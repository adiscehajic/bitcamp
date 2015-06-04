package exercises;

public class RandomNumMethod {

	public static int getRandomNum(int min, int max) {
		int num = 0;
		for (int i = min; i <= max; i++) {
			num = min + (int) (Math.random() * ((max - min) + 1));
		}
		if (min > max) {
			num = -1;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(getRandomNum(2, 1));
	}

}
