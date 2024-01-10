package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Drawable 배열 만들기
		Drawable[] dArray=new Drawable[4];
		
		//사각형
		Drawable d01=new Rectangle(100, 100, "빨강", "빨강");
		//d01.draw();
		
		//점
		Drawable d02=new Point(2, 2);
		//d02.draw();
		
		//원
		Drawable d03=new Circle(3, "노랑", "파랑");
		//d03.draw();
		
		//삼각형
		Drawable d04=new Triangle(4, 5, "보라", "초록");
		//d04.draw();
		
		//배열에 주소 넣기
		dArray[0]=d01;
		dArray[1]=d02;
		dArray[2]=d03;
		dArray[3]=d04;
		
		//배열 출력
		for (int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로
		System.out.println(((Rectangle)dArray[0]).getWidth());
		
		//원의 넓이
		System.out.println(((Circle)dArray[2].area()));
		System.out.println(((Shape)dArray[2].area()));
		
		//점의 y값
		System.out.println(((Point)dArray[1].getY()));
		
		//전체에서 도형의 넓이를 출력
		for (int i=0; i<dArray.length; i++) {
			if (dArray[i] instanceof Shape) {	//현재 배열의 주소(방)를 따라가면 Shape이 있습니까?
				System.out.println(((Shape)dArray[i].area()));
			}
		}
		
	}

}
