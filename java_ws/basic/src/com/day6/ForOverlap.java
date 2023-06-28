package com.day6;

public class ForOverlap {

	public static void main(String[] args) {
		/*
		 	중첩 for문
		 	
		 	for(int i = 0; i < 3; i++){
		 		for(int j = 0; j < 2; j++){
		 				반복할 문장;
		 		}안쪽for
		 	}바깥 for
		 	
		 	안쪽 for => 바쁜 for
		*/
		
		for(int i = 0; i < 3; i++) {
			System.out.println("=========현재 i : " + i);
			
			for(int j = 0; j < 2; j++) {
				System.out.println("현재 j : " + j);
			}//안쪽 for
			System.out.println();
		}//바깥 for
		
		for(int j = 1; j < 10; j++) {
			for(int dan = 2; dan < 10; dan++) {
				System.out.print(dan + " * " + j + " = " + (dan * j) + "\t");
			}
			System.out.println("");
		}
		
	}

}
