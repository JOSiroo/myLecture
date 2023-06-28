package com.day7;
import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		/*
		 	for문 처럼 사용하는 것도 가능
		 	
		 	for(초기식;조건식;증감식){
		 		반복명령;
		 	}
		 	
		 	=>
		 	초기식
		 	while(조건식){
		 		반복명령;
		 		
		 		증감식;
		 	}
		*/
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
		}
	
		System.out.println("\n========while==========");
		
		
		
		Scanner sc = new Scanner(System.in);
		int i = 0;	// 초기식
		
											//i = sc.nextInt();
		while(i < 3) { //조건식
			System.out.println("i = " + i);	//반복명령
			i++;	//증감식
		}//while
	}

}
