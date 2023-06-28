package eeee;

import java.util.Scanner;

class Sort{
	
	public int[] sortDown(int[] arr) {
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[j];	
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		return arr;
	}
}

public class SortTest_조상혁 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("숫자 입력");
			arr[i] = sc.nextInt();
		}
		Sort s = new Sort();
		s.sortDown(arr);
		
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
