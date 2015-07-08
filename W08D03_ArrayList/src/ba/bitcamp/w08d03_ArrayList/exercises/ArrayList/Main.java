package ba.bitcamp.w08d03_ArrayList.exercises.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Books book1 = new Books("Book1", "Author1", 1999);
		Books book2 = new Books("Book2", "Author2", 1999);
		Books book3 = new Books("Book3", "Author3", 1999);
		Books book4 = new Books("Book4", "Author4", 1999);
		Books book5 = new Books("Book1", "Author1", 1999);
		
		Books[] books = new Books[]{book1, book2, book3, book5};
		
		BookStore bs = new BookStore(books);
		
		bs.addBook(book4);
		
		for(Books book : bs.books){
			System.out.println(book);
		}
		
//		System.out.println(book2.equals(book4));
//		System.out.println(book1.equals(book5));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Books> books = new ArrayList<>();
//				
//		books.addAll(Arrays.asList(book1, book2, book3, book4, book5));
//		
//		//System.out.println(books);
//
//		ArrayList<String> list = new ArrayList<>();
//		list.addAll(Arrays.asList("A", "B", "C", "D", "E", "G"));
//		
//		//System.out.println(shiftingElements(list));
//		
//		ArrayList<String> list1 = new ArrayList<>();
//		list1.addAll(Arrays.asList("ABD", null, null, null, "DKJ"));
//		
//		System.out.println(partiallyFilled(list1));
		
	}
	
	
	public static ArrayList shiftingElements(ArrayList<String> list){
		list.add(0, list.get(0));
		list.remove(list.size() - 1);
		return list;	
	}
	
	public static ArrayList partiallyFilled(ArrayList<String> list){
		int counter = 0;
		while(counter < list.size()){
			list.remove(null);
			counter++;
		}
		return list;	
	}
}
