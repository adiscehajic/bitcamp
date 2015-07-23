public class Exhibit implements Comparable<Exhibit>, Searchable {

	/*
	 * Declaring properties of exhibit.
	 */
	private Integer id;
	private String name;
	private String description;

	private static Integer idCounter = 1;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            - Name of the exhibit.
	 * @param description
	 *            - Description of the exhibit.
	 */
	public Exhibit(String name, String description) {
		super();
		this.id = idCounter++;
		this.name = name;
		this.description = description;
	}

	/**
	 * Prints the exhibit.
	 */
	public String toString() {
		return String.format("ID: %d, Name: %s, Description: %s", id, name,
				description);
	}

	/**
	 * Checks if the two exhibits are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exhibit other = (Exhibit) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Compares two exhibits.
	 * 
	 * @param o
	 *            - Second exhibit to be compared.
	 * @return The value 0 if the argument is a name lexicographically equal to
	 *         this name; a value less than 0 if the argument is a name
	 *         lexicographically greater than this name; and a value greater
	 *         than 0 if the argument is a name lexicographically less than this
	 *         name.
	 */
	public int compareTo(Exhibit o) {
		return this.name.compareTo(o.name);
	}

	/**
	 * Checks if any attribute of the employee contains inputed string.
	 * 
	 * @return True if any attribute contains inputed string and false if
	 *         otherwise.
	 */
	public boolean fitsSearch(String s) {
		if (contains(name, s) || contains(description, s)) {
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
