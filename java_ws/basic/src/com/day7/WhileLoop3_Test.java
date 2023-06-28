package com.day7;

import java.util.Scanner;

public class WhileLoop3_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int sum1 = 0;
		while(true) {
			System.out.println("두 개의 정수를 입력하세요 < 피제수 제수 순으로 입력>");
			int num1 = sc.nextInt();
			int num2= sc.nextInt();
			
			if(num1 == 0 && num2 == 0) {
				System.out.println("입력종료");
				break;
			}
			if(num2 == 0) {
				System.out.println("제수에 0을 입력하셨습니다");
				continue;
			}
			sum = num1/num2;
			sum1 = num1%num2;
			System.out.println("몫 : " + sum + ", 나머지 : " + sum1);
			
			
			
		}

	}

}
