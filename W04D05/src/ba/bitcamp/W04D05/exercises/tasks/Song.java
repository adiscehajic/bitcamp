package ba.bitcamp.W04D05.exercises.tasks;

public class Song {

	Artist artist;
	public String nameSong;
	public int yearSong;
	public String genreSong;
	
	public String toString() {
		
		String s = "";
		s += "Artist: " + artist.name + "\n";
		s += "Song name: " + nameSong + "\n";
		s += "Year of publishing: " + yearSong + "\n";
		s += "Song genre: " + genreSong + "\n";
		
		return s;
		
	}

	public Song(Artist artist, String nameSong, int yearSong, String genreSong) {
		this.artist = artist;
		this.nameSong = nameSong;
		this.yearSong = yearSong;
		this.genreSong = genreSong;
	}
	
	
	
	
	
}
