package com.day6;

import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("반복하고 싶은 횟수를 입력하세요");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("재미있는 java");
		}
		System.out.println("\n========================\n");
		
		for(int i = 0; i < num; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("\n======================\n");
		
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;
			System.out.println("i = " + i +", sum = " + sum);
		}
		System.out.println("\n0부터"+ num + "까지의 합" + sum);
		
		System.out.println("\n======================\n");
		
		////////////////////////////////////////////////////////
	
		for(int i = 97; i <= 122; i++) {
			if((i >= 97) && (i <= 121)) {
			System.out.print((char)i + ", ");			
			}else {
				System.out.println((char)i);
			}
		}
		
		for(int i = 97; i <= 122; i++) {
			System.out.println((char)i);
			 if(i != 122) {
				System.out.println(", ");
			 }
		}
		
		
		
	}

}
