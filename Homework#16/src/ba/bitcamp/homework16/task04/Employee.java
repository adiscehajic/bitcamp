package ba.bitcamp.homework16.task04;

public class Employee {

	// Declaring properties of employee
	private String name;
	private String gender;
	private double salary;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param gender
	 * @param salary
	 */
	public Employee(String name, String gender, double salary) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	/**
	 * Prints information about employee.
	 */
	public String toString() {
		return String.format("Name: %s\nGender: %s\nSalary: %.2f\n", name,
				gender, salary);
	}

	// Get methods
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	// Set method
	public double setSalary(double salary) {
		return this.salary = salary;
	}

}
