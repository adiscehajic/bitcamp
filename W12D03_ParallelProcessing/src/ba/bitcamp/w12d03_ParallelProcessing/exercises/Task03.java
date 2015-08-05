package ba.bitcamp.w12d03_ParallelProcessing.exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task03 {

	private static Integer folderCounter = 0;
	private static Integer fileCounter = 0;

	private static Object lock1 = new Object();
	private static Object lock2 = new Object();

	private static LinkedBlockingQueue<Runnable> tasks;
	private static ArrayList<Consumer> consumers;

	public static void main(String[] args) {

		tasks = new LinkedBlockingQueue<Runnable>();
		consumers = new ArrayList<Consumer>();

		File file = new File("/");

		tasks.add(new Task(file));

		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 4; i++) {
			Consumer t = new Consumer();
			t.start();
			consumers.add(t);			
		}

		for (Consumer c : consumers) {
			try {
				c.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Time needed: " + (System.currentTimeMillis() - start));

		System.out.println("Number of folders: " + folderCounter);
		System.out.println("Number of files: " + fileCounter);

	}

	private static class Task implements Runnable {

		private File file;

		public Task(File file) {
			this.file = file;
		}

		@Override
		public void run() {
			try {
			for (File f : file.listFiles()) {
				if (f.isFile() && !f.isHidden()) {
					synchronized (lock1) {
						fileCounter++;
					}
				} else if (f.isDirectory() && !f.isHidden()) {
					synchronized (lock2) {
						folderCounter++;
					}
					tasks.add(new Task(f));
				}
			}
			}catch (NullPointerException e) {
				
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

}
