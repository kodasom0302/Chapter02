package com.javaex.ex06;

public class Goods {
	
	String name;
	int Price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", Price=" + Price + "]";
	}

}
