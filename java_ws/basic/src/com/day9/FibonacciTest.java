package com.day9;

import java.util.Scanner;

public class FibonacciTest {

	
	public static int fib(int num) {
		int result = 0;
		if(num == 0 || num == 1) {
			result = num;
		}else {
			result = fib(num - 2) + fib(num - 1);
			
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복해서 피보나치 수열을 출력할 값을 입력하세요");
		int fibNum = sc.nextInt();
		
		int sum = 0;
		String str = "";
		for(int i = 0; i <= fibNum; i++) {
			sum = fib(i);
			if(i == fibNum) {
				str = "";				
			}else {
				str = ", ";
			}
			System.out.print(sum + str);
		}
		
		
		
		
		
		
	}

}
