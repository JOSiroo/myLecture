package com.day14;

import java.util.Scanner;

class Score{
	private int[] subject;
	
	Score(int[] subject) {
		this.subject = subject;
	}
	
	//getter/setter
	public int[] getSubject() {
		return subject;
	}
	public void setSubject(int[] subject) {
		this.subject = subject;
	}
	
	//메서드
	public int findScore() {
		int score = 0;
		for(int i = 0; i < subject.length; i++) {
			score += subject[i];
		}
		return score;
	}
	public double avg() {
		int sum = findScore();
		return (double)sum/subject.length;
	}
	
}
public class ScoreArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] subject = new int[3];
		
		System.out.println("성적 입력");
	for(int i = 0; i < subject.length; i++) {
		int a = sc.nextInt();
		subject[i] = a;
	}
	Score score = new Score(subject);
	
	int[] getSubject = score.getSubject();
	for(int i = 0; i < subject.length; i++) {
		System.out.println(getSubject[i] + " ");
	}
	
	
	
	int score1 = score.findScore();
	double avg = score.avg();
	System.out.println("총점 : " + score1 + "\n" + "평균 : " + avg);
	
	
	
	}

}
