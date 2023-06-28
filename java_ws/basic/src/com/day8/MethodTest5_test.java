package com.day8;

import java.util.Scanner;

public class MethodTest5_test {

	public static float cmToInch(float num1) {
		float result = num1 / 2.54f;

		return result;
	}
	public static float inchToCm(float num2) {
		float result = num2 * 2.54f;
		
		return result;
	}
	
	public static double triangle(int bot, int h) {
		double result = (bot*h)/2;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("변환하려는 cm를 입력하세요");
		float num1 = sc.nextFloat();
		double inch = cmToInch(num1);
		System.out.println(inch);
		
		System.out.println("변환하려는 inch를 입력하세요");
		float num2 = sc.nextFloat();
		float cm = inchToCm(num2);
		System.out.println(cm);
		
		System.out.println("삼각형의 밑변의 길이, 높이를 입력하세요");
		int bot = sc.nextInt();
		int high = sc.nextInt();
		
		double result = triangle(bot, high);
		System.out.println("삼각형의 면적 : " + result);
		
		
		

	}

}
