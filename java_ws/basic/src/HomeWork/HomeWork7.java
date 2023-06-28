package HomeWork;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("4자리 이상의 숫자를 입력하세요");
		String str = sc.nextLine();
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i)-48;	
		}System.out.println(sum);
		

	}

}
