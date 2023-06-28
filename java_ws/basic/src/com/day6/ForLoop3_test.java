package com.day6;

public class ForLoop3_test {

	public static void main(String[] args) {
		
		/*	
		for(int j = 1; j <= 99; j++)
				if(j % 7 == 0 || j % 9 == 0) {
					System.out.print(j + "\t");
					if(j % 21 ==0) {
						System.out.println("");
					}
				}
		*/
		int count = 0;
		for(int i = 1; i < 100; i++) {
			if(i % 7 == 0 || i % 9 ==0) {
				System.out.print(i + "\t");
				count++;
				if(count % 10 == 0) 
					System.out.println("");
				
			}
		}
			

	}

}
