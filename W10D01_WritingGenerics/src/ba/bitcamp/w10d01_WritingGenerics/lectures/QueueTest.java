package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.HashSet;

public class QueueTest {

	public static void main(String[] args) {

		StringQueueComposition strComp = new StringQueueComposition();

		strComp.enqueue("A");
		strComp.enqueue("B");
		strComp.enqueue("C");

		System.out.println("StringQueueComposition");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(strComp.dequeue());
			System.out.println(strComp.size());
		}

		StringQueueInheritance strInh = new StringQueueInheritance();

		strInh.enqueue("A");
		strInh.enqueue("B");
		strInh.enqueue("C");

		System.out.println("\nStringQueueInheritance");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(strInh.dequeue());
			System.out.println(strInh.size());
		}
		
		QueueComposition<String> queComp = new QueueComposition<String>();

		queComp.enqueue("A");
		queComp.enqueue("B");
		queComp.enqueue("C");

		System.out.println("\nQueueComposition<String>");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(queComp.dequeue());
			System.out.println(queComp.size());
		}
		
		QueueComposition<Integer> queCompInt = new QueueComposition<Integer>();

		queCompInt.enqueue(1);
		queCompInt.enqueue(2);
		queCompInt.enqueue(3);

		System.out.println("\nQueueComposition<Integer>");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(queCompInt.dequeue());
			System.out.println(queCompInt.size());
		}

		
		QueueInheritance<Integer> queCompInts = new QueueInheritance<Integer>();

		queCompInts.enqueue(1);
		queCompInts.enqueue(2);
		queCompInts.enqueue(3);
		
		// test enqueueAll
		
		HashSet<Integer> numSet = new HashSet<Integer>();
		
		numSet.add(10);
		numSet.add(11);
		
		queCompInts.enqueueAll(numSet);
		
		System.out.println("\nQueueInheritance<Integer>");
		
		System.out.println(queCompInts);
		
		QueueInheritance<Integer> dequeed = new QueueInheritance<Integer>();
		
		queCompInts.dequeueTo(dequeed);
		
		System.out.println(dequeed);
		
		// test Number queue
		System.out.println("\nQueueInheritance<Number>");
		QueueInheritance<Number> nums = new QueueInheritance<Number>();
		
		nums.enqueue(1);
		nums.enqueue(10e2);
		nums.enqueue(20.12);
		System.out.println("Mixed numbers queue: " + nums);
		
		nums.enqueueAll(numSet);
		
		System.out.println("Mixed numbers queue: " + nums);
		
	}
}
