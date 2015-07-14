package ba.bitcamp.w09d01_LinkedDataStructures.exercises;

import java.util.Arrays;

public class ArrayListSong {

	private Song[] songs;
	private int count;

	public ArrayListSong(Song[] songs) {
		super();
		this.songs = songs;
		this.count = songs.length;
	}

	public ArrayListSong() {
		super();
		this.songs = new Song[0];
		this.count = 0;
	}

	public String toString() {
		return Arrays.toString(songs);
	}

	/**
	 * Checks if the two song lists are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArrayListSong other = (ArrayListSong) obj;
		if (!Arrays.equals(songs, other.songs))
			return false;
		return true;
	}

	/**
	 * Adds the new song into the list of songs.
	 * 
	 * @param song
	 *            - Song that user wants to add.
	 */
	public void add(Song song) {

		if (count >= songs.length) {
			Song[] temp = new Song[songs.length * 2 + 1];

			for (int i = 0; i < songs.length; i++) {
				temp[i] = songs[i];
			}

			temp[count] = song;
			songs = temp;
			count++;
		} else if (count < songs.length) {
			songs[count] = song;
			count++;
		}
	}

	/**
	 * Prints the song from the list that is in inputed index.
	 * 
	 * @param index
	 *            - Index of the song.
	 * @return - Song that is on inputed index.
	 */
	public Song get(int index) {
		return songs[index];
	}

	/**
	 * Removes song that is on inputed index from the list.
	 * 
	 * @param index
	 *            - Index of the song.
	 */
	public void remove(int index) {
		Song[] temp = new Song[songs.length - 1];

		int offset = 0;

		for (int i = 0; i < temp.length; i++) {
			if (i == index) {
				temp[i] = songs[++offset];
			} else {
				temp[i] = songs[offset];
			}
			offset++;
		}
		songs = temp;
	}

	/**
	 * Removes the inputed song from the list.
	 * 
	 * @param song
	 *            - Song that user wants to remove.
	 */
	public void remove(Song song) {
		remove(indexOf(song));
	}

	/**
	 * Prints the size of the list of songs.
	 * 
	 * @return Size of the list.
	 */
	public int size() {
		return songs.length;
	}

	/**
	 * Prints the number of the songs in the list.
	 * 
	 * @return Number of the songs in the list.
	 */
	public int numberOfSongs() {
		return count;
	}

	/**
	 * Prints the index of the inputed song.
	 * 
	 * @param song
	 *            - Song that user want to know index.
	 * @return Index of the song or -1 if there is no song in the list.
	 */
	public int indexOf(Song song) {
		for (int i = 0; i < songs.length; i++) {
			if (songs[i].equals(song)) {
				return i;
			}
		}
		return -1;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void setSongs(Song[] songs) {
		this.songs = songs;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
