package ba.bitcamp.w09d01_LinkedDataStructures.exercises;

public class LinkedListSong {
	private Node start;

	public LinkedListSong() {
		this.start = null;
	}

	public LinkedListSong(Song[] songs) {
		for (int i = 0; i < songs.length; i++) {
			add(songs[i]);
		}
	}

	public void add(Song song) {
		if (start == null) {
			start = new Node(song);
		} else {
			Node last = getLastNode();

			last.setNext(new Node(song));
		}
	}

	public Song get(int index) {
		Node temp = start;

		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}

		return temp.getSong();
	}

	public void remove(int index) {
		if (index == 0) {
			start = start.getNext();
		} else {
			Node temp = start;

			for (int i = 0; i < index; i++) {
				temp = temp.getNext();
			}

			Node previous = getPreviousNode(temp);

			previous.setNext(temp.getNext());
		}
	}

	public int size() {
		int count = 1;
		Node temp = start;

		while (temp.getNext() != null) {
			temp = temp.getNext();
			count++;
		}

		return count;
	}

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

	public void clear() {
		start = null;
	}

	public String toString() {
		if (start == null) {
			return "There is no songs in the list!";
		}
		return start.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinkedListSong other = (LinkedListSong) obj;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

	/**
	 * Inner class.
	 * 
	 * @author adis.cehajic
	 *
	 */
	private class Node {
		private Song song;
		private Node next;

		public Node(Song song) {
			this.song = song;
		}

		public Song getSong() {
			return song;
		}

		public void setSong(Song song) {
			this.song = song;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public String toString() {
			if (next == null) {
				return song + "";
			}
			return song + "" + next.toString();
		}

	}
}
