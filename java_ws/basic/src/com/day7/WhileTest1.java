package com.day7;

import java.util.Scanner;

public class WhileTest1 {

	public static void main(String[] args) {
		/*
		 while문 - 반복횟수가 가변적인 경우 적합
		 
		 while(조건) {
		 	반복명령;
		 }
		 => 조건을 만족하는 동안(참인 동안) 계속해서 반복처리
		 조건이 거짓이 되면 반복문을 빠져나옴
		*/
		
		Scanner sc = new Scanner("\n\n가나다 하나 둘\n\n라\n\n");
		String str = "";
		
		//public boolean hasNext()
		while(sc.hasNext()) {
			str = sc.nextLine();
			System.out.println("출력 : " + str);
		}//while
		
		str = sc.nextLine();
		System.out.println("while 탈출 후 1 : " + str);
		
		//str = sc.nextLine();//실행에러  No line found
		//System.out.println("while 탈출 후 2 : " + str);
		
		//
		System.out.println("\n======nextInt()=========\n");
		sc = new Scanner("\n\n123 45 6\n\n89\n\n");
		str = "";
		
		while(sc.hasNext()) {
			int k = sc.nextInt();
			System.out.println("출력 : " + k);
		}//while
		
		str = sc.nextLine();
		System.out.println("while 탈출 후 1 : " + str);
		
		str = sc.nextLine();
		System.out.println("while 탈출 후 2 : " + str);
		
		//str = sc.nextLine();//실행에러  No line found
		//System.out.println("while 탈출 후 3 : " + str);

		
	}

}
