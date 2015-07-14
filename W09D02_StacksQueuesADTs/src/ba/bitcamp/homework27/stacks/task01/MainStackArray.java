package ba.bitcamp.homework27.stacks.task01;

public class MainStackArray {
	public static long timeArray = 0;

	public static void main(String[] args) {

		StackStringArray stack = new StackStringArray();

		System.out.println(stack.push("Bit"));
		System.out.println(stack.push("Camp"));

		long start = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			stack.push("Bit");
		}

		long end = System.currentTimeMillis();
		timeArray = end - start;
		System.out.println(timeArray);
		
		System.out.println(stack.search("Bit"));

	}
}
