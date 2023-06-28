package com.day5;

import java.util.Scanner;

public class OverlapIf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		String result = "";
		if(age >= 20) {
			System.out.println("취미를 입력하세요\n1영화, 2축구, 3야구, 4등산");
			int hobby = sc.nextInt();	
			if(hobby == 1) {
				result = "영화를 선택하였습니다.";
			}else if(hobby == 2) {
				result = "축구를 선택하였습니다.";
			}else if(hobby == 3) {
				result = "야구를 선택하였습니다.";
			}else if(hobby == 4) {
				result = "등산를 선택하였습니다.";
			}else {
				System.out.println("취미를 잘못 입력하였습니다.");
			}
		}else {
			System.out.println("20세 이상만 본 설문에 응할 수 있습니다.");
		}
		
		System.out.println(result);

	}

}
