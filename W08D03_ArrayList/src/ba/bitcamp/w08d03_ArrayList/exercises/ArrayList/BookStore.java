package ba.bitcamp.w08d03_ArrayList.exercises.ArrayList;

import java.util.Arrays;

public class BookStore {

	Books[] books;

	public BookStore(Books... books) {
		this.books = books;
	}

	public void addBook(Books book) {
		int counter = 0;
		for (int i = 0; i < books.length; i++) {
			if (books[i].equals(book)) {
				counter++;
			}
		}
		if (counter == 0) {
			books = Arrays.copyOf(books, books.length + 1);
			books[books.length - 1] = book;
		} else {
			System.out.println("Book is already in bookstore!");
		}

	}

	// public int getIndex(Books book) {
	// return books.indexOf(book);
	// }
	//
	// public void setBook(Books book, int index) {
	// if (books.indexOf(book) == -1) {
	// books.add(index, book);
	// } else {
	// System.out.println("Book is already in bookstore!");
	// }
	// }
	//
	// public int getSize() {
	// return books.size();
	// }

}
