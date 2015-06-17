package ba.bitcamp.homework16.task04;

public class Firm {

	// Declaring properties of firm
	private String name;
	private Employee director;
	private Employee[] employees;

	/**
	 * Constructor
	 * 
	 * @param name
	 *            - Name of the firm.
	 * @param director
	 *            - Director of the firm.
	 * @param employees
	 *            - An array of employees of the firm.
	 */
	public Firm(String name, Employee director, Employee[] employees) {
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	/**
	 * Prints number of employees in the firm.
	 * 
	 * @return - Number of employees in the firm.
	 */
	public int getNumberOfEmployees() {
		return employees.length;
	}

	/**
	 * Calculates the sum of all salaries in the firm.
	 * 
	 * @return Amount of sum of all salaries.
	 */
	public double getSumOfSalaries() {

		double sumOfSalaries = 0;

		for (int i = 0; i < employees.length; i++) {
			sumOfSalaries += employees[i].getSalary();
		}

		return sumOfSalaries;
	}

	/**
	 * Calculates the number of female employees in the firm.
	 * 
	 * @return Number of female employees in the firm.
	 */
	public int getNumberOfFemaleEmployees() {

		int numOfFemaleEmployees = 0;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getGender().equals("Female")) {
				numOfFemaleEmployees++;
			}
		}

		return numOfFemaleEmployees;
	}

	/**
	 * Increases the salary of each employee for the inputed amount.
	 * <p>
	 * If the amount is lesser than zero prints message.
	 * 
	 * @param amount
	 *            - The amount of money for which we want to increase the
	 *            salaries.
	 */
	public void increaseSalary(double amount) {

		try {
			for (int i = 0; i < employees.length; i++) {
				if (amount > 0) {
					employees[i].setSalary(employees[i].getSalary() + amount);
				} else {
					throw new NumberFormatException();
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("You have inputed amount that is less than zero!\n");
		}
	}

	/**
	 * Printing information about firm, name, director and number of employees.
	 */
	public String toString() {
		return String.format(
				"Name: %s\nDirector: %s\nNumber of employees: %s\n", name,
				director.getName(), String.valueOf(getNumberOfEmployees()));
	}
}
