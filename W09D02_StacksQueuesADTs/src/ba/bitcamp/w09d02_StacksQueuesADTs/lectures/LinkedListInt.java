package ba.bitcamp.w09d02_StacksQueuesADTs.lectures;

public class LinkedListInt {

	private Node start;
	private int count;

	public LinkedListInt() {
		this.start = null;
		count = 0;
	}

	/**
	 * Adds new element on the last place in the list.
	 * 
	 * @param value
	 *            - Value that user want to add.
	 */
	public void addEnd(int value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node last = getLastNode();

			last.setNext(new Node(value));
		}
		count++;
	}

	/**
	 * Adds new element on the first place in the list.
	 * 
	 * @param value
	 *            - Value that user want to add.
	 */
	public void addBeginning(int value) {
		if (start == null) {
			start = new Node(value);
		} else {
			Node first = new Node(value);

			first.setNext(start);
			start = first;
		}
		count++;
	}

	/**
	 * Removes first element in the list.
	 */
	public void removeFirst() {
		start = start.getNext();
		count--;
	}

	/**
	 * Removes last element in the list.
	 */
	public void removeLast() {
		Node temp = start;

		for (int i = 0; i < count - 1; i++) {
			temp = temp.getNext();
		}

		Node previous = getPreviousNode(temp);

		previous.setNext(null);
		count--;
	}

	/**
	 * Finds the element that is before last.
	 * 
	 * @param n
	 * @return
	 */
	public Node getPreviousNode(Node n) {
		if (n == start) {
			return null;
		}

		Node temp = start;

		while (temp.getNext() != n) {
			temp = temp.getNext();
		}

		return temp;
	}

	/**
	 * Returns the last node in the list.
	 * 
	 * @return
	 */
	private Node getLastNode() {
		if (start == null) {
			return null;
		}

		Node temp = start;

		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		return temp;
	}

	public String toString() {
		if (start == null) {
			return "The list is empty.";
		}
		return start.toString();
	}

	/**
	 * Returns the element that is in the middle of the list.
	 * 
	 * @return
	 */
	public int middle() {
		Node last = start.getNext();
		Node middle = start;

		while (last.getNext() != null) {
			if (last.getNext().getNext() != null) {
				middle = middle.getNext();
				last = last.getNext().getNext();
			} else {
				middle = middle.getNext();
				last = last.getNext();
			}
		}
		return middle.value;
	}

	// public void middle() {
	// node slow = start.next;
	// node fast = start.next;
	// while (fast.next != null) {
	// slow = slow.next;
	// fast = fast.next.next;
	// }
	//
	// System.out.println(slow.data);
	// }

	public Node getStart() {
		return start;
	}

	public void setStart(Node start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public String toString() {
			if (next == null) {
				return value + "";
			}

			return value + " " + next.toString();
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
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
