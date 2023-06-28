package com.day6;

import java.util.Scanner;

public class ForOverlap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("3의 배수의 개수를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			System.out.println(i*3);
		}
		*/
		
		System.out.println("n의 계승 구하기 : n을 입력하세요");
		int num1 = sc.nextInt();
		int sum3 = 1;
		for(int i = 1; i <= num1; i++) {
			sum3 *= i;
			
		}System.out.println("1 ~ " + num1 + "까지의 곱<계승, factorial> : " + sum3);
		
		System.out.println("=============");
		
		int sum = 0;
		for(int i = 0; i <= 100; i+=2) {
			sum += i;
			}
			System.out.println("0 ~ 100까지 짝수의 합 : " + sum);
			
			System.out.println("=============");
			
			System.out.println("출력할 구구단의 단을 입력하세요");

		int input = sc.nextInt();
		for(int i = 9; i >= 1; i--) {

			System.out.println(input + " * " + i + " = " + i*input); 
		}

		


		}
		
		

	}


