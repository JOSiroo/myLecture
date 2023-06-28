package com.day13;

/*
	멤버변수 - 클래스 영역에서 선언된 변수
	1) 인스턴스 변수			- static이 붙지 않은 멤버변수
	2) static 변수(클래스 변수)	- static이 붙은 변수

	클래스 변수의 초기화 시점
	- 해당 클래스가 처음 메모리에 로딩될 때 단 한번 초기화됨
	
	인스턴스 변수의 초기화 시점
	- 인스턴스가 생성될 대마다 각 인스턴스별로 초기화가 이루어 짐
	
	클래스 변수의 초기화 순서
	- default => 명시적 초기화 => static초기화 블럭
	
	인스턴스 변수의 초기화 순서
	- default => 명시적 초기화 => 생성자
	
	클래스 변수는 항상 인스턴스 변수보다 먼저 생서오디고 초기화됨
*/


class BBB{
	static int cv = 1; //명시적 초기화
	int iv = 1; //명시적 초기화
	
	static {
		cv = 2;
		System.out.println("static초기화 블럭");
	}
	
	BBB(){
		iv = 3;
		System.out.println("생성자!");
	}
}


public class InitTest {
	public static void main(String[] args) {
		System.out.println("BBB.cv = " + BBB.cv);
		
		BBB b = new BBB();
		System.out.println("b.iv = " + b.iv);
		
		
		
		
		
		
		
	}

}
