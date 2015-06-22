package ba.bitcamp.w06d01.exercises.interfacee.task01;

public class Main {

	public static void main(String[] args) {
		
//		Line l = new Line(10);
//		
//		l.drawOnConsole();
//		
//		Rectangle r = new Rectangle(5, 4);
//		
//		r.drawOnConsole();
				
		Drawable[] d = new Drawable[10]; 
		for (int i = 0; i < d.length; i++) {
			if (i % 2 == 0) {
				d[i] = new Line((int) (Math.random() * 5 + 1));
				d[i].drawOnConsole();
				System.out.println();
			} else {
				d[i] = new Rectangle(((int) (Math.random() * 5 + 1)), ((int) (Math.random() * 5 + 1)));
				d[i].drawOnConsole();
				System.out.println();
			}
		}
				
	}
	
}
