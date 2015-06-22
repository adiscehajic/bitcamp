package ba.bitcamp.w06d01.exercises;

public class Main {

	public static void main(String[] args) {
		
		CampStringBuilder cp = new CampStringBuilder();
		
		String str = "first";
		
		cp.append(str);
		
		System.out.println(cp.toString());
		
		cp.append(str);
		
		System.out.println(cp.toString());
		
		cp.prepend("second");
		System.out.println(cp.toString());
		
	}
	
}
