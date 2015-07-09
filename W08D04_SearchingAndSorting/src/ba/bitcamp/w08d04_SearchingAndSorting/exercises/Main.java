package ba.bitcamp.w08d04_SearchingAndSorting.exercises;

public class Main {

	public static void main(String[] args) {

		Employee e = new Employee("adis", "cehajic", Employee.MALE, 200, 25, 6,
				1985);

		Employee e2 = new Employee("gordan", "masic", Employee.MALE, 250, 11,
				6, 1991);

		Employee e3 = new Employee("nidal", "salkic", Employee.MALE, 140, 11,
				6, 1991);

		Employee e4 = new Employee("ajla", "el tabari", Employee.FEMALE, 985,
				11, 6, 1991);

		Employee e5 = new Employee("amra", "masic", Employee.FEMALE, 356, 11,
				6, 1991);

		Company company = new Company();

		company.hireEmployee(e);
		company.hireEmployee(e2);
		company.hireEmployee(e3);
		company.hireEmployee(e4);
		company.hireEmployee(e5);
		
		System.out.println(company.isWorkingHere(e2));
		System.out.println(company.hasFemaleEmployees());
		
		company.sortByAge();
		
		
		company.sortByGender();
		
		System.out.println(company.employees);
		
		company.sortEmployesById();
		
		
		System.out.println(company.areEmployeesSortedById());
		
		System.out.println(company.getEmployee(1001));
		
	}

}
