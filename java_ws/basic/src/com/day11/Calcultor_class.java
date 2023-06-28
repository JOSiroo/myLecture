package com.day11;

import java.util.Scanner;

class Calculator{
	
	public int add(int a, int b) {
		return a + b;
	}
	public int minus(int c, int d) {
		int result = c - d;
		return result;
	}
	public int multi(int e, int f) {
		int result = e * f;
		return result;
 	}
	public int div(int g, int h) {
		int result = g / h;
		return result;
	}
}	
class Rectangle{
	int w, h;
	
	public double area() {
		int area = w*h;
		return area;
	}
	public double girth() {
		int girth = (w+h)*2;
		return girth;
	}
	
}
public class Calcultor_class {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("두 실수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int add = cal.add(num1, num2);
		int minus = cal.minus(num1, num2);
		int multi = cal.multi(num1, num2);
		int div = cal.div(num1, num2);
		
		System.out.println( "a = " + num1 + ", b = " + num2);
		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + minus);
		System.out.println(num1 + " * " + num2 + " = " + multi);
		System.out.println(num1 + " / " + num2 + " = " + div);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("사각형의 가로, 세로를 입력하세요");
		
		rec.h = sc.nextInt();
		rec.w = sc.nextInt();
		
		double area = rec.area();
		double girth = rec.girth();
		
		System.out.println("사각형의 넓이 : " + (int)area);
		System.out.println("사각형의 둘레 : " + (int)girth);
		
		
	}

}
