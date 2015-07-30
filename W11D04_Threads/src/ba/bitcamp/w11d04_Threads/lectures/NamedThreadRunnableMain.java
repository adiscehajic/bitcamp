package ba.bitcamp.w11d04_Threads.lectures;

public class NamedThreadRunnableMain {

	public static void main(String[] args) {

		NamedThreadRunnable r1 = new NamedThreadRunnable("Ross");
		NamedThreadRunnable r2 = new NamedThreadRunnable("Joey");
		NamedThreadRunnable r3 = new NamedThreadRunnable("Chandler");

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("End of main!");

	}
}
