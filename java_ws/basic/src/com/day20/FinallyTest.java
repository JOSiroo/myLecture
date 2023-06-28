package com.day20;

import java.util.Scanner;

public class FinallyTest {

	public static void main(String[] args) {
		/*
		 	finally절
		 			- 예외발생여부와 상관없이 반드시 실행되어야 하는 구문을 입력하는 곳
		 			- 예외가 발생해도 호출되며, 그렇지 않아도 호출됨
		 			- 주로 사용했던 자원을 해제하는 용도로 사용됨
		*/
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("두 정수 입력!");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int result = n1/n2;
			System.out.println("나누기 결과 " + result);
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}finally {
			System.out.println("반드시 실행되어야 함!!");
		}
		
		System.out.println("\n==========next============");
		
		
	}

}
