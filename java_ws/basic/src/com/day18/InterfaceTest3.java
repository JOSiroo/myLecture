package com.day18;
/*
 간접적인 관계의 두 클래스(A-I-B)
 	- 클래스 A는 여전히 클래스 B의 메서드를 호출하지만, 클래스 A는 인터페이스 I하고만
 		직접적인 관계에 있기 때문에 클래스 B의 변경에 영향을 받지 않음
 */
interface I{
	void method();
}
class AA{
	public void methodA(I i) {
		i.method();
	}
}

class BB implements I{
	public void method() {
		System.out.println("BB - method()메서드");
	}
}
class CC implements I{
	public void method() {
		System.out.println("CC - method()메서드");
	}
}
public class InterfaceTest3 {

	public static void main(String[] args) {
		AA a = new AA();
		//methodA() //호출
		a.methodA(new BB());
		a.methodA(new CC());
	}

}
