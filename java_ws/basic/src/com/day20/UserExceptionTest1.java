package com.day20;

import java.util.Scanner;

//public Exception(String message)
class AgeInputException2 extends Exception{
	private final int errorCode = 100;
	
	AgeInputException2(String msg){
		super(msg);
		
	}
	public int getErrorCode() {
		return errorCode;
	}
}

public class UserExceptionTest1 {
	public static int inputAge() throws AgeInputException2 {//★★★★
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력!");
		int age = sc.nextInt();
		
		if(age < 0 || age > 150) {
			throw new AgeInputException2("유효하지 않은 나이를 입력했습니다");
		}
		
		return age;
	}
	public static void main(String[] args) {
		try {
			int age = inputAge();
			
			System.out.println("나이 : " + age);
		}catch(AgeInputException2 e){
			System.out.println(e.getMessage());
			System.out.println("에러 코드 : " + e.getErrorCode());
		}
		
		System.out.println("\n=========next!================");
	}

}
