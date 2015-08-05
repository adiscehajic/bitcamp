package ba.bitcamp.w12d03_ParallelProcessing.lectures;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

	// private static ArrayBlockingQueue tasks = new ArrayBlockingQueue(10);
	private static LinkedBlockingQueue<Runnable> tasks = new LinkedBlockingQueue<Runnable>(
			2);

	public static void startExample() {

		new Producer().start();
		new Consumer().start();

	}

	public static class Producer extends Thread {

		@Override
		public void run() {
			tasks.offer(new Calculate(1, 10));
			tasks.offer(new Calculate(10, 20));
			tasks.offer(new Calculate(20, 30));
		}
	}

	public static class Consumer extends Thread {

		@Override
		public void run() {
			System.out.println("Consumer started.");

			try {
				Thread t;

				while ((t = new Thread(tasks.take())) != null) {
					t.start();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static class Calculate implements Runnable {

		private int start;
		private int end;

		public Calculate(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			int result = 0;
			for (int i = start; i < end; i++) {
				result += i;
				// Simulate long running work.
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Result: " + result);
		}
	}

}
