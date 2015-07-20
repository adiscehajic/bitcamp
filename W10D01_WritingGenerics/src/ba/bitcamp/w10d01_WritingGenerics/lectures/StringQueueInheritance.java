package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.LinkedList;

public class StringQueueInheritance extends LinkedList<String>{

	private static final long serialVersionUID = -3547906094396143738L;

	public void enqueue(String val) {
		this.addFirst(val);
	}

	public String dequeue() {
		return this.removeLast();
	}
	
}
