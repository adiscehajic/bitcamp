package ba.bitcamp.lectures.klase.modeli;

public class Person {

	public String firstName;
	public String lastName;
	public Integer yearOfBirth;
	public String address;
	public String pesonalID;
	public String email;
	public Integer heigth;
	public boolean isValid;
	public String favFood;
	public String favDrink;

	public Person(String firstName, String lastName, Integer yearOfBirth,
			String address, String pesonalID, String email, Integer heigth,
			boolean isValid, String favFood, String favDrink) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.pesonalID = pesonalID;
		this.email = email;
		this.heigth = heigth;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}
	
	

}
