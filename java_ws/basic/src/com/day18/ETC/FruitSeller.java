package com.day18.ETC;
//과일 판매자 클래스(과일 장사)
public class FruitSeller {
	private int numOfApple;	//사과의 개수
	private int myMoney;	//판매수익(남은 돈)
	private final int APPLE_PRICE;	//사과 하나의 가격
	
	public FruitSeller(int money, int numOfApple, int price) {
			this.myMoney = money;
			this.numOfApple = numOfApple;
			this.APPLE_PRICE = price;
			//=>	final 상수 - 생성자에서 단 한번 초기화 : 인스턴스별로 다른 값 할당
	}
	
	
	
	public void showInfo() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney + "\n");
	}
	/*
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;	//사과의 수가 줄어들고,
		myMoney += money;	//판매수익이 발생
		return num;	//구매자에게 줄 사과 개수
	}
	*/
	/**클래스로 만든 거스름돈 주는 판매자 메서드*/
	public FruitSeller1 saleApple1(int money) {
		int nam = money / APPLE_PRICE;
		int change = money % APPLE_PRICE;
		FruitSeller1 fr = new FruitSeller1(nam, change);
	
		return fr;
	}
	/**배열로 만든 거스름돈 판매자 메서드*/
	public int[] saleApple(int money) {	//2000
		int[] arr = new int[2];
		if(money/APPLE_PRICE != 0) {
			arr[0] = money / APPLE_PRICE;	//1
			arr[1] = money % APPLE_PRICE;	//500
			numOfApple -= arr[0];	//사과의 수가 줄어들고,
			myMoney += money-arr[1];	//판매수익이 발생
		}else {
			arr[0] = money / APPLE_PRICE;
			arr[1] = money % APPLE_PRICE;
			numOfApple -= arr[0];	//사과의 수가 줄어들고,
			myMoney += money-arr[1];	//판매수익이 발생
		
		}
		return arr;	//구매자에게 줄 사과 개수
	}


	
	
}
