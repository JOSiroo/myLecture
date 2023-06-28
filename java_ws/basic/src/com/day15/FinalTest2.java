package com.day15;

/*
 	1)	final 변수
 		- 상수지만 선언과 함께 초기화하지 않고
 			생성자에서 단 한번만 초기화 할 수 있다
 		- 각 인스턴스마다 다른 값을 갖도록 하는 것이 가능ㅇ
 	2)	static final 변수
 		- 선언과 함께초기화
 		-클래스 차원에서 하나만 생성되어, 모든 객체가 같은 값을 갖는다
*/
class Card{
	static final int WIDTH = 100;
	static final int HEIGHT = 250;
	
	final String KIND;
	final int NUMBER;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}

	public void shoInfo() {
		//NUMBER = 10;	//error : 상수는 값 변경 불가
		System.out.println("카드 종류 : " + KIND);
		System.out.println("카드 숫자 : " + NUMBER + "\n");
	}
}

public class FinalTest2 {
	public static void main(String[] args) {
		Card c1 = new Card("Heart", 7);
		c1.shoInfo();
		
		Card c2 = new Card("Diamond", 5);
		c2.shoInfo();
		
		
	}

}

















