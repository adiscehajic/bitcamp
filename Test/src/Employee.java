public class Employee implements Searchable {

	/*
	 * Properties of the employee.
	 */
	private String name;
	private String surname;
	private int gender;
	private Double salary;
	private Position position;
	private String genders;

	// Constants for the genders.
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	/**
	 * Constructor for employee.
	 * 
	 * @param name
	 *            - Name of the employee.
	 * @param surname
	 *            - Surname of the employee.
	 * @param gender
	 *            - Gender of the employee.
	 * @param salary
	 *            - Salary of the employee.
	 * @param position
	 *            - Position of the employee.
	 */
	public Employee(String name, String surname, int gender, Double salary,
			Position position) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.salary = salary;
		this.position = position;
	}

	/**
	 * Enum class for the positions of the employee.
	 * 
	 * @author adis.cehajic
	 *
	 */
	public enum Position {
		DIRECTOR, CURATOR, CONSERVATOR, ADMINISTRATOR, INTERN
	};

	/**
	 * Prints the employee.
	 */
	public String toString() {
		// String genders = "";
		if (gender == MALE) {
			genders = "Male";
		} else {
			genders = "Female";
		}
		return String.format(
				"Employee: %s %s, Gender: %s, Salary: %.2f, Position: %s",
				name, surname, genders, salary, position);
	}

	/*
	 * Get and set methods.
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Checks if any attribute of the employee contains inputed string.
	 * 
	 * @return True if any attribute contains inputed string and false if
	 *         otherwise.
	 */
	public boolean fitsSearch(String s) {
		if (contains(name, s) || contains(surname, s)
				|| contains(genders, s) || contains(String.valueOf(salary), s)
				|| contains(String.valueOf(position), s)) {
			return true;
		}
		return false;
	}

	/**
	 * Checks if one string contains another string.
	 * 
	 * @param s1
	 *            - First string.
	 * @param s2
	 *            - Second string.
	 * @return True if first string contains second string and false if
	 *         otherwise.
	 */
	private boolean contains(String s1, String s2) {
		return s1.toLowerCase().indexOf(s2.toLowerCase()) >= 0;
	}

}
