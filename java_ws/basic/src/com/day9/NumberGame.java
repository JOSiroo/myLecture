package com.day9;

import java.util.Scanner;

public class NumberGame {

	public static int randomVal() {
		int randomVal = (int)(Math.random() * 100 + 1);
		return randomVal;
	}
	
	//특정 숫자 사이의 임의의 값을 구하는 메서드
	public static int randomVal2(int minVal, int maxVal) {
		int randomVal2 = (int)(Math.random() * (maxVal - minVal + 1) + minVal);
														
		return randomVal2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 	1~100 사이의 임의의 값을 구한다 - 정답
		//int answer = (int)(Math.random() * 100 + 1);
		int randomVal = randomVal();
		System.out.println("내가 만든 메소드 = " + randomVal);
		
		int minVal = sc.nextInt();
		int maxVal = sc.nextInt();
		int randomVal2 = randomVal2(minVal, maxVal);
		
		int myNum = sc.nextInt();
		String result = "";
		if(randomVal2 == myNum) {
			result = "정답";
			System.out.println(result + " 숫자 : " + randomVal2);
		}else {
			result = "아닙니다";
		}
		//System.out.println("특정 숫자 사이의 임의의 값" + randomVal2);
			/*
					//2. 	4번 반복처리
					for(int i = 1; i <= 4; i++) {
					//2-1	사용자로부터 숫자 입력받기
						System.out.println("숫자를 입력하세요");
						int num = sc.nextInt();
					//2-2	정답과 사용자값 비교
						String result = "";
						if(num == answer) {
							System.out.println("대박사건!! 정답입니다");
							break;
						}
						if(i == 4) {
							System.out.println("아깝습니다 정답은 : " + answer);
						}else if (i < 3) {
							if(num > answer) {
								result = "너무 큽니다, 조금 더 작은 수를 입력하세요";
							}else {
								result = "더 큰수를 입력하세요";
							}
						}
						//2-3	결과 출력
						System.out.println(result);
			
					}
			*/
	
	
	}

}
