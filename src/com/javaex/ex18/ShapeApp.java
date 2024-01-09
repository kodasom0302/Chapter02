package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle r01=new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("노랑");
		
		System.out.println(r01.toString());

	}

}
