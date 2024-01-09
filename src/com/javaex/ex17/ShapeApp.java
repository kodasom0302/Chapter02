package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray=new Ractangle[3];
		
		Ractangle r01=new Ractangle("파랑", "빨강", 5, 10);
		Ractangle r02=new Ractangle("노랑", "노랑", 10, 15);
		Ractangle r03=new Ractangle("초록", "보라", 20, 25);
		
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Triangle[] tArray=new Triangle[3];
		
		Triangle t01=new Triangle()

	}

}
