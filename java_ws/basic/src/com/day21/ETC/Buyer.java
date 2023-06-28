package com.day21.ETC;

import java.util.ArrayList;

//고객 - 물건을 사는 사람
public class Buyer {
	private int myMoney;
	private int point;
	
	
	//구입할 상품을 저장할 ArrayList 추가
	private ArrayList<Product> plist = new ArrayList<Product>();
	
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
		plist.add(p);
		
		System.out.println( p + "을(를) 구매하였습니다");
	}
	
	public void showInfo() {
		System.out.println("현재 잔고 : " + myMoney + "만원");
		System.out.println("포인트 : " + point + "만원\n");
	}
	
	public void summary() {
		if(plist.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		
		//구매한 상품명들과 상품 가격의 합계 출력
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < plist.size(); i++) {
			Product p = plist.get(i);
			sum += p.getPrice();	//100 + 200
			itemList += p;	//TV, Computer
			if(i < plist.size()-1) {
				itemList+= ",";
			}
		}
		
		System.out.println("\n구매하신 물건의 총 금액은 " + sum + "입니다");
		System.out.println("구매하신 제품은 " + itemList + "입니다\n");
	}
	public void refund(Product p) {	//구입한 제품을 환불한다
		//boolean java.util.ArrayList.remove(Object o)
		if(plist.remove(p)) {
			myMoney += p.getPrice();
			point -= p.getPoint(); 
			System.out.println(p + "을/를 반품하셨습니다.");
		}else {
			System.out.println("구매하신 제품중 해당 제품이 없습니다. 다시 확인해 주세요");
		}
	}
	
}
