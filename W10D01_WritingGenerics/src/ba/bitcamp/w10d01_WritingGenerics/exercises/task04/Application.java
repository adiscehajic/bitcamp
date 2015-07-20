package ba.bitcamp.w10d01_WritingGenerics.exercises.task04;

public class Application {

	private String name;
	private Integer year;
	private Double version;
	private Integer size;

	public Application(String name, Integer year, Double version, Integer size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	public String toString() {
		return String.format("Name: %s, Year: %d", name, year);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
}
