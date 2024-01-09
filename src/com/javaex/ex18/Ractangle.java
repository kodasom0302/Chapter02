package com.javaex.ex18;

public class Ractangle extends Shape {
	
	private int width;
	private int height;
	
	public Ractangle() {
		super();
	}
	public Ractangle(int width, int height, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
