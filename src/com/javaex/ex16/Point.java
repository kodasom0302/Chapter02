package com.javaex.ex16;

public class Point {
	
	protected int x;
	private int y;
	
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("point(2)");
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void draw() {
		System.out.println("점="+this.x+", y="+this.y+"을 그렸습니다");
	}

}
