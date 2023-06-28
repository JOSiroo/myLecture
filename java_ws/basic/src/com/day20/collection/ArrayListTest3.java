package com.day20.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> dlist = new ArrayList<>(3);
		dlist.add(3.14);
		dlist.add(5.59);
		dlist.add(59.12);
		
		
		for(int i = 0; i < 3; i++) {
			double n1 = sc.nextDouble();
			dlist.add(n1);
		}
		
		System.out.println("================for======================");
		for(int i = 0; i < 3; i++) {
			System.out.println("dlist" + "(" + i + ")" + " = " + dlist.get(i));
		}
		System.out.println("==============확장 for====================");
		int k = 0;
		for(double d : dlist) {
			System.out.println("dlist" + "(" + k + ")" + " = " + d);
			k++;
		}
		
		System.out.println("============String===============");
		ArrayList<String> slist = new ArrayList<>();
		
		
		
		
		for(int i = 0; i < 5; i++) {
			String input = sc.nextLine();
			slist.add(input);
		}		//slist.add(i) 를 따로 지정하지 않았지만 ArrayList는 동적으로 크기를 조정하기 때문에
				//for문이 반복되는동안 입력한 값이 순서대로 저장된다
		
		
		
		
		
		System.out.println("================for======================");
		for(int i = 0; i < slist.size(); i++) {
			System.out.println("slist" + "(" + i + ")" + " = " + slist.get(i)); 
		}
		System.out.println("==============확장 for====================");
		k = 0;
		for(String s : slist) {
			System.out.println("slist" + "(" + k + ")" + " = " + s);
			k++;
		}
		
		
	}

}
