package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.LinkedList;

public class StringQueueComposition {

	private LinkedList<String> values;

	public StringQueueComposition() {
		values = new LinkedList<String>();
	}

	public int size() {
		return values.size();
	}

	public void enqueue(String val) {
		values.addFirst(val);
	}

	public String dequeue() {
		return values.removeLast();
	}
}
