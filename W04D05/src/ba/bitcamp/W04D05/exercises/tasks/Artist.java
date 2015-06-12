package ba.bitcamp.W04D05.exercises.tasks;

public class Artist {

	public String name;
	public boolean isBand;
	public int yearsActive;
	public String musicGenre;
	
	public String toString() {
		
		String s = "";
		s += "Name: " + name + "\n";
		s += "Is artist band? " + isBand + "\n";
		s += "Years active: " + yearsActive + "\n";
		s += "Genre of music: " + musicGenre + "\n";
	
		return s;
	}

	public Artist(String name, boolean isBand, int yearsActive,
			String musicGenre) {
		super();
		this.name = name;
		this.isBand = isBand;
		this.yearsActive = yearsActive;
		this.musicGenre = musicGenre;
	}
	
	
	
	
	
}
