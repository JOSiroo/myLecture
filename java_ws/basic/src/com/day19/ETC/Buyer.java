package com.day19.ETC;

//고객 - 물건을 사는 사람
public class Buyer {
	private int myMoney;
	private int point;
	
	
	//구입할 상품을 저장할 배열 추가
	private Product[] pdArr = new Product[10];
	private int index;	//배열의 첨자로 사용될 변수
	
	public Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	//물건을 구매하는 메서드
	public void buy(Product p) {
		if(myMoney < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다");
			return;
		}
		//잔고는 줄고, 포인트는 늘어난다
		this.myMoney -= p.getPrice();
		this.point += p.getPoint();
	
		//구매한 상품을 배열에 저장한다
		pdArr[index++] = p;
		
		System.out.println( p.kind() + "을(를) 구매하였습니다");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney + "만원");
		System.out.println("포인트 : " + point + "만원\n");
	}
	
	public void summary() {
		//구매한 상품명들과 상품 가격의 합계 출력
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < index; i++) {
			sum += pdArr[i].getPrice();	//100 + 200
			itemList += pdArr[i].kind() ;	//TV, Computer
			if(i < index - 1) {
				itemList+= ",";
			}
		}
		
		System.out.println("\n구매하신 물건의 총 금액은 " + sum + "입니다");
		System.out.println("구매하신 제품은 " + itemList + "입니다\n");
	}
}
