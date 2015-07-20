package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.LinkedList;

public class QueueComposition<E> {
	private LinkedList<E> values;

	public QueueComposition() {
		values = new LinkedList<E>();
	}

	public int size() {
		return values.size();
	}

	public void enqueue(E val) {
		values.addFirst(val);
	}

	public E dequeue() {
		return values.removeLast();
	}
}
