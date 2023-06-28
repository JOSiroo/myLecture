package com.day8;

import java.util.Scanner;

public class ScopeTest {
	public static int getSum(int count) {
		int sum = 0;
		for(int i = 1; i <= count; i++) {
			sum += i;
		}
		return sum;
	}
	
	/*
		지역변수
		- 메서드나 {}블럭안에서 선언된 변수
		- 해당 메서드를 벗어나면(종료되면) 소멸 (매개변수도 마찬가지)
		- 블럭변수 : 해당 블럭을 벗어나면 소멸
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = getSum(num);
		
		System.out.println("1에서 부터 " + num + "까지의 합 : " + result);
	}

}
