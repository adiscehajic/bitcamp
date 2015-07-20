package ba.bitcamp.w10d01_WritingGenerics.exercises.task04;

public class Editor extends Application {

	private String type;
	private Boolean isFreeware;

	public Editor(String name, Integer year, Double version, Integer size,
			String type, Boolean isFreware) {
		super(name, year, version, size);
		this.type = type;
		this.isFreeware = isFreware;
	}

	public String toString() {
		return String.format("%s, Type: %s, Is Freware: %b\n",
				super.toString(), type, isFreeware);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getIsFreeware() {
		return isFreeware;
	}

	public void setIsFreeware(Boolean isFreeware) {
		this.isFreeware = isFreeware;
	}

}
