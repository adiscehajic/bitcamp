package ba.bitcamp.homework27.queues.task01;

public class MainQueuesArray {

	public static void main(String[] args) {
		
		QueueDoubleArray queue = new QueueDoubleArray();
		System.out.println(queue.poll());
		
		System.out.println(queue.add(5.0));
		
		
		System.out.println(queue);
		
	}
}
