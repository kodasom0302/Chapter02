package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s01=new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		System.out.println(s01.toString());
		
		Rectangle r01=new Rectangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("노랑");
		System.out.println(r01.toString());
		Rectangle r02=new Rectangle(40, 40, "파랑", "노랑");
		System.out.println(r02.toString());
		
		Triangle t01=new Triangle(25, 56, "보라", "빨강");
		System.out.println(t01.toString());
		Triangle t02=new Triangle(5, 30, "연두", "분홍");
		System.out.println(t02.toString());
		
		Circle c01=new Circle(3, "초록", "검정");
		System.out.println(c01.toString());
		Circle c02=new Circle(28, "민트", "주황");
		System.out.println(c02.toString());

	}

}
