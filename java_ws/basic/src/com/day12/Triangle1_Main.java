package com.day12;

import java.util.Scanner;

public class Triangle1_Main {

	public static void main(String[] args) {
		//삼각형 면적 구하기
		//[1] main에서 직접 면적 구한다
		
		//사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("삼각형의 밑변, 높이 입력!");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		//로직 처리 - 삼각형 면적 구하기
		int area = w*h;
		
		//결과 출력
		System.out.println("삼각형의 면적 : " + area);
	
	}

}
