package com.day5;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술연산자 입력 : +, -, *, /");
		String op = sc.nextLine();
		
		String result = "";
		switch(op) {
			case "+":
				result = "더하기";
				break;
			case "-":
				result = "빼기";
				break;
			case "*":
				result = "곱하기";
				break;
			case "/":
				result = "나누기";
				break;
			default :
				result = "잘못입력";
		}
		System.out.println(op + " => " + result);

	}

}
