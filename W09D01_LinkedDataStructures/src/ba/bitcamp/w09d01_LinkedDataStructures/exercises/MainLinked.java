package ba.bitcamp.w09d01_LinkedDataStructures.exercises;

public class MainLinked {

	public static void main(String[] args) {
		
		Song songOne = new Song("Always", "Bon Jovi", 1980, Song.ROCK);
		Song songTwo = new Song("99 Problems", "Jay Z", 2005, Song.HIP_HOP);
		Song songThree = new Song("Diamonds", "Rihanna", 2014, Song.POP);
		
		LinkedListSong songsLinked = new LinkedListSong();
		
		Song[] songs = new Song[]{songOne, songTwo, songThree, songOne, songTwo, songThree};
		
//		songsLinked.add(songOne);
//		songsLinked.add(songThree);
		
		LinkedListSong songsLinked2 = new LinkedListSong(songs);
		
		System.out.println(songsLinked2);
		
		songsLinked2.remove(0);
	//	songsLinked2.clear();
		songsLinked2.add(songThree);
		System.out.println(songsLinked2);
		
	}
	
}
