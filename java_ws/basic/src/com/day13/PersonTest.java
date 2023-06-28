package com.day13;

class Person{
	// 1. 멤버변수
	private String name;
	private int age;
	private static int count;
	/*
		static변수(클래스변수)
		- 클래스 차원에서 단 하나만 생성되어, 모든 객체가 공유한다
		
		static 멤버
		- 클래스의, 공통적인의 의미를 가지고있다
		- 클래스 차원에서 바로 호출이 가능 
		- 객체 생성하지 않아도 클래스의 이름으로 접근
		
		static변수의 초기화 시점
		- 해당 클래스가 메모리에 로드될 때 생성됨
		
		바이트 코드, static변수는 메모리의 메서드영역에 로드됨
	*/
	
	
	//2. 생성자
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println(++count + "번째 객체 생성!");
	}
	
	//3. 메서드
	public void display() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "\n");
	}
}
public class PersonTest {

	public static void main(String[] args) {
		Person hong = new Person("홍길동", 23);	
		hong.display();
		
		Person kim = new Person("김길동", 28);
		kim.display();
		
		
		/*
		 	객체별로 멤버변수는 각자 따로
		 	메서드는 공유
		*/
	
	}

}
