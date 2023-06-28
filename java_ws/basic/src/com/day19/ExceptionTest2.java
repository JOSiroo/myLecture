package com.day19;

import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		
		
		// 1. 사용자로부터 주민번호를 입력 받아서, 13자리가 아니면 throw문을 이용하여 예외처리 되도록 한다.
		try {
			String idNo = sc.nextLine();
			if(idNo.length() != 13) {
				throw new Exception("주민번호를 잘못 입력했습니다. 13자리를 입력하세요");
			}
			System.out.println("주민번호 : " + idNo);
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		try {
			System.out.println("숫자를 두개 입력하세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			if(num2 == 0) {
				throw new Exception("제수가 0이 되면 안됩니다!!!!!!!!!!!");
			}
			int result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
		}catch(Exception e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		
	}

}
