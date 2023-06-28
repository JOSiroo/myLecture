package com.day19;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// 1. 두 실수의 합을 구하는 메서드 만들기
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 실수를 입력하세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int result = num1*num2;
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		// 2. 두 수의 나머지를 구하는 메서드 만들기
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 실수를 입력하세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num2 == 0) {
				throw new Exception("나누는 수가 0이면 안됨");
			}
			int result = num1%num2;
		}catch(Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
	}

}
