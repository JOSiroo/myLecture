package HomeWork;

import java.util.Scanner;

public class HomeWork_0323_1 {

	public static void main(String[] args) {
		//[1] 사용자에게 횟수를 입력 받고
				//그 횟수만큼 배열의 요소를 만들어 값을 자동으로 입력하 고, 화면 출력하기
				Scanner sc = new Scanner(System.in);
				System.out.println("원하는 배열의 갯수를 입력하시오 : ");
				int[] arr = new int[sc.nextInt()];
				
				int sum = 0;
				for(int i = 0; i < arr.length; i++) {
					arr[i] = i;
					System.out.println("arr[" + i + "]" + " = " + arr[i]);
				}
				
				System.out.println("=============================");
				//[2] 5개의 정수를 요소로 갖는 배열을 만들고
				//for문에서 1,3,5,7,9 의 값을 배열에 입력한 후, 확장 for문 을 이용해서 배열의 값을 출력한다
				int[] arr2 = new int[5];
				
				for(int i = 0; i < arr2.length; i++) {
					 arr2[i] = i*2+1;
						System.out.println(arr2[i]);
					}
				}
				
				
				
			}
		


