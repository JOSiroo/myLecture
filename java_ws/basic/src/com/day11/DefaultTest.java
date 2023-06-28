package com.day11;

import java.util.Scanner;

import com.day12.Triangle3_Class2;

public class DefaultTest {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		
		Triangle3_Class2 tc = new Triangle3_Class2(w, h);
		System.out.println("변경할 값 입력");
		int w1 = sc.nextInt();
		int h1 = sc.nextInt();
		
		
		tc.setWidth(w1);
		tc.setHeight(h1);
		
		double result = tc.findArea();
		System.out.println(tc.getHeight() + tc.getWidth());
		System.out.println(result);
	}

}
