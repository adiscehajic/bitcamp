package exercises;

public class Task2_GetFirstMethod {

	public static String getFirst(String s1, String s2, String s3) {

		int a = s1.compareToIgnoreCase(s2);
		int b = s2.compareToIgnoreCase(s3);

		if (a < 0 && b < 0) {
			return s1;
		} else if (a > 0 && b > 0 || a < 0 && b > 0) {
			return s3;
		}

		return s2;

	}

	public static void main(String[] args) {

		System.out.println(getFirst("Bit", "Camp", "Java"));

	}

}
