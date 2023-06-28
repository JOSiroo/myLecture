package com.day11;

import java.util.Scanner;

public class JaggedArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ad = sc.nextInt();
		int[][] arr = {{10,10,10,10,10,},{20,20,20,20,20},{30,30,30,30,30,},{45,45,45,45,45}};
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length+1; j++) {
				sum += arr[i][j];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("총합 : " + (int)sum + "\n" + "평균 : " + sum/20);
		
	}

}
