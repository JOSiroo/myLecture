package com.day20.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 	Generics 컬렉션
		 		- JDK 1.5에 추가된 기능
		 		- 컬렉션에 저장할 객체의 타입을 지정
		 		- 지정한 타입의 객체만 해당 컬렉션에 저장 할 수 있다
		 		- 꺼낼때는 자동으로 형변환 해줌
		 		
		 	컬렉션클래스<저장 할 객체의 타입> 변수명 = new 컬렉션클래스<저장 할 객체의 타입>();
		*/

		//ArrayList<Integer> list = new ArrayList<>();	//가능
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		System.out.println("(3)일 때 list.size = " + list.size());	//0
		System.out.println("===================================");
		
		//저장
		list.add(10);
		list.add(17);
		list.add(23);
		
		//참조 - 읽어오기
		for(int i = 0; i < list.size(); i++) {
			int k = list.get(i);	//형변환 안해도 됨, unboxing도 해줌
			System.out.println(k);
		}
		System.out.println("list.size = " + list.size());	//0
	
		//삭제
		list.remove(1);	// index가 1인 데이터 삭제
		System.out.println("\n==========삭제 후=============");
		for(int n : list) {
			System.out.println(n);
		}
		System.out.println("list.size = " + list.size());	//0
		
		
		//for문에서 초기화
		ArrayList<Integer> list2 = new ArrayList<>();
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {		//값이 들어가지 않음! - size가 0이므로
			list2.add(i+1);
		}//for
		for(int i = 0; i < 4; i++) {	//초기화 할때는 갯수를 직접 지정해야함
			list2.add(i+1);
		}//for
	
		//읽어오기
		System.out.println("==============for문에서 초기화==============");
		for(int n : list2) {
			System.out.println(n + " ");
		}
		System.out.println("list2.size = " + list2.size());
		
	}

}
