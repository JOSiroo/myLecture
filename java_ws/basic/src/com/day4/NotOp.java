package com.day4;

public class NotOp {

	public static void main(String[] args) {
		/*
			단항 연산자 - 논리 부정 연산자 !
						true는 false로 false는 true로 변경
		*/
		boolean power = false;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		System.out.println(!power);
		
		int a = 3, b = 5;
		boolean bool = a > b; //
		System.out.println("a > b : " + bool);
		
		bool = !(a > b);
		System.out.println("!(a > b) : " + bool);
		
	}

}
