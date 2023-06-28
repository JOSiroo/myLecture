package com.day19;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		/*
		 	throw
		 		- 개발자가 고의로 예외를 직접 발생시킬 수 있다
		 		throw new Exception("에러 메세지");
		 		
		 		- 자바 가상머신에 의해 인식될 수 있는 예외상황이 아니지만, 개발자가 정의한 예외상황인 경우
		*/
	
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력!");
			int age= sc.nextInt();
			
			//public Exception(String message)
			if(age < 0 || age > 150) {
				throw new Exception("나이는 0 ~ 150 사이의 값만 가능합니다");
			}
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		System.out.println("\n===========next!!=====================");
	}

}
