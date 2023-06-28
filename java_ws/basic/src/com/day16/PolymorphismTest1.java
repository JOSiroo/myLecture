package com.day16;


class Parent{
	public void parentFunc() {
		System.out.println("부모의 메서드!");
	}
	public void showInfo() {
		System.out.println("Parent showInfo()");
	}
}

class Child extends Parent{
	public void showInfo() {
		System.out.println("Child showInfo() - 오버라이딩 메소드");
	}
	public void chilFunc() {
		System.out.println("자식만의 메서드");
	}
}
public class PolymorphismTest1 {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		ch.chilFunc();
		ch.parentFunc();
		
		//다형성
		Parent p = new Child();
		p.showInfo();
		p.parentFunc();
		//p.childFunc();	//error
		/*
		 	부모의 참조변수로 자식의 인스턴스를 참조
		 	=> 부모 타입의 참조변수로는 부모의 멤버만 사용할 수 있다
		 	단, 오버라이딩된 메서드의 경우는 자식의 오버라이딩 메서드 사용!!!
		
			- 하나의 부모 클래스로 여러개의 자식 클래스들을 통합관리하여 그 효율성을 높인 것
			- 부모 타입이 모든 자식 타입을 가리킬 수 있으므로 부모 타입의 변수로 모든 자식 타입을
				일관되게 관리할 수 있다
			- 여러 가지 형태를 가질 수 있는 능력
			
			(부모에 자식을 넣는다, 이때는 자식의 오버라이딩 메서드가 호출된다.)
		*/
		
	}

}
