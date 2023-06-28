package com.day6;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(;;) {
			System.out.print("숫자를 입력하세요 \n 종료하려면 0을 입력하세요. \t\t");	
			int num = sc.nextInt();

			if(num == 0) break;
			result += num;
				
		}
		System.out.println("======게임종료======\n입력된 숫자의 합 : " + result);
		
	}
}
