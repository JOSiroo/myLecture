package com.day10;

public class JaggedArray2 {

	public static void main(String[] args) {
		String[] season;
		season = new String[] {"봄", "여름", "가을", "겨울"};
		String result = "";
		for(int i = 0; i < season.length; i++) {
			result = season[i];
			System.out.println("seasen[" + i + "] = " + result);
		}
		
		double[][] num = {{10.1, 10.2},{10.3, 10.4},{10.5, 10.6}};
		double result1 = 0.0;
		for(int i = 0; i < num.length ; i++) {
			for(int j = 0; j < num[i].length; j++) {
				
				System.out.println(num[i][j]);
			}
		}
		
		double[][] num1 = {{10.1, 10.2},{10.3, 10.4},{10.5, 10.6}};
		double[] num2 = new double[6];

		for(int i = 0; i <3; i++) {
				for(int j = 0; j < 2; j++) {
					num2[2 * i + j] = num1[i][j];	
				}	
			}
		for(double a : num2) {
			System.out.println(a);
		}
		
		/*
		int row = num.length;
		int col = num[0].length;
		double[] oneArr = new double[row * col];
		*/
		}
	
	}
		
		
		
		



