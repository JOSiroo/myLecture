package com.day15;
/*
	1) super.멤버	- 부모의 멤버를 참조하는 super
					 부모의 멤버와 자신의 멤버를 구별하는데 사용된다
					 this나 super는 static메서드에서는 사용불가!
					  
	2) super()		- 부모의 생성자를 호출하는 super()
					
	
*/

class Parent{
	protected int x = 10;
}
class Child extends Parent{
	private int x = 20;
	
	public void showInfo() {
		System.out.println("x = " + x);	//20
		System.out.println("this.x = " + this.x); //20
		System.out.println("super.x" + super.x);	//10, 부모의 멤버인 x 참조
	}
}
public class SuperTest {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
				
	}

}
