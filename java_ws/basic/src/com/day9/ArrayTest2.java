package com.day9;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		char[] arr = new char[5];
		arr[0] = 'H';
		arr[1] = 'e';
		arr[2] = 'l';
		arr[3] = 'l';
		arr[4] = 'H';

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		char[] arr2 = {'j', 'a', 'v', 'a'};
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("\narr배열의 주소 : " + arr);
		
		float[] farr;
		farr = new float[3];
		farr[0] = 12.5F;
		farr[1] = 24.3F;
		farr[2] = 0.76F;
		
		for(int i = 0; i < farr.length; i++) {
			System.out.println("arr[" + i + "]" + " = " + arr[i]);
		}
		
		double[] darr = {12.5, 3.24, 7.0, 50.2};
		double sum = 0;
		
		for(int i = 0; i < darr.length; i++) {
			sum += darr[i];
		}
		
		double avg = sum/4;
		System.out.println("총점 : " + sum + "평균 : " + avg);
	}

}
