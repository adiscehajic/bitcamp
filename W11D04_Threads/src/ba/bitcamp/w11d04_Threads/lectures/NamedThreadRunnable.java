package ba.bitcamp.w11d04_Threads.lectures;

public class NamedThreadRunnable implements Runnable {

	private String name;

	public NamedThreadRunnable(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " counted to: " + i);
		}
	}

}
