package HomeWork;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("===================\n");

		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) { //바깥 포문의i 값이 감소됨과 동시에 안쪽for문의 종료식의 i값도 변한다 
				System.out.print("*");
			}
			System.out.println("");
			
		}
		System.out.println("\n==============\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요 ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요 ");
		int num2 = sc.nextInt();
		
		int result = 0;
		for(int i = num1; i <= num2; i++) {
			result += i;
			String str = "";
			int sum1 = 0;
			for(int j = num1; j <= i; j++) {
				sum1 += j; 
				str += j;
				if(j != num2) {
					str += " + ";
				}
			}
			System.out.println(" " + str + " : " + sum1);
		}
		System.out.println(" 합 : " + result);
	}

}
