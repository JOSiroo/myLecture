package com.day4;

public class ThreeOp {

	public static void main(String[] args) {
		/*
		 	삼항 연산자(조건 연산자) - ?:
		 	변수 선언 = (조건식) ? 값1 : 값2;
		 	=> 조건식의 결과가 true이면 값1을 처리하고
		 				    false이면 값2를 처리한다(변수에 대입한다)
		 				    
		 	변수의 값1, 값2는 자료형이 같아야 함
			
			조건식 : 결과가 true, false여야 함 => 논리연산자, 비교 연산자를 사용
		*/
		
		//두 수중 더 큰 수 구하기
		int a = 10, b = 20;
		int c = (a > b) ? a : b;
		System.out.println("a = " + a + ", b = " + b + ", 더 큰수 : " + c);
		
		int d = 50;
		System.out.println("d가 30과 같은지 : " + (d == 30 ? "같다" : "다르다"));
		
		int gender = 1;
		String str = (gender != 1) ? "여자" : "남자";
		System.out.println(str);
		
		

	}

}
