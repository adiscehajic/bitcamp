package ba.bitcamp.w08d03_ArrayList.exercises.ArrayList;

public class Books {

	private String name;
	private String author;
	private int year;

	public Books(String name, String author, int year) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
	}

	public Books(String name, String author) {
		super();
		this.name = name;
		this.author = author;
		this.year = 0;
	}

	public Books() {
		this("", "", 0);
	}

	public String toString() {
		return String.format("Name: %s\nAuthor: %s\nYear: %d\n", name, author,
				year);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
