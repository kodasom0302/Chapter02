package com.javaex.ex06;

public class Goods {
	
	//필드
	String name;
	int Price;
	
	//생성자 : 메모리에 올리는 일 = 클래스 인스턴스화
	//없으면 디폴트 생성자 작동
	//다른 생성자 만들면 아예 사라져 꼭 써줘야 함
	public Goods() {
		System.out.println("Goods()");
	}
	//기본 작업 제외 내가 원하는 일 추가
	public Goods(String name) {
		this.name=name;
		System.out.println("Goods(name)");
	}
	public Goods(String name, int price) {
		this(name); //기존 생성자 중 1개 호출
		//this.name=name;에서의 this와 다른 것
		this.Price=price;
		System.out.println("Goods(name,price)");
	}
	
	//메소드 - 게터/세터
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
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", Price=" + Price + "]";
	}

}
