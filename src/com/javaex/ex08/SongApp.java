package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1=new Song("좋은날", "아이유");
		s1.setAlbum("Real");
		s1.setComposer("이민수");
		s1.setYear(2010);
		s1.setTrack(3);
		System.out.println(s1.toString());
		
		Song s2=new Song("거짓말", "BIGBANG");
		s2.setAlbum("Always");
		s2.setComposer("G-DRAGON");
		s2.setYear(2007);
		s2.setTrack(2);
		System.out.println(s2.toString());
		
		Song s3=new Song("벚꽃엔딩", "버스커버스커");
		s3.setAlbum("버스커버스커1집");
		s3.setComposer("장범준");
		s3.setYear(2012);
		s3.setTrack(4);
		System.out.println(s3.toString());

	}

}
