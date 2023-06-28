package com.day10;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열변수의 복사
		//	- 배열의 인스턴스는 복사되지 않음
		//	- 배열은 참조형이므로 배열복사하게 되면 같은 메모리 영역을 가리키게 됨
		//배열이름에는 주소가 들어가므로
		
		int[] arr = new int[3];
		int[] copy = arr;
		arr[0]++;
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("copy[0] = " + copy[0]);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\n======배열 요소========");
		for(int i = 0; i < copy.length; i++) {
			System.out.println(copy[i] + " ");
		}
		
		//배열복사를 이용한 swap
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = {20, 40, 60};
		
		System.out.println("arr1의 주소 : " + arr1 + ", arr2의 주소 : " + arr2);
		
		int[] temp = arr1;	//temp => {1, 3, 5, 7, 9}
		arr1 = arr2;		//arr1 => {20, 40, 60}
		arr2 = temp;		//arr2 => {1, 3, 5, 7, 9}
		
		System.out.println("\nswap이후 arr1주소 : " + arr1 + ", arr2주소 : " + arr2);
		
		System.out.println("\n======arr1의 요소===========");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n======arr2의 요소==========");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
