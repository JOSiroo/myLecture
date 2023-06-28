package com.day6;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		/*
		 	1~3까지의 합 구하기(누적)
		 	sum += i
		 	기존 sum에 i를 더한다
		 	
		 	1+2+3
		 	
		 	sum = sum + i
		 	
		 	sum = 0
		 			sum		i
		 	i = 1	 0	 +	1
		 	i = 2	 0 + 1 + 2
		 	i = 3	 0 + 1 + 2 + 3
		 */Scanner sc = new Scanner(System.in);
		 int sum = 0;
		/*//int sum = sc.nextInt();
		
		for(int i = 1; i <= 3; i++) {
			sum += i;
			//System.out.println(i+sum);
			
		}
		//System.out.println("합 : " + result);
		*/
		for(int i = 0; i <= 10; i+=2) {
			sum += i;
		}
		System.out.println("1 ~ 10까지의 짝수합 : " + sum );
		
		//사용자로부터 종료값을 입력받고, 그 값까지의 홀수의 합 구하기
		System.out.println("\n==================\n");
		System.out.println("종료값 입력");
		int num = sc.nextInt();
		sum = 0;
		for(int i = 1; i <= num; i+=2) {
			sum += i;
			
		}
		System.out.println(sum);
		
	}

}
