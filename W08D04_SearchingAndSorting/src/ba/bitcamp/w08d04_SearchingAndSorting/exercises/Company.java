package ba.bitcamp.w08d04_SearchingAndSorting.exercises;

import java.util.ArrayList;

public class Company {

	public ArrayList<Employee> employees = new ArrayList<Employee>();

	/**
	 * Inputs new employee into employees list.
	 * 
	 * @param employee
	 */
	public void hireEmployee(Employee employee) {
		if (!employees.contains(employee)) {
			employees.add(employee);
		} else {
			System.out.println("Employee is already hired.");
		}
	}

	/**
	 * Removes employee from employees list.
	 * 
	 * @param employee
	 */
	public void fireEmployee(Employee employee) {
		if (employees.contains(employee)) {
			employees.remove(employee);
		} else {
			System.out.println("Employee is already fired.");
		}
	}

	/**
	 * Checks if the employee is working in company.
	 * 
	 * @param employee
	 * @return True if the employee is working and false if not.
	 */
	public boolean isWorkingHere(Employee employee) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(employee)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks if there is female employees in company.
	 * 
	 * @return True if there is female employees and false if not.
	 */
	public boolean hasFemaleEmployees() {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getGender() == Employee.FEMALE) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sorts employees by id.
	 */
	public void sortEmployesById() {
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = i;
			for (int j = i; j < employees.size(); j++) {
				if (employees.get(j).getId() < employees.get(minIndex).getId()) {
					minIndex = j;
				}
			}
			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	/**
	 * Sorts employees by year.
	 */
	public void sortByAge() {
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = i;
			for (int j = i; j < employees.size(); j++) {
				if (employees.get(j).getDate().getYear() < employees
						.get(minIndex).getDate().getYear()) {
					minIndex = j;
				}
			}
			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
	}

	/**
	 * Sorts employees depending of their salaries.
	 */
	public void sortBySalary() {
		for (int i = 1; i < employees.size(); i++) {
			double temp = employees.get(i).getSalary();
			Employee tempa = employees.get(i);
			int location = i - 1;

			while (location >= 0 && temp > employees.get(location).getSalary()) {
				employees.set(location + 1, employees.get(location));
				location--;
			}
			employees.set(location + 1, tempa);
		}

	}

	/**
	 * Sorts employees depending of their salaries.
	 */
	public void sortByGender() {
		for (int i = 1; i < employees.size(); i++) {
			double temp = employees.get(i).getGender();
			Employee tempa = employees.get(i);
			int location = i - 1;

			while (location >= 0 && temp > employees.get(location).getGender()) {
				employees.set(location + 1, employees.get(location));
				location--;
			}
			employees.set(location + 1, tempa);
		}

	}

	/**
	 * Checks if the employees are sorted by id.
	 * 
	 * @return True if they are sorted by id and false it not.
	 */
	public boolean areEmployeesSortedById() {
		for (int i = 0; i < employees.size() - 1; i++) {
			if (employees.get(i).getId() > employees.get(i + 1).getId()) {
				return false;
			}
		}
		return true;
	}

	public Employee getEmployee(int employeeId) {

		int min = 0;
		int max = employees.size() - 1;

		while (min <= max) {
			int middle = (min + max) / 2;

			if (employeeId == employees.get(middle)
					.getId()) {
				return employees.get(middle);
			} else if (employeeId > employees
					.get(middle).getId()) {
				min = middle + 1;
			} else {
				max = middle - 1;
			}
		}

		return null;

	}

}
