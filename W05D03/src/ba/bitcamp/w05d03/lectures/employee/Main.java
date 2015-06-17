package ba.bitcamp.w05d03.lectures.employee;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("John", "Male");
		System.out.println(e);
		
		SalaryEmployee se = new SalaryEmployee("Sue", "Female", 2000);
		System.out.println(se);
		
		HourlyEmployee h = new HourlyEmployee("Joe", "Female", 15);
		System.out.println(h);
		
	}
	
}
