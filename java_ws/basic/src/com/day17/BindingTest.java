package com.day17;

class Parent{
	int x = 100;
	
	public void method() {
		System.out.println("Parent 메서드");
	}
}

class Child extends Parent{
	int x = 200;
	
	public void method() {
		System.out.println("Child 메서드 - 오버라이딩");
	}
}
public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child();	//다형성
		p.method();	//자식의 오버라이딩 메서드 호출
		System.out.println("p.x = " + p.x);
		//=> 부모 참조변수로는 부모의 멤버만 접근 가능
		
		
		
		//생성자에서 this() => 다른 생성자의 거시기 가져오는거자나
	}

}
