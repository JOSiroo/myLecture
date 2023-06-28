package com.day6;

import java.util.Scanner;

public class ExamFor2_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수 입력!");
		int count=sc.nextInt();  //3, 5

		for(int i=0;i<count;i++) {
			System.out.println("재미있는 java!!");
		}//for

		for(int i=0;i<count;i++) {
			System.out.println("i="+i);
		}//for

		int sum=0;
		for(int i=1;i<=count;i++) {
			sum+=i;
			System.out.println("i="+i+", sum="+sum);
		}//for

		System.out.println("1~"+count+"까지의 합:"+ sum+"\n");

		//
		//for문을 이용하여 소문자 알파벳(a~z) 출력하기
		for (int i=97;i<=122 ; i++ ){
			System.out.print((char)i);
			if(i !=122)
				System.out.print(", ");				
		}
		System.out.println();

		for(char ch='a';ch<='z'; ch++){
			System.out.print(ch);
			if(ch !='z')
				System.out.print(", ");		
		}
		System.out.println();

		char lowerCase = 'a';
		for (int i=1;i<=26 ; i++ ){
			System.out.print(lowerCase++);
			if(i<26)
				System.out.print(", ");			
		}
		System.out.println();

		for(char ch='a';ch<='z'; ch++){
			if(ch !='a')	
				System.out.print(", ");	
			
			System.out.print(ch);
		}//for
		
	}

}
