package com.day19;

import java.util.Scanner;

public class TryTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int result = n1/n2;
		
		System.out.println("나눗셈 결과 : " + result);
		System.out.println("\n===============다음 문장!=================");
	}

}
