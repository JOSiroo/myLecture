package HomeWork;

import java.io.IOException;

public class HomeWork5 {

	public static void main(String[] args) throws IOException {
		// public static boolean isAlphabetic(int codePoint)
		//public static boolean isDigit(int codePoint)
		
		System.out.println("0 ~ 9 사이의 숫자 혹은 알파벳을 입력하시오");
		char input = (char)System.in.read();		
		String result = ""; 
		
		if(Character.isAlphabetic(input)) {
				if((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
					result = "알파벳";
				}else{
					result = "기타 문자";
				}
		}else if(Character.isDigit(input)){
			result = "숫자";
		}else{
			result = "기타 문자";
		}
		System.out.println("입력한 값 : " + input +" \n" + result + "입니다");
	}

}
