package com.day9;

public class ArrayTest3_test {

	public static void main(String[] args) {
		int[] score = {90, 88, 75, 99, 100, 95, 62, 50};
		
		System.out.println("변경전 학생 점수");
		for(int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		
		System.out.println("\n\n============변경 후==============");
		int a = 90;
		//먼저 a변수의 값이 5 증가되게 한다
		a += 5;
		for(int i = 0; i < score.length; i++) {
			//각 학생들 점수에 5점 가산
			//배열요소의 값이 5씩 증가해야 함
			score[i] += 5;
			if(score[i] > 100) {
				score[i] = 100;
			}
			System.out.print(score[i] + " ");
		}
		
	}

}
