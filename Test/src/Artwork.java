public class Artwork extends Exhibit {

	/*
	 * Declaring properties of artwork.
	 */
	private String author;
	private Period period;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            - Name of the artwork.
	 * @param description
	 *            - Description of the artwork.
	 * @param author
	 *            - Author of the artwork.
	 * @param period
	 *            - Period of the artwork.
	 */
	public Artwork(String name, String description, String author, Period period) {
		super(name, description);
		this.author = author;
		this.period = period;
	}

	/**
	 * Enum class of the periods from which artworks can be.
	 * 
	 * @author adis.cehajic
	 *
	 */
	public enum Period {
		RENASCENCE, NEOCLASSIC, MODERN_ART, CONTEMPORARY_ART
	};

	/**
	 * Prints the artwork.
	 */
	public String toString() {
		return String.format("%s, Author: %s, Period: %s", super.toString(),
				author, period);
	}

	/**
	 * Checks if the two artworks are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artwork other = (Artwork) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	/*
	 * Get and set methods.
	 */
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	/**
	 * Checks if any attribute of the employee contains inputed string.
	 * 
	 * @return True if any attribute contains inputed string and false if
	 *         otherwise.
	 */
	public boolean fitsSearch(String s) {
		if (super.fitsSearch(s) || contains(author, s) || contains(String.valueOf(period), s)) {
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
