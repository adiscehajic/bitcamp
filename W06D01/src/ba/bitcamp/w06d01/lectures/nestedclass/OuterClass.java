package ba.bitcamp.w06d01.lectures.nestedclass;

public class OuterClass {

	private int number;
	private InnerClass ic;
	
	class InnerClass{
		private int innerNumber;
		private int number;
		
		public InnerClass(int number){
		this.number = number;
	}
		
		public void PrintVariables(int number){
			System.out.println("Param number: " + number);
			System.out.println("Inner number: " + this.number);
			System.out.println("Outer number: " + OuterClass.this.number);
		}
		

		
		
	}
	
	
}
