package com.day14;

/*
 	상속성	- 부모 클래스의 구성요소, 행위를 그대로 물려받아 사용하고.
 				자신만의 구성요소와 행위는 추가해서 사용
 	상속		- 이미 만들어진 클래스(부모)의 멤버들을 물려받아 새로운 클래스(자식)를 정의하는 기법
 			- 공통되는 부분을 부모 클래스로 추상화하고, 이를 상속하면서 각각의 특징을 드러낼 수 있도록
 				자식 클래스를 정의함
 			- 클래스를 상속받으면 부모 클래스의 멤버들을 사용할 수 있다
 			- 자식 클래스들의 공통적인 부분은 부모 클래스에서 관리하고, 자식 클래스는 자신에 정의된 멤버들만 관리
	
	부모 클래스 - 상위(super)클래스, 기본(base), 조상(혁)
	자식 클래스 - 하위(sub)클래스, 파생(derived), 자손
	
	자식 클래스의 멤버 개수는 부모 클래스와 같거나 많다
	
	class 클래스이름 extends 부모클래스
	
	예)
		class Parent{
		
		}
		class Child extends Parent{
		
		}
*/
class Parent{
	protected String name;
	protected int age;
	protected int money = 1000000000;
}
class Son extends Parent{
	Son(){
		this.name = "자크";
		this.age = 35;
	}
	public void printInfo() {
		System.out.println("나는 : " + this.name);
		System.out.println("나이는 : " + this.age);
		System.out.println("물려받은 유산은 : " + this.money);
	}
}

class Daugther extends Parent{
	Daugther(){
		this.name = "럭스";
		this.age = 23;
	}
	
	public void showInfo() {
		System.out.println("나는 : " + this.name);
		System.out.println("나이는 : " + age);
	}
}
	/*
	 	같은 내용의 코드를 하나 이상의 클래스에 중복적으로 추가해야 하는 경우에는 상속관계를 이용해서
	 	코드의 중복을 최소화 해야 함
	 	공통적으로 추가해야 하는 멤버는 부모에 추가
	 */

class GrandChild extends Son{
	GrandChild(){
		this.name = "김자크손자";
		this.age = 2;
	}
	public void showInfo() {
		System.out.println("나는 : " + this.name);
		System.out.println("나이는 : " + age);
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		/*
		 	자식 클래스의 인스턴스를 생성하면 부모클래스의 멤버와 자식클래스의 멤버가 합쳐진
		 	하나의 인스턴스로 생섬되
		*/
		
		Son son = new Son();
		son.printInfo();
		
		System.out.println("\n=========================\n");
		
		Daugther daugther = new Daugther();
		daugther.showInfo();

		System.out.println("\n=========================\n");
		
		GrandChild gc = new GrandChild();
		gc.printInfo();
	}

}
