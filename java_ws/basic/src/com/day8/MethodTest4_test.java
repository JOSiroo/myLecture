package com.day8;

import java.util.Scanner;

public class MethodTest4_test {

	//1. 두 수 중 더 큰 수를 구하는 메서드
	public static int moreNum(int num1, int num2) {
		int sum = 0;
		if(num1 > num2) {
			sum = num1;
		}else {
			sum = num2;
		}return sum;
	}
	
	//2. 두 정수의 나머지를 구하는 메서드
	public static int remainder(int a, int b) {
		int sum = a%b;
		
		return sum;
	}
	public static void main(String[] args) {		
		System.out.println("=======더 큰 수 메서드========");
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int moreNum = moreNum(num1, num2);
		
		System.out.println("더 큰수 : " + moreNum);

		System.out.println("=======나머지 메서드========");
		
		while(true) {
			System.out.println("두 수를 입력하세요.");
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			if(num3 == 0 || num4 == 0) break;
			
			int result = remainder(num3, num4);
			System.out.println("나머지 연산 결과 : " + num3 + " % " + num4 + " = " + result);
		}
		
		
		
	}

}












