package com.day12;

import java.util.Scanner;

public class NameCard {

	//멤버변수 이름, 전화번호, 주소, 직급
	String name;
	String phoneNum;
	String adress;
	String rank;
	
	//생성자
	NameCard(String n, String p, String a, String r){
		 name = n;
		 phoneNum = p;
		 adress = a;
		 rank = r;
	}
	//메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("회사주소 : " + adress);
		System.out.println("직급 : " + rank);
	}
	
	public static void main(String[] args) {
		
		NameCard nc = new NameCard("조상혁", "010-0000-0000", "서울 특별시", "학생");
		nc.showInfo();
		
		System.out.println("\n=====================================\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전화번호, 회사주소, 직급을 입력하세요");
		String name = sc.nextLine();
		String phoneNum = sc.nextLine();
		String adress = sc.nextLine();
		String rank = sc.nextLine();
		
		nc.name = name;
		nc.phoneNum = phoneNum;
		nc.adress = adress;
		nc.rank = rank;
		
		nc.showInfo();
		
	}

}
