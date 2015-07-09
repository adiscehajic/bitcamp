package ba.bitcamp.w08d04_SearchingAndSorting.exercises;

public class Employee {

	private int id;
	private String name;
	private String surname;
	private int gender;
	private double salary;
	private Date date;

	private static int counter = 1001;
	public static final int MALE = 1;
	public static final int FEMALE = 2;

	public Employee(String name, String surname, int gender, double salary,
			int day, int month, int year) {
		super();
		this.id = counter++;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.salary = salary;
		this.date = new Date(day, month, year);
	}

	public Employee() {
		this("", "", 0, 0.0, 0, 0, 0);
	}

	public String toString() {
		String s = "";
		if (gender == MALE) {
			s = "Male";
		} else {
			s = "Female";
		}

		return String
				.format("ID: %d\nName: %s\nSurname: %s\nGender: %s\nSalary: %.2f $\nDate of birth: %s",
						id, name, surname, s, salary, date);
	}

	/**
	 * Checks if the two employees are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (gender != other.gender)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	/**
	 * Inner class that declares date of birth.
	 * 
	 * @author adis.cehajic
	 *
	 */
	public class Date {
		private int day;
		private int month;
		private int year;

		public Date(int day, int month, int year) {
			super();
			this.day = day;
			this.month = month;
			this.year = year;
		}

		public String toString() {
			return String.format("%d.%d.%d.", day, month, year);
		}

		/**
		 * Checks if the two dates are equal.
		 */
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Date other = (Date) obj;
			if (day != other.day)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		/*
		 * Get and set methods.
		 */
		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	}

	/*
	 * Get and set methods.
	 */
	public int getId() {
		return id;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
}
