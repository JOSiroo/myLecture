package com.day4.condition;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		/*
		 제어문 - 프로그래밍의 실행순서나 흐름을 제어할 때 사용
		 [1] 조건문
		 		조건의 진위 여부에 따라 명령의 실행 여부를 결정하는 문장
		 		if문, switch문
		 [2] 반복문
		 		for, while, do~while
		*/
		/*
		 if문
		 
		 if(조건식){
		 	문장;
		 }
		 => 조건을 만족하면 문장을 실행하고, 만족하지 않으면 수행을 한번도 하지 않고
		 	다음줄로 넘어간다.
		 	
		 	조건식 : 결과가 true나 false
		 	1) 비교연산자 이용
		 		예) 변수 > 값
		 	2) 논리연산자 이용
		 		예) 변수 > 값 && 변수 < 값
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		} 
		System.out.println("====다음 문장====");
		
		/*
		 if(조건식) {
		 	문장1;
		 }else{
		 	문장2;
		 }
		 
		 => 조건을 만족하면 문장1을 수행하고
		 	만족하지 않으면 문장2를 수행한다
		*/
		
		if(num > 0) {
				System.out.println("양수!");
		}else {
			System.out.println("음수");
		}
		System.out.println("====next====");
		
		/*
		 	if(조건식1){
		 		문장1;
		 	}else if(조건식2) {
		 		문장2;
		 	}else{
		 		문장3;
		 	}
		 	=> 조건식1을 만족하면 문장1을 수행하고
		 		그렇지 않고 조건식2를 만족하면 문장2를 수행하고
		 		그렇지 않으면 문장3을 수행하다.
		*/
		
		
		String result; // 지역변수 초기화
		if(num > 0) {
			result = "양수";
		}else if(num == 0) {
			result = "0";
		}else {
			result = "음수";
		}
		System.out.println(result);
		System.out.println("====next====");
		
		
		
	}

}

















