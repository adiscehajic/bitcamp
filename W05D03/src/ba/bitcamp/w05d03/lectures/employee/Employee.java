package ba.bitcamp.w05d03.lectures.employee;

public class Employee {

	protected String name;
	private String gender;

	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public String toString(){
		return "Employee class: " + name + " " + gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
