package com.day20.collection;

import java.util.ArrayList;

class Product{
	private String code;
	private String pdName;
	private int price;
	
	public Product(String code, String pdName, int price) {
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPdName() {
		return pdName;
	}
	public void setPdName(String pdName) {
		this.pdName = pdName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "[code = " + code + "] " + "[pdName = " + pdName + "] " + "[price = " + price + "]";
	}
}
public class ArrayListTest5 {

	public static void main(String[] args) {
		
		//////////////////////////////ArrayList//////////////////////////////
		//List<Product> list = new ArrayList<>(3);		//가능 - 다형성
		ArrayList<Product> list = new ArrayList<>(3);
		list.add(new Product("pc-1", "컴퓨터", 500000));
		list.add(new Product("tv-1", "텔레비전", 1000000));
		list.add(new Product("phone-1", "핸드폰", 850000));
	
		System.out.println("=============for=============");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString()); 	//toString호출
		}
		System.out.println("========확장 for==========");
		
		for(Product pro : list) {
			System.out.println(pro);						//참조변수만
		}
		///////////////////////////////배열//////////////////////////////////
		Product[] pArr = new Product[3];
		pArr[0] = new Product("pc-1", "컴퓨터", 500000);
		pArr[1] = new Product("tv-1", "텔레비전", 1000000);
		pArr[2] = new Product("phone-1", "핸드폰", 850000);
		System.out.println("===========배열 for================");
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].toString());
		}
		System.out.println("===========배열 확장 for================");
		for(Product pa : pArr) {
			System.out.println(pa);
			//★★★★★ list, set, map은 인터페이스	 각 종류에 해달하는 구현클래스는 말 그대로 구현'클래스' ★★★★★
		}
	}
	

}
