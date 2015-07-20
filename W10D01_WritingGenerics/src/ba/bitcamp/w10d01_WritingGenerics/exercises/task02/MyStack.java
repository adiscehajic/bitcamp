package ba.bitcamp.w10d01_WritingGenerics.exercises.task02;

import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<E> {

	/*
	 * Declaring stack.
	 */
	private Node start;

	/**
	 * Constructor.
	 */
	public MyStack() {
		this.start = null;
	}

	/**
	 * Prints the stack.
	 */
	public String toString() {
		if (start == null) {
			return "The stack is empty.";
		}
		return start.toString();
	}

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param str
	 *            - Item that is pushed.
	 * @return Item that is pushed.
	 */
	public E push(E value) {
		Node temp = new Node(value);
		if (start == null) {
			start = new Node(value);
		} else {
			temp.setNext(start);
			start = temp;
		}
		return value;
	}

	public void pushAll(Collection<? extends E> col) {
		Iterator<? extends E> iter = col.iterator();
		while (iter.hasNext()) {
			push(iter.next());
		}
	}

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 * 
	 * @return The object at the top of this stack.
	 * @throws EmptyStackException
	 *             - if this stack is empty.
	 */
	public E peek() throws EmptyStackException {
		if (start == null) {
			throw new EmptyStackException();
		} else {
			return start.getValue();
		}
	}

	/**
	 * Removes the object at the top of this stack and returns that object as
	 * the value of this function.
	 * 
	 * @return The object at the top of this stack.
	 * @throws EmptyStackException
	 *             - if this stack is empty.
	 */
	public E pop() throws EmptyStackException {
		E temp = start.getValue();
		if (start == null) {
			throw new EmptyStackException();
		} else {
			start = start.getNext();
		}
		return temp;
	}

	/**
	 * Returns the 1-based position where an object is on this stack. If the
	 * object o occurs as an item in this stack, this method returns the
	 * distance from the top of the stack of the occurrence nearest the top of
	 * the stack; the topmost item on the stack is considered to be at distance
	 * 1. The equals method is used to compare o to the items in this stack.
	 * 
	 * @param value
	 *            - The desired string.
	 * @return The 1-based position from the top of the stack where the object
	 *         is located; the return value -1 indicates that the object is not
	 *         on the stack.
	 */
	public int search(E value) {
		int index = 1;

		Node temp = start;

		while (!temp.getValue().equals(value)) {
			temp = temp.getNext();
			index++;
			if (temp.getNext() == null) {
				return -1;
			}
		}
		return index;
	}

	/**
	 * Inner class.
	 * 
	 * @author adis.cehajic
	 *
	 */
	private class Node {
		private E value;
		private Node next;

		/**
		 * Constructor.
		 * 
		 * @param value
		 */
		public Node(E value) {
			super();
			this.value = value;
		}

		/**
		 * Prints the node.
		 */
		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + ", " + next.toString();
		}

		/*
		 * Get and set methods.
		 */
		public E getValue() {
			return value;
		}

		public void setValue(E value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}
}
