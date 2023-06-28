package com.day19.ETC;

import java.util.Scanner;

public class BuyerMain {

	public static void main(String[] args) {
		/*
		Buyer b = new Buyer(1000);

		// 1. 100만원 TV 구매
		b.buy(new TV(100));
		// 2. 200만원 computer 구매
		b.buy(new Computer(200));

		b.showInfo();
		 */

		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer(1000);

		while(true) {
			System.out.println("1. 상품구매 2. 구매내역 조회 3. 종료");
			int type = sc.nextInt();

			switch(type) {
			case 1:
				System.out.println("구매할 상품 선택 1.TV 2.Computer");
				int k = sc.nextInt();
				if(k != 1 && k!= 2) {
					System.out.println("구매할 상품을 잘못 선택함!");
					continue;
				}

				System.out.println("상품가격 입력!");
				int price = sc.nextInt();
				Product p = null;
				if(k == 1) {
					p  = new TV(price);
				}else if(k ==2) {
					p = new Computer(price);
				}
				b.buy(p);
				break;
			case 2:
				b.summary();
				b.showInfo();
				break;
			case 3:
				System.out.println("종료합니다");
				return;
			default :
				System.out.println("잘못 입력!");
				continue;
			}
		}
	}

}
