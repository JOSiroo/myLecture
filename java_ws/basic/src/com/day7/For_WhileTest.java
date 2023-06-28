package com.day7;

public class For_WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;	
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%5 == 0) {	
				sum += i;
			}//if
		}//for
		System.out.println("3의 배수와 5의 배수의 합 : " + sum + "<= for");
		
		System.out.println("=================================");
		
		int i = 1;
		sum = 0;
		while(i <= 100) {
			i++;
			if(i%3 == 0 || i%5 ==0) {
				sum += i;
			}//if
		}//while
		System.out.println("3의 배수와 5의 배수의 합 : " + sum + " <= while");
	}

}
