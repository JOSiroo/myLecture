package com.day8;

public class MethodTest3_test {

	//1. 매개변수, 반환값이 모두 없는 경우
	public static void method1() {
		System.out.println("Hello java");
	}
	
	//2. 매개변수가 있는 경우
	public static void method2(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Hello java");
		}
	}
	
	//3. 반환값이 있는 경우
	public static int method3() {
		int sum = 0;
		for(int i = 1; i <= 100; i+=2) {
			sum += i;
		}
		return sum;
	}
	
	//4. 매개변수, 반환값이 모두 있는 경우
	public static float method4(float a, float b) {
		float sum = a*b;
		return sum;
	}
	public static void main(String[] args) {
		
		//1. 매개변수, 반환값이 모두 없는 경우
		method1();
		
		System.out.println("\n=================\n");
		//2. 매개변수가 있는 경우
		method2(3);
		
		System.out.println("\n=================\n");
		//3. 반환값이 있는 경우
		int num = method3();
		System.out.println(num);
		
		System.out.println("\n=================\n");
		//4. 매개변수, 반환값이 모두 있는 경우
		float a = 10.0F, b = 2.5F;
		float result = method4(a,b);
		System.out.println(a + " * " + b + " = " + result);
		
		
	}

}
