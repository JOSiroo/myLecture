package com.day24;

class Person{
	public void display() {
		System.out.println("this = " + this);
	}
}

public class ObjectTest {

	public static void main(String[] args) {
		Person p = new Person();
		Person p2 = new Person();
		
		System.out.println("두 객체가 같은가?" + p.equals(p2));
		System.out.println("p객체의 클래스 ? " + p.getClass());
		System.out.println("p객체의 hashCode ? " + p.hashCode());
		System.out.println("p객체를 표현하는 기본 문자열? ? " + p.toString());
		System.out.println(" p = " + p);
		System.out.println("p객체의 hashCode의 16진수 값? " + Integer.toHexString(p.hashCode()));
		
		p2 = p;
		if(p.equals(p2)) {
			System.out.println("p와 p2는 같다");
		}else {
			System.out.println("p와 p2는 다르다");
		}
		
		/*
		 	toString() 메서드의 결과
		 		- 클래스명@16진수 해시코드
		 		- getClass.getName() + "@" + Integer.toHexString(hashCode())
		*/
		
		
	}

}
