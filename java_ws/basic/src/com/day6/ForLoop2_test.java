package com.day6;

public class ForLoop2_test {

	public static void main(String[] args) {
		System.out.println("7의 배수이거나 9의 배수");
		for(int i = 1; i <= 99; i+=1) {
			if(i % 7 == 0) {
				System.out.print(i + "\t");
				if(i == 42) {
					System.out.println();
				}else if ( i == 84) {
					System.out.println("");
				}
			}else if(i % 9 == 0) { 
				System.out.print(i + "\t");
			}
		}

	}

}
