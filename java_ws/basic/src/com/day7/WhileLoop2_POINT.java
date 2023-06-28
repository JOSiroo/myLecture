package com.day7;

import java.util.Scanner;

public class WhileLoop2_POINT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String result = "";
		String result1 = "";
		
		while(true) {
			System.out.println("년도를 입력하세요");
			System.out.println("그만하려면 Q");
			String num1 = sc.nextLine();
			if(num1.equalsIgnoreCase("Q")) break;	
			int num = Integer.parseInt(num1);
			
			if ((num % 400 == 0) || (num%4 == 0 && num%100 != 0)){
				result1 = "윤년";
			}else {
					result1 = "평년";
			}
			
			if(num % 2 == 0) {
				result = "짝수 해";
			}else {
				result = "홀수 해";		
			}
			System.out.println(num + "년 : " + result1 + ", " + result);
		}
		sc.close();
	}
}
