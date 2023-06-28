package com.day5;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜(일)를 입력하세요 < 1 ~ 31 >");
		int date = sc.nextInt();
		String result = "";
		
		if(date >= 1 && date <= 10) {
			result = "초순";
		}else if(date >= 11 && date <= 20) {
			result = "중순";
		}else if(date >= 21 && date <= 31) {
			result = "하순";
		}else {
			result = "잘못 입력하였습니다";
		}
		
		System.out.println(date + " 일 : " + result);
		
	}

}
