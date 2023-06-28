package com.day4.condition;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int input = sc.nextInt();
		String result = "";
		
		if(input % 2 == 0) {
			result = "짝수입니다";
		}else {
			result = "홀수입니다";
		}
		System.out.println(result);

	}

}
