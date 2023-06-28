package FinalTest;

import java.util.Scanner;

/*
	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 
	매개변수로 주어진다. s가 의미하는 원래 숫자를 return 하도록 메서드 만들기
 */
class NumGameC{
	public String process(String str) {
		String abc = "";
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			if(!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				abc += str.charAt(i);
			}else {
				result += str.charAt(i);
			}
			switch(abc) {
			case "zero":
				result += "0";
				abc = "";
				break;
			case "one":
				result += "1";
				abc = "";
				break;
			case "two":
				result += "2";
				abc = "";
				break;
			case "three":
				result += "3";
				abc = "";
				break;
			case "four":
				result += "4";
				abc = "";
				break;
			case "five":
				result += "5";
				abc = "";
				break;
			case "six":
				result += "6";
				abc = "";
				break;
			case "seven":
				result += "7";
				abc = "";
				break;
			case "eight":
				result += "8";
				abc = "";
				break;
			case "nine":
				result += "9";
				abc = "";
				break;
			default:
				break;
			}

		}
		return result;
	}
}

public class NumGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 포함한 숫자 문자열을 입력하세요");
		NumGameC ng = new NumGameC();
		String input = sc.nextLine();
		String result = ng.process(input);

		System.out.println(result);
	}

}
