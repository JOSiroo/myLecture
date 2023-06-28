package com.day10;

import java.util.Scanner;

public class Array_lotto_Method {

	public static int[] lotto(int num) {
		int[] result = new int[0];
		int[] lotNum = new int[num];
		
		int randomVal = 0;
		for(int i = 0; i < lotNum.length; i++) {
			randomVal = (int)(Math.random()*45+1);
			lotNum[i] = randomVal;	
			for(int j = 0; j < i; j++) {
				if(lotNum[j] == lotNum[i]) {i--; break;} 
			}//안쪽for
		}//바깥for
		
		return lotNum;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] dArr = new double[5];

		for(int i = 0; i < dArr.length; i++){
			System.out.println("잔고를 입력하세요");
			dArr[i] = sc.nextDouble();
		}
		System.out.println("이자율을 입력하세요");
		double interest = sc.nextDouble();

		for(double d : dArr){
			System.out.println("이율을 합친 잔고의 값 : " + (int)(d+(d*interest)/100));
		}

	}

}
