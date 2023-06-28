package com.day5;

import java.util.Scanner;

public class forTest1 {

	public static void main(String[] args) {
		
		for(int i = 10; i > -7; i-=2) {
			if(i > 0) {
				System.out.println(i + "  java");
			}else if(i == 0) {
				System.out.println(i + "  oreacle");
			}else {
				System.out.println(i + "  spring");
			}
		}
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요");
		
	}

}
