package com.day5;

import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력 하세요 : 1(남자), 2(여자)");
		int gender = sc.nextInt();
		String result = "";
		
		if(gender == 1) {
			result = "남자";
		}else if(gender == 2) {
			result = "여자";
		}else {
			result = "잘못 입력하셨습니다";
		}
		
		System.out.println("성별은 : " + result);

	}

}
