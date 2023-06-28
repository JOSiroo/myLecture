package com.day10;

import java.util.Scanner;

public class Arrays_bank {


	
	public static void main(String[] args) {
		double[] balance = new double[5];
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < balance.length; i++) {
			System.out.println("잔고를 입력하세요");
			balance[i] = sc.nextDouble();		
		}
		
		System.out.println("이자율을 입력하세요");
		double num = sc.nextDouble();
		
		for(int i = 0; i < balance.length; i++) {
			balance[i] = balance[i] + balance[i]*(num*0.01);
			balance[i] = Math.round(balance[i]*100)/100.0;
		}
		
		
		for(double a : balance) {
			System.out.println("이자가 반영된 잔고 조회 : " + (int)a);
		}
	
	}

}
