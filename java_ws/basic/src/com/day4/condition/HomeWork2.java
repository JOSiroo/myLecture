package com.day4.condition;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int input = sc.nextInt();
		String result = "";
		
		if(input > 0) {
			result = "양수입니다";
		}else if(input < 0) {
			result = "음수입니다";
		}else {
			result = "0입니다";
		}
		
		System.out.println(result);

	}

}
