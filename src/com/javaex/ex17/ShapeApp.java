package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray=new Ractangle[3];
		Triangle[] tArray=new Triangle[3];
		Circle[] cArray=new Circle[3];
		
		Ractangle r01=new Ractangle("파랑", "빨강", 5, 10);
		Ractangle r02=new Ractangle("노랑", "노랑", 10, 15);
		Ractangle r03=new Ractangle("초록", "보라", 20, 25);
		
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		for (int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Triangle t01=new Triangle(5, 10, "파랑", "빨강");
		Triangle t02=new Triangle(10, 15, "노랑", "노랑");
		Triangle t03=new Triangle(20, 25, "초록", "보라");
		
		tArray[0]=t01;
		tArray[1]=t02;
		tArray[2]=t03;
		
		for (int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		Circle c01=new Circle(1, "노랑", "핑크");
		Circle c02=new Circle(5, "빨강", "주황");
		Circle c03=new Circle(7, "보라", "파랑");
		
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		for (int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}

	}

}
