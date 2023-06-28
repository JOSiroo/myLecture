package com.day12;

class AAA{
	private int x = 10;
	int y = 20;
	protected int z = 30;
	public int w = 40;
	
	public void showInfo() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		System.out.println("w = " + w + "\n");
	}
}
public class PrivateTest {

	/*
	 	접근 제한자(접근 제어자)
	 		- 멤버나 클래스에 사용되어, 해당하는 멤버나 클래스를 
	 		  외부에서 접근하지 못하도록 제한하는 역할
	 		- 클래스 내부의 멤버를 노출하거나 숨길 때 사용
	 		
	 	접근 제한자가 사용될 수 있는 곳 - 클래스, 생성자, 멤버변수, 메서드
	 	1) private			- 같은 클래스 내에서만 접근 가능
	 	2) default(생략형)	- 같은 패키지 안에 있는 클래스들끼리만 접근 가능
	 	3)protected			- 같은 패키지는 물론 다른 패키지일지라도 상속고나계가 있으면 접근 가능
	 	4)public			- 어디서나 접근 가능
	 	private < default < protected < public
	 	
	 	클래스, 생성자		- public, default만 사용가능
	 	멤버변수, 메서드 	- public, protected, default, private
		지역변수			- 사용불가
	*/
	
	
	
	public static void main(String[] args) {
		AAA obj = new AAA();
		
		obj.showInfo();
		//System.out.println(obj.x); // error private
		System.out.println("default y = " + obj.y);
		System.out.println("protected z = " + obj.z);
		System.out.println("public w = " + obj.w);
	}

}
