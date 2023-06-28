package com.day7;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 	do while문
		 	- 선실행 후 조건처리
		 	- 조건보다 명령이 먼저 온다
		 	- 조건이 거짓이더라도 실행구문을 최소한 한번은 수행
		 	
		 	do{
		 		반복명령;
		 	}while(조건식);
		 	
		*/
		
		int k = 1;
		do {
			System.out.println("k = " + k);//조건이 거짓이어도 한번은 수행
			
			k++;
		}while(k > 3);

		System.out.println("\n=================");
		
		k = 0;
		do {
			System.out.println("k = " + k);
			k++;
		}while(k < 3);
		
		//무한루프를 대신하는 효과가 있다
		Scanner sc = new Scanner(System.in);
		int sum = 0, num = 0;
		
		do {
			System.out.println("숫자 입력");
			num = sc.nextInt();
			
			sum += num;
		}while(num != 0);
		
		System.out.println("\n입력된 숫자의 합 : " + sum);
		
		
		
	}

}
