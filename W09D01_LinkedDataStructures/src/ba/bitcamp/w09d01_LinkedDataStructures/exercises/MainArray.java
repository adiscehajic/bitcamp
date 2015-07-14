package ba.bitcamp.w09d01_LinkedDataStructures.exercises;

public class MainArray {

	public static void main(String[] args) {
		
		Song songOne = new Song("Always", "Bon Jovi", 1980, Song.ROCK);
		Song songTwo = new Song("99 Problems", "Jay Z", 2005, Song.HIP_HOP);
		Song songThree = new Song("Diamonds", "Rihanna", 2014, Song.POP);
		
		ArrayListSong songArray = new ArrayListSong();
	
		
		songArray.add(songOne);
		songArray.add(songTwo);
		songArray.add(songTwo);
		songArray.add(songOne);
		songArray.add(songThree);
//		
		System.out.println(songArray);
//		
//		//System.out.println(songArray.get(1));
//		
//		songArray.remove(songOne);
//		songArray.remove(songTwo);
//		System.out.println(songArray);
//		
		System.out.println(songArray.numberOfSongs());
		
		
		
	}
	
}
