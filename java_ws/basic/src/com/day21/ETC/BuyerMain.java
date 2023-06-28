package com.day21.ETC;

import java.util.ArrayList;

public class BuyerMain {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//ArrayList
		ArrayList<Product> plist = new ArrayList<>(3);
		plist.add(new TV(200));
		plist.add(new Computer(150));
		plist.add(new TV(300));

		//배열
		Product[] pArr = new Product[3];
		pArr[0] = new TV(200);
		pArr[1] = new Computer(150);
		pArr[2] = new TV(300);
		
		
		
		//200만원 TV구매
		b.buy(plist.get(0));
		//150만원 Computer 구매
		b.buy(plist.get(1));
		//300만원 TV구매
		b.buy(plist.get(2));
		//200만원 TV 반품
		b.refund(plist.get(0));
		
		b.summary();
	}

}
