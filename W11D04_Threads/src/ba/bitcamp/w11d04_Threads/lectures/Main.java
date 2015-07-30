package ba.bitcamp.w11d04_Threads.lectures;

public class Main implements Runnable {

	public static void main(String[] args) {

		Main m = new Main();
		Thread t = new Thread(m);
		t.start();

			
		for (int i = 0; i < 50; i++) {
			System.out.println("Main");
		}
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Thread");
		}
	}

}
