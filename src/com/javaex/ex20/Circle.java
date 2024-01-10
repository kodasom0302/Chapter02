package com.javaex.ex20;

public class Circle extends Shape {
	
	private int radius;

	public Circle() {
	}
	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	public void draw() {
	    // 사각형을 시각화 하는 복잡한 로직작동
	    System.out.println("====사각형을 그렸습니다=========");
	    System.out.println("반지름:" + radius);
	    System.out.println("면색:" + super.fillColor);
	    System.out.println("선색:" + super.getLineColor());
	    System.out.println("============================");
	}
	public double area() {
		return 3.14*radius*radius;
	}

}
