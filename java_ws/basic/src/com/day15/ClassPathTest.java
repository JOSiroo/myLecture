package com.day15;

class AAA{
	public void showName() {
		System.out.println("AAA");
	}
}
class BBB{
	public void showName() {
		System.out.println("BBB");
	}
}
public class ClassPathTest {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.showName();
		
		BBB b = new BBB();
		b.showName();
	}

}
