package com.day9;

import java.util.Scanner;

public class MethodTest8_Test {

	public static double awards(int qty, int income) {
		double sum = 0;
		if(qty >= 200) {
			sum = income/0.3F;
		}else if(qty >= 100) {
			sum = income*0.2F;
		}else {
			sum = income/0.1F;
		}
				
		return sum;
	}
	
	public static boolean reader(String input) {
		//char reader = (char)String.charAt();
		boolean reader = true;
		for(int i = 0; i < input.length(); i++) {
			int a = input.charAt(i);	
			if(!(a >= '0' && a <= '9')) {	
				reader = false;
				break;
			}
		
		}
		return reader;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("판매수량, 판매금액을 입력하세요");
		int qty 	= sc.nextInt();
		int income	= sc.nextInt();
		
		double awards = awards(qty, income);
		System.out.println("성과급 : " + awards);
		
		sc.nextLine();
		
		System.out.println("판별하기\n값을 입력하세요");
		String str = sc.nextLine();
		boolean bool = reader(str);
		if(bool) {
			System.out.println(str + "는 숫자입니다.");
		}else {
			System.out.println(str + "는 숫자가 아닙니다.");
		}
		
	}
}




















