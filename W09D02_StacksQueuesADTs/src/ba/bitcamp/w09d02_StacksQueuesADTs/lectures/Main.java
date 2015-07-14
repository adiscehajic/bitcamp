package ba.bitcamp.w09d02_StacksQueuesADTs.lectures;

public class Main {

	public static void main(String[] args) {
		
		LinkedListInt list = new LinkedListInt();
		
		System.out.println(list);
		
		list.addEnd(5);
		list.addEnd(18);
		list.addBeginning(13);
		
		list.removeFirst();
		list.removeLast();
		
		list.addBeginning(13);
		list.addBeginning(18);
		list.addBeginning(19);
		list.addEnd(27);
		list.addBeginning(16);
		list.addBeginning(12);
		list.addBeginning(13);
		list.addBeginning(18);
		list.addBeginning(19);
		list.addEnd(27);
		list.addBeginning(16);
		list.addBeginning(12);
		
		//list.removeLast();
		
		System.out.println(list);
		System.out.println(list.getCount());
		
		System.out.println(list.middle());
		
	}
}
