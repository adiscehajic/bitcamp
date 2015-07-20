package ba.bitcamp.w10d01_WritingGenerics.lectures;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueInheritance<E> extends LinkedList<E>{

	private static final long serialVersionUID = -3547906094396143738L;

	public void enqueue(E val) {
		this.addFirst(val);
	}

	public E dequeue() {
		return this.removeLast();
	}
	
	public void enqueueAll(Collection<? extends E> elements){
		Iterator<? extends E> iter = elements.iterator();
		while (iter.hasNext()) {
			enqueue(iter.next());
		}
	}
	
	public void dequeueTo(QueueInheritance<E> target){
		while (size() > 0) {
			target.enqueue(dequeue());	
		}
	}
	
	public void dequeueToCollection(Collection<E> target){
		while (size() > 0) {
			target.add(dequeue());			
		}
	}
	
}
