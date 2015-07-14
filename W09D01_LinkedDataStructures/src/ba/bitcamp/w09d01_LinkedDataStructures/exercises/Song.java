package ba.bitcamp.w09d01_LinkedDataStructures.exercises;

public class Song {

	private String name;
	private String author;
	private int year;
	private int genre;

	public static final int ROCK = 1;
	public static final int POP = 2;
	public static final int HIP_HOP = 3;

	public Song(String name, String author, int year, int genre) {
		super();
		this.name = name;
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	public String toString() {
		String s = "";
		if (genre == ROCK) {
			s = "Rock";
		} else if (genre == POP) {
			s = "Pop";
		} else {
			s = "Hip-hop";
		}

		return String.format("Name: %s, Author: %s, Year: %d, Genre: %s\n",
				name, author, year, s);
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

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

}
