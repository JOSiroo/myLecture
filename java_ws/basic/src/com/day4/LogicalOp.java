package com.day4;

public class LogicalOp {

	public static void main(String[] args) {
		/*
		 	논리 연산자 : &&, ||
		 	[1] && : and, 그리고, 피연산자를 동시에 만족할 때 true
		 			x && y : x, y가 모두 true일 때만 결과가 true
		 			
		 	[2] || : or, 또는, 피연산자 중 하나라도 만족하면 true
		 			x || y : x나 y 중 하나라도 true면 결과도 true
		 			
			논리 연산자의 피연산자는 true, false여야 함, 즉 비교연산자인 경우가 많다.
			논리연산자의 결과는 true, false
			
			=> 비교연산자나 논리 연산자의 결과는 true, false => 조건식에 사용됨
		*/
		
		int x = 10, y = -20;
		boolean bool = x > 0; //true
		boolean bool2 = y > 0; //false
		boolean bool3 = x > 0 && y > 0; //
		
		System.out.println("x > 0 : " + bool + ", y > 0 : " + bool2);
		System.out.println("&& 결과 : " + bool3); // false
		System.out.println("|| 결과 : " + (x > 0 || y > 0)); //true
		System.out.println("!(x > 0) : " + !(x > 0)); // false
		
	}

}
