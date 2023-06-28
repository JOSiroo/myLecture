package com.day5;

import java.util.Scanner;

public class SwitchTest5 {

	public static void main(String[] args) {
		/*
		 case문의 break를 생략하면 or 처리 가능
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("성별 입력 M/F");
		String gender = sc.nextLine();
		String result = "";
		
		switch(gender) {
		case "M" :
		case "m" :
			result = "남자";
			break;
		case "F" : case "f" :
			result = "여자";
			break;
			default :
				result = "잘못 입력";
		}
		
		System.out.println(gender + " => " + result);
	}

}
