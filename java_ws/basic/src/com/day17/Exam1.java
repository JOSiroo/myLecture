package com.day17;

public class Exam1 {

	//(1) action() 메서드를 작성하시오.
	public static void action(Robot r) {
			if(r instanceof DanceRobot) {
				DanceRobot dcr = (DanceRobot)r;
				dcr.dance();
			}else if(r instanceof SingRobot) {
				SingRobot sr = (SingRobot)r;
				sr.sing();
			}else if(r instanceof DrawRobot) {
				DrawRobot drr = (DrawRobot)r;
				drr.draw();
			}
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
/*
		//for
		for(int i = 0; i < arr.length; i++) {
			
		}
		//확장for
		for(Robot robot : arr) {
			if(robot instanceof DanceRobot) {
				DanceRobot dcr = (DanceRobot)robot;
				dcr.dance();
			}else if(robot instanceof SingRobot) {
				SingRobot sr= (SingRobot)robot;
				sr.sing();
			}else if(robot instanceof DrawRobot) {
				DrawRobot drr = (DrawRobot)robot;
				drr.draw();
			}
		}
		*/
	}//main
}

class Robot {}
class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}