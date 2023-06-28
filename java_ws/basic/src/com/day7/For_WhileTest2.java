package com.day7;

import java.util.Scanner;

public class For_WhileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 정수의 개수를 입력하세요");
		int num = sc.nextInt();
		int start = 1;
		
		
		//public static long round(double a) 	//Math.round();
		double sum = 0;
		//double result = 0;
		//double sum1 = Math.round(sum);
		while(start <= num) {
			System.out.println("정수를 입력하세요");
			int inputNum = sc.nextInt();
			sum += inputNum;
			//result = ((sum/num)*100);
			start++;
		}
		//double avg = (double)Math.round(result);
		System.out.println("입력된 정수의 전체 평균 : " + Math.round((sum/num)*100)/100);
	}

}
