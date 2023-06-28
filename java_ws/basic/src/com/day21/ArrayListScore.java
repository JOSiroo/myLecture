package com.day21;

import java.util.ArrayList;
import java.util.Scanner;


class Score{
	private int sum;
	private double avg;

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}

	public void findSum(ArrayList<Integer> list) {
		sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
	}
	public void findAvg(ArrayList<Integer> list) {
		findSum(list);
		avg = (double)sum/list.size();
	}
}

public class ArrayListScore {

	public static void main(String[] args) {
		for(;;) {
			try {	
				Scanner sc = new Scanner(System.in);
				Score s = new Score();
				System.out.println("국어, 영어, 수학 점수를 입력하세요");
				ArrayList<Integer> list = new ArrayList<>();
				for(int i = 0; i < 3; i++) {
					list.add(sc.nextInt());
				}
				s.findAvg(list);
				s.findSum(list);
				System.out.print("국어, 영어, 수학 점수 : ");
				for(int a : list) {
					System.out.print(a + " ");
				}
				System.out.println("\n총점 : " + s.getSum() + ", 평균 : " + s.getAvg());
			}catch(Exception e) {
				System.out.println("예외발생 : " + e.getMessage());
			}
		}
	}
}
