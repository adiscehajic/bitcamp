package ba.bitcamp.w12d01_Recapitulation.lectures;

import java.util.Scanner;

public class MainSearch {

	public static void main(String[] args) {

		System.out.println("Enter search: ");
		Scanner in = new Scanner(System.in);

		long start = System.currentTimeMillis();
		String searchString = in.nextLine();

		Search s = new Search(searchString);

		s.startSearch();
		System.out.println((System.currentTimeMillis() - start) / 1000);
		in.close();
	}
}
