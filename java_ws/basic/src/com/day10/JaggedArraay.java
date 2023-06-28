package com.day10;

public class JaggedArraay {

	public static void main(String[] args) {
		/*
			가변배열
				- 배열의 배열, 들쭉날쭉 배열, 동적 배열
				- 배열 요소마다 크기를 다르게 지정할 수 있다.
				- 각 행마다 다른 크기의 배열을 생성하는 것이 가능
				
				int[][] arr = new int[3][];
				arr[0] = new int[4];
				arr[1] = new int[2];
				arr[2] = new int[3];
		*/
		
		// 2차원 배열
		int[][] arr = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 11;
		arr[1][0] = 13;
		arr[1][1] = 14;
		arr[2][0] = 17;
		arr[2][1] = 19;
		
		//가변배열
		int[][] arr2 = new int[3][];
		arr2[0] = new int[4];
		arr2[1] = new int[2];
		arr2[2] = new int[3];
		
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[1][0] = 5;
		arr2[1][1] = 6;
		arr2[2][0] = 7;
		arr2[2][1] = 8;
		arr2[2][2] = 9;
		
		
		System.out.println("\n\n==========가변배열=============");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				System.out.println(arr2[i][j] + " ");
		
			}
			System.out.println();
		}
		
		//
		int[][] arr3 = {{10,20,30,40,50,},{11,22},{77,88,99}};
	}
	
	

}
