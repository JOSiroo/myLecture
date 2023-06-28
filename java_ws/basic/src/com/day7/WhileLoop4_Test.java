package com.day7;

import java.util.Scanner;

public class WhileLoop4_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();		
		
		int sum = 0;
		if(num1 > num2) {
				for(int i = num2; i <= num1; i++) {
				sum += i;
				}
				System.out.println(num2 + " 과 " + num1 + "사이의 합 : " + sum);
					
			}else{
				for(int i = num1; i <= num2; i++) {
					sum += i;
				}
			System.out.println(num1 + " 과 " + num2 + "사이의 합 : " + sum);
			}	

		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
		}
	}


