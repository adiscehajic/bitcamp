package ba.bitcamp.w06d01.lectures.interfacee;

public class Bar implements Compare {

	private String name;
	
	public Bar(String name){
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String toString(){
		return "Bar: " + name;
	}

	/**
	 * Compares two bars and returns value for a status of comparing.
	 *
	 * @param other
	 *            - Second bar.
	 * @return The result of comparing.
	 */
	@Override
	public int compare(Object o) {
		if (o instanceof Bar) {
			Bar other = (Bar) o;
			if (this.name.length() > other.name.length()) {
				return 1;
			} else if (this.name.length() == other.name.length()){
				return 0;
			} else {
				return -1;
			}
		} else {
			throw new IllegalArgumentException();
		}
		
	}
	
}
