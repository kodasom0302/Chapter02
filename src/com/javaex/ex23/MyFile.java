package com.javaex.ex23;

import java.io.IOException;

public class MyFile {
	
	//정상적일 때
	public String read(String path) {
		String result="학교 종이 땡땡땡 어서 모이자";	//path에 있는 파일을 읽음(가정)
		return result;
	}
	
	//파일이 없는 경우 -> 만드는 쪽에서 처리
	public String read2(String path) {
		String result="";	//path에 있는 파일이 없음(가정)
		
		try {
			//파일이 없는 상황을 강제로 발생
			throw new IOException();
			
		} catch (IOException e) {
			System.out.println("경로에 파일이 없습니다");
		}
		return result;
	}
	
	//파일이 없는 경우 -> 사용자에게 알림
	public String read3(String path) throws IOException {
		String result="";
		throw new IOException();
	}

}
