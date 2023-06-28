package com.day21.ETC;

abstract public class Product {
	private int price;	//상품의 가격
	private int point;	//포인트 점수
	private final double POINT_RATE = 0.02;	//가격의 2%가 포인트 점수
	
	public Product(int price) {
		this.price = price;
		this.point = (int)(price*POINT_RATE);
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

class TV extends Product {
	TV(int price){
		super(price);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer(int price){
		super(price);
	}
	
	public String toString() {
		return "Computer";
	}
}