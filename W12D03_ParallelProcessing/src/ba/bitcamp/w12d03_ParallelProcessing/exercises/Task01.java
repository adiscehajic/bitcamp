package ba.bitcamp.w12d03_ParallelProcessing.exercises;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task01 {

	private static Integer counter = 0;
	private static LinkedBlockingQueue<Runnable> tasks;
	private static ArrayList<Consumer> consumers;

	private static Object lock = new Object();

	public static void main(String[] args) {

		tasks = new LinkedBlockingQueue<Runnable>();
		consumers = new ArrayList<Task01.Consumer>();

		int startNumber = 10;
		int endNumber = 1000000;
		int step = 1000;
		int taskNumber = 1000;

		int workLoad = 1000;
		int loadTaken = 0;

		while (loadTaken < endNumber) {
			tasks.add(new Producer(loadTaken, loadTaken + workLoad));
			loadTaken += workLoad;
		}

//		for (int i = 0; i < taskNumber; i++) {
//			tasks.add(new Producer(step * i, (i + 1) * step));
//		}

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 8; i++) {

			Consumer con = new Consumer();
			con.start();
			consumers.add(con);
		}

		for (Consumer consumer : consumers) {
			try {
				consumer.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Number of primes is: " + counter);
		System.out.println("Time is: "
				+ (System.currentTimeMillis() - startTime) + " [ms]");

	}

	private static class Producer extends Thread {

		private int start;
		private int end;

		public Producer(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			for (int i = start; i < end; i++) {
				if (isPrime(i)) {
					synchronized (lock) {
						counter++;
					}
				}
			}

		}
	}

	private static class Consumer extends Thread {

		@Override
		public void run() {
			while (!tasks.isEmpty()) {
				try {
					Runnable job = tasks.take();
					job.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
