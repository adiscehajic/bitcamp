import java.util.ArrayList;

public class Museum {

	/*
	 * Properties of the museum.
	 */
	private String name;
	private ArrayList<Exhibit> exhibits;
	private ArrayList<Employee> employees;

	/**
	 * Constructor.
	 * 
	 * @param name
	 * @param exhibits
	 * @param employees
	 */
	public Museum(String name, ArrayList<Exhibit> exhibits,
			ArrayList<Employee> employees) {
		super();
		this.name = name;
		this.exhibits = exhibits;
		this.employees = employees;
	}

	/**
	 * Prints the museum.
	 */
	public String toString() {
		return String.format("Name: %s\nExhibits: %s\nEmployees: %s", name,
				exhibits, employees);
	}

	/**
	 * Checks if the two museums are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (exhibits == null) {
			if (other.exhibits != null)
				return false;
		} else if (!exhibits.equals(other.exhibits))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public ArrayList<Exhibit> getExhibits() {
		return exhibits;
	}

	public void setExhibits(ArrayList<Exhibit> exhibits) {
		this.exhibits = exhibits;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	/**
	 * Prints all exhibits and employees in the museum that contain inputed
	 * string.
	 * 
	 * @param s
	 *            - String that is inputed.
	 */
	public void search(String s) {
		for (int i = 0; i < exhibits.size(); i++) {
			if (exhibits.get(i).fitsSearch(s)) {
				System.out.println(exhibits.get(i));
			}
		}
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).fitsSearch(s)) {
				System.out.println(employees.get(i));
			}
		}
	}

}
