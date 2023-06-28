package com.day7;

public class For_whileTest3 {

	public static void main(String[] args) {
		int sum = 6;
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if(j + i == sum) {
					System.out.println( i + " + " + j + " = " + sum);
				}
			}//안쪽for
		}//바깥for
		
		System.out.println("===================");
		
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				sum += j;
			}
		}System.out.println("totalSum = " + sum);
		
		
		sum = 0;
		int sum1 = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;		//1, 1+2, 1+2+3, ...
			sum1 += sum;	//1 + (1+2) + (1+2+3) ...
		}System.out.println("totalSum = " + sum1);
		
		
	}

}
