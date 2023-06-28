package HomeWork;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("산술 연산자를 입력하세요\n< +, -, *, /, % >");
		String op = sc.nextLine();
		
		System.out.println("실수를 두 개 입력하세요");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		switch(op){
		case "+" :
			System.out.println("결과값 : " + (num1 + num2));
			break;
		case "-" :
			System.out.println("결과값 : " + (num1 - num2));
			break;
		case "*" :
			System.out.println("결과값 : " + (num1 * num2));
			break;
		case"/" :
			System.out.println("결과값 : " + (num1 / num2));
			break;
		case "%" :
			System.out.println("결과값 : " + (num1 % num2));
			break;
			default :
				System.out.println("잘못 입력하셨습니");
		}
		
				
		
	}

}
