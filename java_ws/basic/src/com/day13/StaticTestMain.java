package com.day13;

public class StaticTestMain {
	private int num1 = 10; //인스턴스 변수
	private static int num2 = 20; //static 변수
	
	public int add() {	//intstance메서드 - static 변수에도 접근 가능
		return num1+num2;
	}
	
	public static int multiply(int a, int b) {
		//return c = num1 * num2; //static메서드 - instance메서드 접근 불가
		// error : Cannot make a static reference to the non-static field num1
		int c = a*b;
		return c;
	}
	public static void main(String[] args) {
		int result = multiply(10,  5); //같은 클래스이므로 클래스명 생략하고 메서드()만으로 호출
		System.out.println("두 수의 곱 : " + result);
		
		//result = add(); //error 
		//static 메서드는 static만 접근 가능
		//접근 하려면 객체 생성 후 접근해야 함
		StaticTestMain obj = new StaticTestMain();
		result = obj.add();
		System.out.println("두 수의 합 : " + result);
		
	}

}
