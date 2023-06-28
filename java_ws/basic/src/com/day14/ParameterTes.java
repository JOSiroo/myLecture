package com.day14;

class Data{
	int x;
}

public class ParameterTes {
	public static void change1(int x) { // 기본형 매개변수 // call by value 너는 너 나는 나
		/*
		 	매개변수가 기본자료형, 값이 넘어간다
		 	메서드에서 매개변수의 값을 변경해도 호출한 곳(main)에서는 변경의 영향을 받지 않는다
		*/
		x = 1000;
		System.out.println("change1() : x = " + x);
	}
	public static void Change2(Data d) { //참조형 매개변수(call by reference)
		/*
		 	매개변수가 참조형, 주소가 넘어간다
		 	메서드에서 매개변수의 값을 변경하면 호출한 곳(main)에서도 변경의 영향을 받는다
		*/
		
		d.x = 2000;
		System.out.println("Change2() : x = " + d.x);
	}
	
	public static void Change3(int[] x) { //참조형 매개변수
		x[0] = 3000;
		System.out.println("Change3() : x = " + x[0]);
	}
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change1(d.x);
		System.out.println("change1()메서드 호출 후 main() : x= " + d.x); //너는 너 나는 나
		
		//참조형 매개변수
		System.out.println("===========참조형 매개변수==========");
		Data d2 = new Data();
		d2.x = 20;
		System.out.println("main() : x = " + d2.x);
		
		Change2(d2);
		System.out.println("Change2() 메서드 호출 후 main() : x = " + d2.x);
		
		//
		System.out.println("===========참조형 매개변수 배열==========");
		int[] x = new int[2];
		x[0] = 10;
		x[1] = 20;
		System.out.println("main : x = " + x[0]);
		
		Change3(x);
		System.out.println("Change3() 호출 후 main() : " + x[0]);
	}

}
