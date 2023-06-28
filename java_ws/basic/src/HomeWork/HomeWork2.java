package HomeWork;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어, 국어, 수학 점수를 입력세요");
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		float sum = (float)(score1 + score2 + score3)/3;
		int sum1 = (int)sum;
		
		String result = "";
		if(sum >= 70) {
			if((score1 >= 50) && ((score2 >= 50) && (score3 >= 50) )) {
				result = "합격";
			}else {
				result = "과락";
			}
		} else {
			result = "불합격";
		}

		String grade = "";		
		switch(sum1/10) {
		case 9 :
			grade = "A";
			break;
		case 8 :
			grade = "B";
			break;
		case 7 :
			grade = "C";
			break;
		case 6 :
			grade = "D";
			break;
		case 5 :
			grade = "F";
			break;
		}		
		System.out.println("평균 : " + sum + "\n학점 : " + grade + "\n합격여부 : " + result);
	
	}

}
