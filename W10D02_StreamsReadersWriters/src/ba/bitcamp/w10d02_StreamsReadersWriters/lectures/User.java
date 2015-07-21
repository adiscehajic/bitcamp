package ba.bitcamp.w10d02_StreamsReadersWriters.lectures;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -4988827072140399740L;

	private String name;
	private Integer age;

	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return String.format("Name: %s, Year: %d\n", name, age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setYear(Integer age) {
		this.age = age;
	}

}
