package com.day18.ETC;
//과일 구매자 클래스(나)
public class FruitBuyer {
	private int myMoney;	// 남은돈
	private int numOfApple;	// 구매한 사과 개수
	
	public FruitBuyer(int money) {
		myMoney = money;
	}
	
	
	/**배열로 만든 거스름돈 구매자 메서드*/
	public void buyApple(FruitSeller seller, int money) {	//사과를 구매하는 메서드
		if(money > myMoney) {
			System.out.println("돈이 부족합니다");
		}else {
			int[] num = seller.saleApple(money);
		numOfApple += num[0];
		myMoney -= money - num[1];
		}
	}
	
	/**클래스로 만든 거스름돈 주는 구매자 메서드*/
	public void buyApple1(FruitSeller seller, int money) {
		if(money > myMoney) {
			System.out.println("돈이 부족합니다");
		}else {
			FruitSeller1 fr = seller.saleApple1(money);
		numOfApple += fr.nam;
		myMoney -= money - fr.change;
		}
	}
	

	public void showInfo() {
		System.out.println("현재 잔액 : " + myMoney);
		System.out.println("사과 개수 : " + numOfApple + "\n");
	}
	
}
