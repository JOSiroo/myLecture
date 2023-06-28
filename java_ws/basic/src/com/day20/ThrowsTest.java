package com.day20;

public class ThrowsTest {

	public static void main(String[] args) {
		/*
		 	예외 클래스의 계층 구조
		 		Trowable - Exception - RuntimeException
		 				 			 - 그 외의 Exception들
		 				 - Error

		 	1) RuntimeException과 그 자식 클래스들
		 		- 개발자의 실수에 의해서 발생할 수 있는 예외들
		 		- 예외처리 해주지 않아도 됨
		 	2) Exception 클래스와 그 자식 클래스들
		 		- 반드시 예외처리해주어야 함. 그렇지 않으면 컴파일 에러 발생

		 	※메서드에 예외 처리하는 방법
		 		[1] try ~ catch문 사용
		 		[2] throws를 사용한 예외 떠넘기기(예외 전달, 예외를 메서드에 선언)
		 			void method() throws Exception1, Exception2{
					}
				=> 메서드를 작성할 때 메서드내에서 발생할 가능성이 있는 예외를 메서드 선언부에 명시하여
					이 메서드를 사용하는 쪽에서 이에 대한 처리를 하도록 강요함
		 */

		try {
			method1();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n=========next===========");
		
	}

	public static void method1() throws Exception{	// 예외 전달
		method2();
	}
	public static void method2() throws Exception {	// 예외 떠넘기기
		throw new Exception("예외가 발생했다");
	}

}
