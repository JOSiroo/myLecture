package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class Array_StudentsAward {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int[] students = new int[10];
		int score = 0;
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("점수를 입력하세요");
			students[i] = sc.nextInt();
			score = students[i];
			for(int j = 0; j < i; j++) {
				if(score > students[j]) {
					int temp = score;
					score = students[j];
					students[j] = temp;
				}
			}
		}
		System.out.println("A학점은 " + students[1] + "점 이상이 되어야 합니다.");
		*/
		
		   int [] score = new int[10];   
		      for(int i = 0; i<score.length; i++) {
		      System.out.println("점수를 입력하세요.");
		         score[i] = sc.nextInt();
		      }
		      Arrays.sort(score);
		      System.out.println("A학점 은 " +score[8] +"점 이상이 되어야 합니다.");
	
	
	}

}
