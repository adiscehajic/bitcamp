package ba.bitcamp.w10d02_StreamsReadersWriters.exercises;

import java.io.Serializable;

public class Employee implements Serializable {


	private static final long serialVersionUID = -2891481064520568842L;
	private String name;
	private Integer age;
	private Integer salary;

	public Employee(String name, Integer age, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String toString() {
		return String.format("Name: %s, Age: %d, Salary: %d\n", name, age,
				salary);
	}
}
