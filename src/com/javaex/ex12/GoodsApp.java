package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		
		System.out.println(Goods.count);
		
		Goods camera=new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		Goods computer=new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup=new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		/* setCount()를 임의로 바꿀 수 있기 때문에 없는 게 좋음
		cup.setCount(100);
		System.out.println(cup.toString());
		*/
		
		System.out.println(cup.getCount());
		System.out.println(computer.getCount());
		
		System.out.println(Goods.count);

	}

}
