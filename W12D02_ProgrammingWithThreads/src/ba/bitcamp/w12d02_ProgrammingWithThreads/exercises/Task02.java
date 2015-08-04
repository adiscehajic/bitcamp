package ba.bitcamp.w12d02_ProgrammingWithThreads.exercises;

public class Task02 {

	private static int counter = 0;
	
	private static Object o = new Object();

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {
			startThreads();
			System.out.println(counter);
			counter = 0;
		}

	}

	public static void startThreads() {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static class MyThread extends Thread {
		public void run() {

			int number = 0;

			while (number <= 100) {
				synchronized (o) {
					counter += 10;
				}
				number++;
			}
		}
	}
}
