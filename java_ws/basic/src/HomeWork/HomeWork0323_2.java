package HomeWork;

import java.util.Scanner;

public class HomeWork0323_2 {
	/*
	 	문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 
        문자열을 return하도록 메서드 만들고, 메인에서 호출하기
      	my_string은 영어 대문자와 소문자로만 구성되어 있다.
	*/
	public static String convertVal(String input) {
		String result = "";
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);	
			if(ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch+32);
			}else {
				ch = (char)(ch-32);
			}
			result += ch;
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("변환할 영어 문자를 입력하시오 ");
		String input = sc.nextLine();
		String convertVal = convertVal(input);
		
		System.out.print(convertVal);

	}

}
