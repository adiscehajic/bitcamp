package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.LinkedList;

public class QueueUtils {

	public static void enqueueString(LinkedList<String> queue, String el) {
		queue.add(0, el);
	}

	public static String dequeueString(LinkedList<String> queue) {
		return queue.remove(queue.size() - 1);
	}
	
	public static<E> void enqueue(LinkedList<E> queue, E el) {
		queue.add(0, el);
	}
	
	public static Object dequeue(LinkedList<Object> queue) {
		return queue.remove(queue.size() - 1);
	}
}
