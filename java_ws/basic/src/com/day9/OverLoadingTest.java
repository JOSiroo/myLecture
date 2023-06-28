package com.day9;

import java.util.Scanner;

public class OverLoadingTest {
	/*
		 	오버로딩 메서드
		 	-	하나의 클래스 내에서 메서드의 이름은 같으나, 매개변수의 개수나 자료형이 다른 메서드를 
		 	  	오버로딩 메서드라고 함
		 	-	리턴 타입으로는 구별하지 않음
	*/
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static double add(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public static String add(String a, String b) {
		String c = a + b;
		return c;
	}
	
	/*
	public static String add(int a, int b) { //첫번째랑 똑같은 매개변수 개수,타입
		String str = Integer.toString(a + b);
		return str;
	}
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작");
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a = add(a1, a2);
		System.out.println("int a, int b 덧셈 : " + a);
		
		double b1 = sc.nextDouble();
		double b2 = sc.nextDouble();
		double b = add(b1, b2);
		System.out.println("double a, double b 덧셈 : " + b);
		
		sc.nextLine();
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str = add(str1, str2);
		System.out.println("str1 + str2 : " + str);
		
		sc.close();
		
	}

}
