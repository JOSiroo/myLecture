package com.day5;

import java.util.Scanner;

public class IfTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성별을 입력 하세요 : 1,3(남자), 2,4(여자)");
		int gender = sc.nextInt();
		String result = "";		
		
		
		
		if(gender == 1 || gender == 3) {
			if(gender == 3) {
				result = "어린놈의 남자쉐끼입니다";
			}else {
				result = "어엿한 사내놈이군요";
			}
		}else if(gender == 2 || gender == 4) {
			if(gender == 4) {
				result = "어린 숙녀분이시군요";
			}else {
				result = "여성분이시군요..";
			}
		}else {
			result = "누구세요?";
		}
		
		System.out.println("성별은 " + result);
		
	}

}
