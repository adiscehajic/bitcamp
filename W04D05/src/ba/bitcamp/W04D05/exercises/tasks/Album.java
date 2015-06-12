package ba.bitcamp.W04D05.exercises.tasks;

import java.util.Arrays;

public class Album {

	public String albumName;
	Artist nameArtist;
	Song[] songs;
	public String albumGenre;
	
	
	public Album(String albumName, Artist nameArtist, Song[] songs,
			String albumGenre) {
		this.albumName = albumName;
		this.nameArtist = nameArtist;
		this.songs = songs;
		this.albumGenre = albumGenre;
	}


	
	public String toString() {
		
		String s = "";
		s += "Album name: " + albumName + "\n";
		s += "Author: " + nameArtist.name + "\n";
		s += "Songs: " + Arrays.toString(songs) + "\n";
		s += "Genre: " + albumGenre + "\n";
		
		return s;
		
	}
	
	
	

	
	
}
