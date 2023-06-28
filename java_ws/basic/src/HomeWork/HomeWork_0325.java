package HomeWork;

import java.util.Scanner;

public class HomeWork_0325 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1. 사용자로부터 문자열을 입력 받고, 각 문자열에 해당하는 코드값을 출력하기
		String input = sc.nextLine();
		int[] result = new int[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			result[i] = input.charAt(i);
			System.out.println("input.charAt[" + i + "] = " + result[i]);
		}
			
			//5개의 숫자를 사용자로부터 입력 받아서 배열에 넣고, 내림차순으로 정렬한 후 출력하기
		
		System.out.println("배열의 개수를 입력하세요 ");
		int loopNum = sc.nextInt();
		int[] arr = new int[loopNum];
		System.out.println(loopNum + "개의 숫자를 입력하세요 ");
		

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			for(int j = 0; j < i; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
				}
			}
		}
		System.out.println("=====내림차 순으로 정렬=====");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		
		
			
	}

}
