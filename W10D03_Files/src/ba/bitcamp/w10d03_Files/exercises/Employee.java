package ba.bitcamp.w10d03_Files.exercises;

public class Employee implements Comparable<Employee>{

	private String name;
	private String surname;
	private String gender;
	private String position;
	private String salary;

	public Employee(String name, String surname, String gender,
			String position, String salary) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}



	public String toString() {
		return "Employee: " + name + " " + surname
				+ ", Gender: " + gender + ", Position: " + position
				+ ", Salary: " + salary + "\n";
	}

	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}
	
		
}
