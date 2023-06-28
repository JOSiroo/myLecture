package com.day13;

import java.util.Scanner;

class Score{
		//입력값에 해당하는 멤버변수(매개변수)
	   private int kor;
	   private int eng;
	   private int math;
	   
	   //결과값에 해당하는 멤버변수(반환값)
	   private int sum;		//총점
	   private double avg;	//평균
	   
	   //생성자
	   Score(int kor, int e, int m){	//생성자에서는 입력값에 해당하는 멤버변수값만 초기화한다
	      this.kor = kor;
	      this.eng = e;
	      this.math = m;
	   }
	   //getter/setter
	   public int getSum() {
		   return sum;
	   }
	   public double getAvg() {
		   return avg;
	   }
	   
	   //총점, 평균을 구하는 메서드
	   public void findSum(){
	      sum = kor+eng+math;
	   }
	
	   public void findAverage(){
	      //findSum();
	      avg =  sum/3f;
	   }
	}//class

public class ScoreExam {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("국어, 영어, 수학 점수를 입력하세요");
      int kor = sc.nextInt();
      int eng = sc.nextInt();
      int math = sc.nextInt();

      Score obj = new Score(kor, eng, math);

      obj.findSum();
      obj.findAverage();

      System.out.println("\n총점=" +obj.getSum()+ ", 평균=" + obj.getAvg());
   sc.close();
   }
}
