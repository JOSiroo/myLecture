package com.day19;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		/*
		 	예외(Exception)
		 		- 프로그램의 실행도중에 발생하는 예상치 못한 오류
		 		- 처리되지 않은 예외는 프로그램의 실행을 중단시키는 원인

		 	에러
		 	1) 컴파일 에러
		 	2) 실행에러
		 		- 에러(Error) : 메모리부족, 스택오버플로우 같이 일단 발생하면 복구할 수 없는 심각한 오류
		 		- 예외(Exception) : 발생하더라도 수습될 수 있는 비교적 덜 심각한 오류
		 							프로그램의 비정상적인 종료를 막을 수 있다

		 	예외 처리 - 예외의 발생에 대비한 코드를 작성하여, 에러에 의해서 비정상적으로 프로그램이 종료되는것을 막는다

			형식
			try{
				//예외가 발생할만한 코드를 배치
			}catch(Exception e){
				//예외를 잡아 실패에 대한 처리를 하는 코드
			}

			=> try절에서 예외가 발생하면 catch절이 실행됨
				예외가 발생하지 않으면 catch 다음문장이 실행됨
		 */
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("두 정수 입력");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();

			int result = n1/n2;

			System.out.println("나눗셈 결과 : " + result);
		}catch(Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		System.out.println("\n===============다음 문장!=================");
	}

}
