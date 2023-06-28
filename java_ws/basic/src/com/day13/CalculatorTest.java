package com.day13;

/*
 	static메서드
 		- 생성된 객체가 전혀 없어도 호출 가능
 		  클래스로부터 호출 해야함
 		  클래스명.static메서드()
 		  
 	static 메서드는 static 데이터만 접근 가능. 인스턴스 변수에 접근 불가
*/

class Calculator{
	//static 메서드
	public static int add(int a, int b) {
		return a + b;
	}
	
	//instance 메서드
	public int minus(int a, int b) {
		return a - b;
	}
	
}


public class CalculatorTest {

	public static void main(String[] args) {
		//static 메서드 호출
		int result = Calculator.add(10,30);
		System.out.println("두 수의 합 : " + result);
		
		int n = Integer.parseInt("123"); //static => 객체 생성할 필요 x
		
		//instance메서드 호출 => 객체 생성 후 참조변수, 메서드()
		Calculator cal = new Calculator();
		result = cal.minus(50, 20);
		System.out.println("두 수의 차 : " + result);
		
		//Scanner sc = new Scanner(System.in); //객체 생성
		//int k = sc.nextInt();	 //메서드 호출
		
	}

}
