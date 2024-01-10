package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Rectangle r01=new Rectangle(2, 2, "주황", "주황");
		System.out.println(r01.getWidth());
		*/
		
		Shape[] sArray=new Shape[3];
		
		//부모만 보인다 - 자식은 사용 불가능
		Shape s01=new Rectangle(20, 20, "빨강", "빨강");
		Shape s02=new Triangle(100, 100, "노랑", "노랑");
		Shape s03=new Circle(200, "파랑", "파랑");
		
		sArray[0]=s01;
		sArray[1]=s02;
		sArray[2]=s03;
		
		for (int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//사각형의 가로 값 가져오기
		System.out.println(((Rectangle)sArray[0]).getWidth());
		
		//원의 반지름 가져오기
		System.out.println(((Circle)sArray[2]).getRadius());
		
		//전체 면적 구하기
		for (int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
