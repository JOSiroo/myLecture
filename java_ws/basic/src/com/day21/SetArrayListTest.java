package com.day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetArrayListTest {

	public static void main(String[] args) {
		System.out.println("배열");
		double[] dArr = new double[4];
		for(int i = 0; i < dArr.length; i++) {
			dArr[i] = i + 1.5;
		}
		System.out.println("=======배열 for=======");
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(i+1 + " : " + dArr[i]);
		}
		System.out.println("=======배열 확장 for=======");
		for(double a : dArr) {
			System.out.println(a);
		}
		ArrayList<Double> dlist = new ArrayList<>(4);
		for(int i = 0; i < 4; i++) {
			 dlist.add(i+1.5);
		}
		System.out.println("========alist for=======");
		System.out.println("ArrayList");
		for(int i = 0; i < dlist.size(); i++) {
		System.out.println(i+1 + " : " +  dlist.get(i));	
		}
		System.out.println("======alist 확장for======");
		for(double d : dlist) {
			System.out.println(d);
		}
		System.out.println("=======alist iterator=======");
		Iterator<Double> dIter = dlist.iterator();
		while(dIter.hasNext()) {
			System.out.println(dIter.next()); 
		}
		HashSet<Double> dSet = new HashSet<>(4);
		for(int i = 0; i < 4; i++) {
			dSet.add(i+1.5);
		}
		System.out.println("=======HashSet iterator=======");
		Iterator<Double> dIter1 = dSet.iterator();
		while(dIter1.hasNext()) {
			double d = dIter1.next();
			System.out.println(d);
		}
	}

}
