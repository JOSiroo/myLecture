package com.day20.collection;

class Man{
	public void showInfo() {
		System.out.println("this = " + this);
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		//public String toString()
		//Returns a string representation of the object.

		Man m = new Man();
		System.out.println("m 객체를 표현하는 기본 문자열 : " + m.toString());	//com.day20.collection.Man@6f2b958e
		System.out.println("m = " + m);
		System.out.println(m);
		m.showInfo();
		
		/*
		 	toString() 메서드의 결과 : 클래스명@16진수 해시코드
		 	hashCode() - 객체의 메모리 주소를 리턴
		 	
		 	toString() 메서드가 자동으로 호출되는 경우
		 		1) System.out.println() 메서드에 매개변수로 들어가는 경우
		 			public void println(Object x)
		 		2) 객체에 대하여 더하기() 연산을 하는 경우
		*/
	}

}
