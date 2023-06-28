package com.day15;

/*
 	final 
 		1)	변수에 사용되면 값을 변경할 수 없는 상수가 됨
 		2)	메서드에 사용되면 오버라이딩을 할 수 없게 됨
 		3)	클래스에 사용되면 자식 클래스를 정의하지 못하게 됨

	지역변수에도 사용 가능
*/

final class Parent1{
	
}
	/*
class Child extends Parent1{	//error :The type Child cannot subclass the final class Parent

}
	 */
class Parent2{
	public void func() {
		System.out.println("Parent1 메서드");
	}
	public final void finalFunc() {
		System.out.println("final 메서드");
	}
}

class Child1 extends Parent2{
	public void func() {
		System.out.println("오버라이딩 메서드");
	}
	/*
	public final void finalFunc() {		//error : Cannot override the final method from Parent1
	
	}
	*/
}

class MyFinal{
	final public static double PI = 3.14;
	public final int DELIVERY = 3000;
	int age = 10;
}

public class FinalTest {

	public static void main(String[] args) {
		MyFinal obj = new MyFinal();
		
		obj.age = 20;	//변수는 값 변경 가능
		System.out.println("age = " + obj.age);
		
		//MyFinal.PI = 3.141592;	//error : The final field MyFinal.PI cannot be assigned
		// = > 상수는 값 변경 불가
		//상수 - 한번 초기화되면 더 이상 값을 변경할 수 없는 멤버
		System.out.println("PI = " + MyFinal.PI);
		System.out.println("배송비 : " + obj.DELIVERY);
	
		int num = 30;
		final double INTEREST_RATE = 0.03;
		
		num = 25;
		//INTEREST_RATE = 0.04;	// error : The final local variable INTEREST_RATE cannot be assigned. It must be blank and not using a compound assignment
	
		System.out.println("num = " + num);
		System.out.println("이자율 = " + INTEREST_RATE);
	}

}
