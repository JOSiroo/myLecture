package com.day10;

public class JaggedArray3 {

	
	public static int[][] arrM(int a){
		int[][] result = new int[a][a];
		
		int num = 1;
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result.length; j++) {
				if(i == j) {
					result[i][j] = num;
				}
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
			
		}
	return result;
	}
	public static void main(String[] args) {
		int[][] cross1 = new int[3][3];
		
		int num = 1;
		for(int i = 0; i < cross1.length; i++) {
			for(int j = 0; j < cross1.length; j++) {
				if(i == j) {
					cross1[i][j] = num;
				}
				System.out.print(cross1[i][j] + "\t");
			}
			System.out.println();

		}
	System.out.println("==================");
		
		
		int[][] cross2 = new int[3][3];
		for(int i = 0; i < cross2.length; i++) {
			for(int j = 0; j < cross2.length; j++) {
				if(i == j || i + j == 2) {
					cross2[i][j] = num;
				}
				System.out.print(cross2[i][j] + "\t");
				if(j == 2) {
					System.out.println();
				}
			
			}
		}
		System.out.println("=========================");
		
		int[][] cross3 = new int[4][4];
		for(int i = 0; i < cross3.length; i++) {
			for(int j = 0; j < cross3.length; j++) {
				if(i == j || i + j == cross3.length - 1) {
					cross3[i][j] = num;
				}
				System.out.print(cross3[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==================================");
		int[][] arrM = arrM(5);

		
		
		
	}

}
