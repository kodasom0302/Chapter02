package com.javaex.ex09;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		System.out.println("Point()");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(int x, int y)");
	}
	
	public int getX() {
		if (this.x<0) {
			return 0;
		} else {
			return x;
		}
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
		System.out.println("점[x="+this.getX()+", y="+this.y+"]을 그렸습니다.");
	}
	
	public void draw(boolean action) {
		if (action==true) {
			System.out.println("점[x="+getX()+", y="+this.getY()+"]을 그렸습니다.");
		} else {
			System.out.println("점[x="+this.x+", y="+this.y+"]을 지웠습니다.");
		}
	}

}
