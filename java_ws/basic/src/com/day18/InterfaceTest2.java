package com.day18;
/*
 직접적인 관계의 두 클래스(A-B)
 	- 직접적인 관계의 두 클래스는 한쪽(Provider)이 변경괴면, 이를 사용하는
 	  다른 한 쪽(User)도 변경되어야 함
 */
class A{
//	public void methodA(B b) {
	//	b.methodB();
	//}
	public void methodA(C c) {
		c.methodC();
	}
}

class B{
	public void methodB() {
		System.out.println("B - methodB()메서드");
	}
}

class C{
	public void methodC() {
		System.out.println("C - methodC()메서드");
	}
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		A a = new A();
		//methodA() //호출
		a.methodA(new C());
	}

}
