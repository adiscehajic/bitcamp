package ba.bitcamp.W04D05.exercises.tasks;

public class Main {

	public static void main(String[] args) {

		// Artists

		Artist artistFirst = new Artist("Sting", false, 1977, "Rock");
		Artist artistSecond = new Artist("Whitesnake", true, 1978, "Rock");
		Artist artistThird = new Artist("Bon Jovi", true, 1983, "Rock");
		Artist artistFourth = new Artist("Halid Beslic", false, 1975, "Folk");


		// Songs

		Song songFirst = new Song(artistThird, "Always", 1994, "Rock");
		Song songSecond = new Song(artistThird, "Bed of Roses", 1994, "Rock");
		Song songThird = new Song(artistThird, "It's my life", 2000, "Rock");
		Song songFourth = new Song(artistThird, "Runaway", 1984, "Rock");
		
		Song songFive = new Song(artistFourth, "Necu necu dijamante", 1985, "Folk");
		Song songSix = new Song(artistFourth, "Okuj me care", 1985, "Folk");
		
		// Albums
		
		Song[] songsFirst = new Song[]{songFirst, songSecond, songThird, songFourth};
		
		Album albumFirst = new Album("Keep the faith", artistThird, songsFirst, "Rock");
		
		Song[] songsSecond = new Song[]{songFive, songSix};
		
		Album albumSecond = new Album("Necu necu dijamante", artistFourth, songsSecond, "Folk");
		
		Album[] albumArray = {albumFirst, albumSecond};
		
		
		// Calling method isSameAuthor
		System.out.printf("Is the artist of song %s and song %s same? %b\n\n",
				songFirst.nameSong, songThird.nameSong,
				isSameAuthor(songFirst, songThird));
		
		// Calling method isFromSoloAuthor
		System.out.printf("Is the song from solo author or band? %b\n\n", isFromSoloAuthor(songThird));
		
		// Calling method getOlderSong
		System.out.println("Older song is:\n" + getOlderSong(songFirst, songThird) + "\n\n");
		
		// Calling method countGenreNumber
		System.out.println(countGenreNumber(albumFirst, "Folk"));
		
		// Calling method printALbumInformation and finding in which album is inputed song
		printAlbumInformation(albumArray, songFive);
		
		
	}

	/**
	 * Checking if the author of two songs is same.
	 * 
	 * @param s1
	 *            Author of first song
	 * @param s2
	 *            Author of second song
	 * @return True if the author is same and false if the author is not same
	 */
	public static boolean isSameAuthor(Song s1, Song s2) {

		if (s1.artist.name.equals(s2.artist.name)) {
			return true;
		}

		return false;
	}

	/**
	 * Checking if the author of song is solo artist or band
	 * 
	 * @param s1
	 *            Song that we checking
	 * @return True if the song is from solo artist and false if the song is
	 *         from band
	 */
	public static boolean isFromSoloAuthor(Song s1) {
		
		if (s1.artist.isBand) {
			return false;
		}

		return true;

	}
	
	/**
	 * Compares two songs and prints one that is older
	 * @param s1 First song
	 * @param s2 Second song
	 * @return Song that is older
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		
		if (s1.yearSong > s2.yearSong) {
			return s2;
		} 
			return s1;
		
	}
	
	/**
	 * Goes trough album and counts how many songs is with inputed genre
	 * @param a Selected album
	 * @param genre Selected genre
	 * @return Number of songs which genre is same as inputed genre 
	 */
	public static int countGenreNumber(Album a, String genre) {
		
		int counter = 0;
		
		for (int i = 0; i < a.songs.length; i++) {
			if (a.songs[i].genreSong == genre) {
			counter++;
		}
		}
		
		return counter;
	}
	
	/**
	 * Checking in which album is inputed song and prints all information about that album
	 * @param a Array of albums
	 * @param s Song that method checks
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		
		for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].songs.length; j++) {
			if (a[i].songs[j].nameSong.equals(s.nameSong)) {
				System.out.println(a[i]);
			}
		}
			
		}
		
	}
	
	
//	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a) {
//		
//		return a;
//	}

}
