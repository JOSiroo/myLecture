package com.day18.ETC;

public class FruitMain {

	public static void main(String[] args) {
		FruitBuyer buyer = new FruitBuyer(3500);
		FruitBuyer buyer1 = new FruitBuyer(3500);
		FruitBuyer buyer2 = new FruitBuyer(3500);
		/*
       과일장사1 : 보유하고 있는 사과의 개수는 30개, 개당 가격은 1500원
       과일장사2 : 보유하고 있는 사과의 개수는 20개, 개당 가격은 1000원
       나는 과일장사1 에게 4500원어치 사과를 구매했고, 과일장사2 에게 2000원어치 사과를 구매했다.
		*/
		FruitSeller seller1 = new FruitSeller(0, 30, 1500);
		FruitSeller seller2 = new FruitSeller(0, 20, 1000);
		
		System.out.println("======배열 이용======");
		//seller1에게 2000원 어치 사과 구매
		buyer.buyApple(seller1, 2000);
		buyer.showInfo();
		System.out.println("======클래스 이용======");
		buyer1.buyApple1(seller1, 2000);
		buyer1.showInfo();
		
		
		System.out.println("======돈이부족합니다======");
		//seller2에게 5000원 어치 사과 구매
		buyer2.buyApple(seller2, 5000);
		buyer2.showInfo();
		
	}

}
