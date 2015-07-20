package ba.bitcamp.w10d01_WritingGenerics.exercises.task02;

import java.util.Collection;
import java.util.Iterator;

public class MyArrayList<E> {

	private Node head;
	private int count;

	public MyArrayList() {
		this.head = null;
	}

	public void addLast(E value) {
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
		} else {
			Node last = getLastNode();
			last.setNext(temp);
		}
		count++;
	}

	private Node getLastNode() {
		Node temp = head;

		while (temp.getNext() != null) {
			temp = temp.next;
		}

		return temp;
	}

	public void addFirst(E value) {
		Node temp = new Node(value);
		if (head == null) {
			head = temp;
		} else {
			temp.setNext(head);
			head = temp;
		}
		count++;
	}

	public void addAtIndex(int index, E value) {
		int count = 0;
		Node temp = head;
		Node newNode = new Node(value);

		while (count < index - 1) {
			temp = temp.next;
			count++;
		}
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

	public boolean contains(E value) {
		Node temp = head;

		if (temp.getValue().equals(value)) {
			return true;
		}
		while (temp.next != null) {
			temp = temp.next;
			if (temp.getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		if (head == null) {
			return "List is empty.";
		}
		return head.toString();
	}
	
	public void addAll(Collection<E> col){
		Iterator<E> iter = col.iterator();
		
		while (iter.hasNext()) {
			addLast(iter.next());
		}
	}
	
	

	private class Node {
		private E value;
		private Node next;

		public Node(E value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			}
			return value + " " + next.toString();
		}

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
