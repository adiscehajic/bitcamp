package ba.bitcamp.w05d05.exercises;

public class Main {

	public static void main(String[] args) {
		
		Zebra z = new Zebra(true, 550, Animal.HERBIVORE, 20, Zebra.SICK);
		
		System.out.println(z);
		
		Tiger t = new Tiger(true, 250, Animal.CARNIVORE, 70, Tiger.HUNTING);
		Tiger t2 = new Tiger(true, 200, Animal.CARNIVORE, 75, Tiger.STANDSTILL);
		
		Plant p = new Plant(true, true, Plant.MID);
		
//		z.eat(p);
//		
//		System.out.println(z);
//		
		
		System.out.println(t);
//		
		t.eat(z);
//		
		System.out.println(t);
		
		
		
	}
	
}