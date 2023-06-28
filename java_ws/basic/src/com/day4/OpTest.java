package com.day4;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		int a = 10;
		String c = ((a > 0) ? " 양수입니다" : " 음수입니다");
		System.out.println("a = " + a + c);
		
		a = 17;
		String b = ((a % 2) == 0) ? "짝수" : "홀수";
		System.out.println(b);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		String result = ((num % 2) == 0) ? "짝수" : "홀수";
		System.out.println("num = " + num +" => "+ result);

	}

}
