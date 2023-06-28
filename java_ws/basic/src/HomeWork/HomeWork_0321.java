package HomeWork;

import java.util.Scanner;

public class HomeWork_0321 {

	public static void main(String[] args) {
		
		System.out.println("=============No.2============");
		
		int sum = 0;
		for(int i = 2; i <= 9; i+=2) {
			for(int j = 1; j <= 9; j++) {
				sum = i*j;
				if(i == 2 && j == 3) {
					break;
				}else if(i == 4 && j == 5) {
					break;
				}else if(i == 6 && j == 7) {
					break;
				}else if(i == 8 && j == 9) {
					break;
				}
					System.out.println(i + " * " + j + " = " + sum);
			}System.out.println("");
		}
		
		System.out.println("=============No.2============");
		
		for(int i = 1; i <= 25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("=============No.3============");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 ");
		int num2 = sc.nextInt();
		
		sum = 0;
		int temp = 0;
		if(num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}	
		for(int i = num1; i <= num2; i+=2) {
				sum +=i;
		}
		System.out.println("\n" + num1 + "에서 " + num2 + "사이의 합 : " + sum);

	}

}
