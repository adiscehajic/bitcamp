package ba.bitcamp.homework16.task04;

public class Main {

	public static void main(String[] args) {

		// Creating object director and employees
		Employee director = new Employee("John Doe", "Male", 3000.00);
		Employee employee1 = new Employee("Jane Smith", "Female", 1500.00);
		Employee employee2 = new Employee("Greg House", "Male", 2000.00);
		Employee employee3 = new Employee("Martin Johnson", "Male", 1300.00);
		Employee employee4 = new Employee("Martha Christie", "Female", 1700.00);
		Employee employee5 = new Employee("Michael Jordan", "Male", 800.00);

		// Creating an array of employees
		Employee[] employees = { director, employee1, employee2, employee3,
				employee4, employee5 };

		// Creating object firm
		Firm firmOne = new Firm("Telecom", director, employees);

		// Printing information about firm
		System.out.println(firmOne);

		// Calling method getSumOfSalaries and printing the amount of all
		// salaries in the firm.
		System.out.printf("Sum of all salaries in the firm is: %.2f\n\n",
				firmOne.getSumOfSalaries());

		// Calling method getNumberOfFemaleEmployees and printing the result
		System.out.printf("Number of female employees in the firm is: %d\n\n",
				firmOne.getNumberOfFemaleEmployees());

		// Calling method increaseSalary and increasing salary of all employees
		// for 200
		firmOne.increaseSalary(200.15);

		// Calling again method getSumOfSalaries and printing the amount of all
		// salaries in the firm.
		System.out.printf("Sum of all salaries in the firm after the increase"
				+ " is: %.2f\n\n", firmOne.getSumOfSalaries());

	}

}
