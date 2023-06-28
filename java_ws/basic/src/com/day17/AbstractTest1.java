package com.day17;

/*
 	1. 추상 메서드
 		- 몸체 없는 메서드, 미완성 메서드
 		- 메서드의 구현부가 없다는 것
 		- 메서드 블럭{}을 포함하고 있지 않고, 프로토타입만 존재하는 메서드
 		- 메서드의 내용이 상속받은 클래스에 따라 달라질 수 있기 때문에 부모 클래스에서는 선언부만을 작성하고
 			실제 내용은 상속받는 클래스에서 구현하도록 함
 		
 	예) public abstract int func(int a);

	2. 추상 클래스 
		- 미완성 클래스, 부분적으로만 완성된 클래스
		- 미완성 메서드를 포함하고 있다는 의미
		- 객체 생성 불가
		- 상속을 통해서 자식 클래스에 의해서만 완성될 수 있다
		
	추상 클래스가 되는 방법
	1) 추상 메서드를 하나라도 포함하고 있는 클래스
	2) 추상메서드를 포함하고 있지 않더라도 클래스 선언시 abstact키워드를 포함하고 있을경우
	
	예) abstract class AAA{
		public abstract void method();
	}
	
	abstract class BBB{
		public void method(){}
	}
	
	추상 클래스를 상속한 후 모든 추상 메서드를 구현했을 때 객체를 생성할 수 있다.
*/

/*
 	추상 클래스
 		- 상속의 관계를 형성하기 위한 상위 클래스로
 			인스턴스화시키기 위해서 정의한 클래스가 아닌 경우 추상 클래스로 만든다
 			
 	추상 메서드
 		- 오버라이딩의 관계를 형성하기 위해 정의된 메서드, 비어있는 메서드는 추상 메서드로 만든다
*/

abstract class Animal{
	public abstract void sound();
}


class Dog extends Animal{
	public void sound(){
		System.out.println("멍멍!");
	}
}
class Cow extends Animal{
	public void sound(){
		System.out.println("음메~");
	}
}
/*
	자식클래스에서 추상메서드를 모두 구현해 주지 않으면
	자식클래스도 추상메서드를 포함하게 되므로 추상클래스가 됨
*/


abstract class Mammal extends Animal{	//포유류
	public void breed(int n) {
		System.out.println(n + "마리 새끼를 낳는다");
	}
}

class Cat extends Mammal{
	public void sound() {
		System.out.println("야옹");
	}
}
public class AbstractTest1 {

	public static void main(String[] args) {
			//Animal an = new Animal();	//error : 추상클래스는 객체 생성불가
			Animal an = new Dog();
			an.sound();
			
			an = new Cow();
			an.sound(); 
			
			//Animal ani = new Mammal();	//error : 추상 클래스
			an = new Cat();
			an.sound();
			
			Mammal m = new Cat();	//다형성
			m.breed(5);
			m.sound();
	}
}













