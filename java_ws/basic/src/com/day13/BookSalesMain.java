package com.day13;

import java.util.Scanner;

class BookSales{
	//멤버변수
	//인스턴스 변수
	private String title;
	private int qty;
	private int price;
	private int salesPrice; // 판매금액
	//static 변수
	private static int totalSalesPrice; // 총 판매금액
	
	//2. 생성자
	BookSales(String title, int qty, int price){
		this.title = title;
		this.qty = qty;
		this.price = price;
	}
	
	public int getSalesPrice() {
		return salesPrice;
	}
	public static int getTotalSalesPrice() {
		return totalSalesPrice;
	}
	
	//메서드
	public void salesPrice() {
		salesPrice = qty*price;
	}
	public void findTotal() {
		totalSalesPrice += salesPrice;
	}
}



public class BookSalesMain {

	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("책 제목, 수량, 단가를 입력하세요!");
			Scanner sc = new Scanner(System.in);
			String title = sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			
			
			
			BookSales book = new BookSales(title, qty, price);
			book.salesPrice();
			book.findTotal();
			System.out.print("판매금액 = " + book.getSalesPrice() + " ");
			System.out.println("누적판매금액 = " + book.getTotalSalesPrice());
			System.out.println("그만하시겠습니다? <Q>uit");
			sc.nextLine();
			String quit = sc.nextLine();
			if(title == "Q") break;
		}
	}
		

}
