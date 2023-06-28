package com.day9;

import java.util.Scanner;

public class Arraytest5_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 배열의 갯수를 입력하세요 : ");
		int[] arr = new int[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 배열에 담을값을 입력하세요 ");
			int arrNum = sc.nextInt();
			//arr[i] += i;
			arr[i] = 1*arrNum;
		}
		
		System.out.println("=============");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 배열 : " + arr[i] + "\n");
		}
		
	}

}
