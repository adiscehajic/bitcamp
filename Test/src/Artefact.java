public class Artefact extends Exhibit {

	/*
	 * Properties of artefact.
	 */
	private String origin;
	private Period period;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            - Name of the artefact.
	 * @param description
	 *            - Description of the artefact.
	 * @param origin
	 *            - Origin of the artefact.
	 * @param period
	 *            - Period of the artefact.
	 */
	public Artefact(String name, String description, String origin,
			Period period) {
		super(name, description);
		this.origin = origin;
		this.period = period;
	}

	/**
	 * Prints the artefact.
	 */
	public String toString() {
		return String.format("%s, Origin: %s, Period: %s", super.toString(),
				origin, period);
	}

	/**
	 * Checks if the two artefacts are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artefact other = (Artefact) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	/**
	 * Enum class of the periods from which artefacts can be.
	 * 
	 * @author adis.cehajic
	 *
	 */
	public enum Period {
		MODERN_ERA, CLASSICAL_ERA, MIDDLE_AGE
	}

	/**
	 * Returns the origin of the artefact.
	 * 
	 * @return - The origin of the artefact.
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin of the artefact.
	 * 
	 * @param origin
	 *            - Value of the artefact.
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Returns from which period is the artefact.
	 * 
	 * @return - The period of the artefact.
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * Sets the period from which is the artefact.
	 * 
	 * @param period
	 *            - The period of the artefact.
	 */
	public void setPeriod(Period period) {
		this.period = period;
	};

	/**
	 * Checks if any attribute of the employee contains inputed string.
	 * 
	 * @return True if any attribute contains inputed string and false if
	 *         otherwise.
	 */
	public boolean fitsSearch(String s) {
		if (super.fitsSearch(s) || contains(origin, s)
				|| contains(String.valueOf(period), s)) {
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
