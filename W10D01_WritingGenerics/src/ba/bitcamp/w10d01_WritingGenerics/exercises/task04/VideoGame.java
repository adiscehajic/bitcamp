package ba.bitcamp.w10d01_WritingGenerics.exercises.task04;

public class VideoGame extends Application {

	private String genre;
	private String studio;
	private Integer numberOfSoldCopies;

	public VideoGame(String name, Integer year, Double version, Integer size,
			String genre, String studio, Integer numberOfSoldCopies) {
		super(name, year, version, size);
		this.genre = genre;
		this.studio = studio;
		this.numberOfSoldCopies = numberOfSoldCopies;
	}

	public String toString() {
		return String.format("%s, Genre: %s, Studio: %s, Sold copies: %d\n",
				super.toString(), genre, studio, numberOfSoldCopies);
	}

}
