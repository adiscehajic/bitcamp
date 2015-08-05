package ba.bitcamp.w12d03_ParallelProcessing.lectures;

import java.util.concurrent.*;

public class ExecutorExample {

	public static void runExample() {
		ExecutorService es = Executors.newFixedThreadPool(2);

		es.submit(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("First task");
			}
		});

		es.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Second task");
			}
		});
		
		es.shutdown();
	}
}
