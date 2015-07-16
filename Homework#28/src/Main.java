import java.util.Arrays;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		SortedIntList list = new SortedIntList();
		
		Random rand = new Random();
		
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(5);
		
		for (int i = 0; i < 10; i++) {
			int number = rand.nextInt(100);
			list.add(-number);
			System.out.print(-number + ", ");
		}
		
		System.out.println();
		list.add(189);
		System.out.println(list);
		System.out.println(list.size());
		
		int[] array = list.toArray(list);
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(list.get(8));
	}
}
