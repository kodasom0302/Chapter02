package com.javaex.ex08;

public class Song {
	
	String title;
	String artist;
	
	public Song() {
	}
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
		System.out.println(artist+", "+title);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + "]";
	}

}
