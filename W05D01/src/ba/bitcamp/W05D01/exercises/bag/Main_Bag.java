package ba.bitcamp.W05D01.exercises.bag;

public class Main_Bag {

	public static void main(String[] args) {
		
		Bag bagOne = new Bag(40);
		
		System.out.println(bagOne.getMaxCapacity());
		
		System.out.println(bagOne.getCurrentCapacity());
		
		bagOne.addCapacity(20);
		bagOne.addCapacity(30);
		
		System.out.println(bagOne.getFreeSpace());
		
		bagOne.addCapacity(20);
		
		System.out.println(bagOne.getFreeSpace());
		
		bagOne.subtractCapacity(25);
		
		System.out.println(bagOne.getFreeSpace());
		
	}
	
	
	

	
}
