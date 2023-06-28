package com.day24;

public class InnerTest5 {
	class InstanceInner{}
	static class StaticInner{}
	
	public static void staticMethod() {
		//static에서는 static만 접근 가능하므로 인스턴스 클래스 객체 생성 불가
		//InstanceInner obj = new InstanceInner();	//error
	
		StaticInner obj = new StaticInner();	//가능
	}
	
	public void instanceMethod() {
		//인스턴스 메서드에서는 인스턴스 클래스, static클래스 모두 접근 가능
		InstanceInner obj = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	public static void main(String[] args) {

	}

}
