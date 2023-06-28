package com.day20;

import java.util.Scanner;

//public Exception(String message)
class AgeInputException extends Exception{
	AgeInputException(){
		super("유효하지 않은 나이가 입력되었습니다.");
		
	}
}
public class UserExceptionTest2 {
	
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("나이 입력");
			int age = sc.nextInt();
			if(age < 0 || age > 150) {
				throw new AgeInputException();
			}
			System.out.println("나이 : " + age);
		}catch(AgeInputException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n=========next!================");
	}

}
