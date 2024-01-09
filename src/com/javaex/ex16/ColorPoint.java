package com.javaex.ex16;

public class ColorPoint extends Point {
	
	private String Color;

	public ColorPoint(String color) {
		Color = color;
	}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.Color=color;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [Color=" + Color + "]";
	}
	public void showInfo() {
		System.out.println("x="+super.x+", y="+this.getY()+", color="+Color);
		//System.out.println("x="+getX()+", y="+getY()+", color="+Color);
	}

}
