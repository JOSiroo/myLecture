package com.day12;

import java.util.Scanner;

class Temporary{
	private String name;
	private int time;
	private int pay;
	public Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = 	pay;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String setName() {
		return name;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getTime() {
		return time;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getPay() {
		return pay;
	}
	
	public int payment() {
		int payment = time*pay;
		return payment;
	}
}
public class TemporaryMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 일한시간, 시간당 급여를 입력하세요");
		String name = sc.nextLine();
		int time = sc.nextInt();
		int pay = sc.nextInt();
		
		Temporary tem = new Temporary(name, time, pay);
		System.out.println(tem.payment());
				
	}

}
