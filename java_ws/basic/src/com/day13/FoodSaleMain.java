
package com.day13;

import java.util.Scanner;

class FoodSale{
	//멤버변수
	private String menu;
	private int qty;
	private int cost;
	private double price;
	
	private static final double sale = 0.1;
	private static int totalPrice;
	
	public FoodSale(String menu, int qty, int cost){
		this.menu = menu;
		this.qty = qty;
		this.cost = cost;
		//this.price = price;
	}

	public double getPrice() {
		return price;
	}
	public void addTotal() {
		totalPrice += price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public static double getSale() {
		return sale;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void findPrice() {
		int discount = (int)(cost * qty*sale);
		price = cost * qty - discount;
	}
	public static void setTotalPrice(int price) {
		totalPrice += price;
	}
}


public class FoodSaleMain {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("메뉴, 수량, 단가를 입력하세요");
		String menu = sc.nextLine();
		int qty = sc.nextInt();
		int cost = sc.nextInt();
		
		FoodSale food = new FoodSale(menu, qty, cost);
		//food.getPrice();
		//FoodSale.getTotalPrice();
		//System.out.println("판매금액 : " + food.Price());
		//System.out.println("총 판매금액 : "  + FoodSale.getTotalPrice());
		System.out.println("그만하시겠습니다? <Q>uit");
		sc.nextLine();
		String Q = sc.nextLine();
		if(Q.equalsIgnoreCase("Q")) break;
		}

	}
}
