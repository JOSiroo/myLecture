package HomeWork;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("값을 입력하세요");
			String str = sc.nextLine();
			char ch = ' ';
			String result = "";
			
			
			for(int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				
				if(ch > 48 || ch < 57)	{
					break;
				}
				}	
				if(ch >= 48 && ch <= 57) {
					result = "숫자입니다";
				}else if((ch < 48) || (ch > 57)){ 
					result = "숫자가 아닙니다";
				}
				System.out.println(str + "은" + result);
		}
			
	}

