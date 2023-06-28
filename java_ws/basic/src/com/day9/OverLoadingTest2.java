package com.day9;

import java.util.Scanner;

public class OverLoadingTest2 {
	
	
	//원의 면적 메소드
	public static double area(double rad) {
		double area = rad * rad * 3.14;
		return area;
	}
	
	//사각형의 면적 메소드
	public static int area(int h, int w) {
		int area = h*w;
		return area;
	}
	
	public static void main(String[] args) {
		System.out.println("가로, 세로, 반지름을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		System.out.println("가로");
		int h = sc.nextInt();
		System.out.println("세로");
		int w = sc.nextInt();
		System.out.println("반지름");
		double rad = sc.nextDouble();
		
		int squareArea = area(h, w);
		double roundArea = area(rad);
		System.out.println("사각형의 면적 : " + squareArea);
		System.out.println("원의 면적 : " + roundArea);
		
	}

}
