package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		
		//배열 만들기
		Goods[] goodsArray=new Goods[3];
		
		//상품 만들기
		Goods camera=new Goods("니콘", 400000);
		Goods computer=new Goods("LG그램", 900000);
		Goods cup=new Goods("머그컵", 2000);
		
		//배열에 상품 넣기
		goodsArray[0]=camera;
		goodsArray[1]=computer;
		goodsArray[2]=cup;
		
		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());

	}

}
