package exercises;

public class Task1_MergeStringMethod {

	public static String merge(String s1, String s2) {

		return (s2.substring(0, (s2.length() / 2))).concat(s1).concat(s2.substring((s2.length() / 2), s2.length())) ;

	}

	public static void main(String[] args) {

		System.out.println(merge("Java", "Mozak"));
		
	}

}
