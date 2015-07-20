package ba.bitcamp.w10d01_WritingGenerics.exercises.task01;

import java.awt.Component;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import javax.swing.JButton;

public class GenericsMethods {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(125);
		list.add(12);
		list.add(36);
		list.add(12);
		
		printAll(list);
		
		System.out.println(countOccurences(list, 12));
		
		JButton button = new JButton();
		button.setSize(800, 600);
		button.setLocation(53, 69);
		
		printComponentInfo(button);
		
		printType(list);
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		hset.add(5);
		hset.add(12);
		
		printType(hset);
	}

	public static <E> void printAll(Collection<E> col) {
		System.out.println(col);
	}
	
	public static <E> int countOccurences(Collection<E> col, E value){		
		int count = 0;
		Iterator<E> iter = col.iterator();
		
		while (iter.hasNext()) {
			if (iter.next().equals(value)) {
				count++;
			}
		}	
		return count;
	}
	
	public static void printComponentInfo(Component E){
		System.out.println("Width: " + E.getWidth() + "\nHeight: " + E.getHeight() + "\nX: " + E.getX() + "\nY: " + E.getY());
	}
	
	public static <E> void printType(Collection<E> col){
		if (col instanceof List) {
			System.out.println("List");
		} else if (col instanceof Map) {
			System.out.println("Map");
		} else if (col instanceof Set) {
			System.out.println("Set");
		}
	}


}
