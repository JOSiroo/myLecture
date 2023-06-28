package com.day12;

import java.util.Scanner;

public class Score {
	
	//멤버변수 만들기
	int kor;
	int eng;
	int math;
	
	//생성자 만들기
	Score(int k, int e, int m){
		kor = k;
		eng = e;
		math = m;
	}
	
	//메서드 만들기
	public int sum() {
		return kor+eng+math;
	}
	public float avg() {
		return Math.round(((float)kor+eng+math)/3*100)/100.0F;
	}
	
	public static void main(String[] args) {

		System.out.println("국어, 영어, 수학 점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		Score sco = new Score(kor, eng, math);
		
		int sum = sco.sum();
		float avg = sco.avg();
	
		System.out.println("총점 = " + sum + ", 평균 = " + avg);
	}

}
