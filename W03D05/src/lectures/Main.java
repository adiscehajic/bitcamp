package lectures;

public class Main {

	public static void main(String[] args) {

		threeNPlusOne(7);
		threeNPlusOneString(7);
		
	}
	
	public static void threeNPlusOne(int n) {
		int count = 1;

		while (n > 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1;
			} else {
				n = n / 2;
			}
			count++;
			System.out.print(n + " ");
		}
		System.out.println("\nThere were " + count + " terms in the sequence.");
	}
	
	public static String threeNPlusOneString(int n){
		String s = n + "";
		int count = 1;

		while (n > 1) {
			if (n % 2 == 1) {
				n = 3 * n + 1;
				s = n + ", ";
			} else {
				n = n / 2;
				s = n + ", ";
			}
			count++;
			System.out.print(s);
		}
		System.out.println("\nThere were " + count + " terms in the sequence.");
		
		
		
		return s;
	}
	
	
	
	
}