package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.LinkedList;

public class QueueUtilsTest {

	public static void main(String[] args) {
		
		LinkedList<String> strQueue = new LinkedList<String>();
		QueueUtils.enqueueString(strQueue, "A");
		QueueUtils.enqueueString(strQueue, "B");
		QueueUtils.enqueueString(strQueue, "C");
		
		QueueUtils.enqueue(strQueue, "D");

		while (strQueue.size() > 0) {
			System.out.println(QueueUtils.dequeueString(strQueue));
		}
		
		LinkedList<Object> intQueue = new LinkedList<Object>();
		
		QueueUtils.enqueue(intQueue, 15);
		QueueUtils.enqueue(intQueue, 15.0);
		QueueUtils.enqueue(intQueue, 15L);
		QueueUtils.enqueue(intQueue, "A");
		QueueUtils.enqueue(intQueue, true);
		
		System.out.println(intQueue);

		
	}
}
