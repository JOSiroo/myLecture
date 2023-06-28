package HomeWork;

import java.util.Scanner;

public class HomeWork_0322 {

	//public static int getNumericValue(char ch)
	public static int conVoInt(String num) {
		int conVInt = Integer.parseInt(num);
		return conVInt;
	}
	
	public static void aBb(int num) {
		for(int i = 0; i < num; i++){
			for(int j = 1; j <= i; j++) {
				System.out.print("A");
			}
			System.out.println("B");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("반복 횟수를 입력하세요 ");
		int input = sc.nextInt();
		aBb(input);
		
		sc.nextLine();
		
		System.out.print("\n0 ~ 9 사이의 숫자를 입력 : ");
			int sum = 0;
			for(;;) {
				String str = sc.nextLine();
				int result = conVoInt(str);
				
				if(result == 0) {
					System.out.println("끝 ");
					break;
				}
				if(result >= 0 && result <= 9) {
					sum = result*100;
				}else if(!(result >= 0 && result <= 9)){
					System.out.println("잘못 입력하셨어요 다시 입력하세용 ");
					continue;
				}
				System.out.println(str + " => " + result);
				System.out.println(result + " * 100 = " + sum);
			}

		
		
		
		
	}

}
