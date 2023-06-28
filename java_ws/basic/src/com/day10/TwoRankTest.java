package com.day10;

public class TwoRankTest {

	public static void main(String[] args) {
		/*
		 	다차원 배열 - 각 영역은 모두 reference를 표시하는 공간이고,
		 				마지막 배열 공간만이 실제 데이터를 나타내는 공간임
		*/
		
		// 2차원 배열
		// 1. 배열 선언
		int[] [] arr;
		
		// 2. 메모리 할당
		arr = new int [2][3]; //2행 3열
		
		// 3. 초기화
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[1][0] = 11;
		arr[1][1] = 27;
		arr[1][2] = 39;
		
		//출력
		for(int i = 0; i < arr.length; i++) {	//2
			for(int j = 0; j < arr[i].length; j++) {	//3
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}//for
		System.out.println("\n행의 개수 : " + arr.length);
		System.out.println("열의 개수 : " + arr[0].length);
		
		//[2] 배열선언과 메모리 할당을 동시에
		int[][] arr2 = new int [3][2];//3행2열
		
		//초기화
		arr2[0][0] = 7;
		arr2[0][1] = 8;
		arr2[1][0] = 17;
		arr2[1][1] = 68;
		arr2[2][0] = 97;
		arr2[2][1] = 28;	
	
		//[3] 배열선언, 메모리할당. 초기화 모두 동시에
		int[][] arr3 = {{1,2,3,4} , {7,8,9,6} , {3,4,8,9}}; //3행 4열
		
		for(int[] aa : arr3) {
			for(int n : aa) {
				System.out.print(n + " ");
			}
			System.out.println();
		}//for
		
		
	}

}













