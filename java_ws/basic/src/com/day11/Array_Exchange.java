package com.day11;

import java.util.Scanner;

public class Array_Exchange {

	public static void main(String[] args) {
		
		int[] coinUnit = {500, 100, 50, 10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("금액 입력");
		int money = sc.nextInt();
		
		int exchange = 0;

		
		for(int i = 0; i < coinUnit.length; i++) {
			exchange = money / coinUnit[i]; 
			money = money%=coinUnit[i];
			System.out.println(coinUnit[i] + "원 : " + exchange);
		}
		
	}

}
