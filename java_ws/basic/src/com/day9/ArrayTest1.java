package com.day9;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
			변수 - 데이터 한개를 저장할 수 있는 저장소
			
			배열
				- 데이터를 여러개 저장 할 수있는 저장소
				- 동일한 타입의 변수들을 하나의 이름으로 묶어 놓은것
				- 참조형, 힙에 할당되어야 사용할 수 있다
				- 배열의 이름에는 주소값(참조값)이 들어간다
				- 배열의 각 요소들은 index(인덱스, 첨자)로 접근가능
				- 배열의 인덱스는 0부터 시작
				
			장점
				- 둘 이상의 변수 선언에 편의 제공
				- 반복문을 이용해서 동일한 코드 패턴 적용가능
		*/
		
		
		//1번 세트
		//배열 선언
		int[] arr;
		
		//메모리 할당
		arr = new int[3];
		
		//초기화
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 40;
		
		//배열 요소 출력
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}//for
		
		
		//2번 세트
		//선언과 메모리 할당을 동시에
		float[] arr2 = new float[2]; //힙에 할당되는 배열 요소는 default값으로 초기화 됨
		
		//출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		//3번 세트
		//선언과 동시에 초기화
		int[] arr3 = {5, 7, 9, 11, 30};
		
		//==========================
		int[] arr4;
		arr4 = new int[] {1, 2, 3, 7};
		
		/*
		int[] arr5;
		arr5 = new int[3];
		arr5 = {2, 3, 4};	//error
		*/
		
		int arr6[]; //가능
		arr6 = new int[5];
	}

}
