package com.day19;

public class RuntimeExceptionTest {

	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[3] = 10;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		try{
			Object obj = new int[10];
			String str = (String)obj;
			
			//Circle c = (Circle)new Shape();
		}catch(ClassCastException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}
		
		try {
			int[] arr = new int[-2];
		}catch(NegativeArraySizeException e) {
			System.out.println("예외발생 : " + e.getMessage());
		}

		try {
			String str = null;
			int len = str.length();	//
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n================next!==================");
	}

}
