package com.day7;

import java.util.Scanner;

public class WhileLoop4_Test_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("두 개의 정수를 입력하세요(피제수 제수 순으로 입력)");
			int num1 =  sc.nextInt();
			int num2 =  sc.nextInt();

			if (num1==0 && num2==0) break;
			
			if(num2==0) {
				System.out.println("제수가 0이므로 연산을 생략합니다.\n");
				continue;
			}//if

			System.out.println("몫 : " + num1/num2 +", 나머지:"+num1%num2+"\n");
		}//while
		
		//
		System.out.println("\n두 개의 정수를 입력하세요");
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();

		int start=0, end=0;
		if (num1>num2){
			start=num2;
			end=num1;
		}else{
			start=num1;
			end=num2;
		}

		int sum=0;
		for (int i=start;i<=end ;i++ ){
			sum+=i;
		}//for
		
		System.out.println("\n"+start+"~"+end+"사이의 정수의 합:"+sum);

		//swap-서로 바꾸다
		System.out.println("\n두 개의 정수를 입력하세요");
		num1 =  sc.nextInt();
		num2 =  sc.nextInt();

		int temp=0;
		if (num1>num2){
			temp=num1;
			num1=num2;
			num2=temp;
		}

		sum=0;
		for (int i=num1;i<=num2 ;i++ ){
			sum+=i;
		}//for
		
		System.out.println("\n"+num1+"~"+num2+"사이의 정수의 합:"+sum);

		
	}

}
