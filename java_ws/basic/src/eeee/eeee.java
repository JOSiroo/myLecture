package eeee;

import java.text.ParseException;
import java.util.StringTokenizer;
class MyRectangle{
	int w;
	int h;

	MyRectangle(int w, int h){
		this.w = w;
		this.h = h;
	}

	public int findArea(){
		return w*h;
	}
	public int findGirth(){
		return (w+h)*2;
	}
}
public class eeee {

	public static void main(String[] args) throws ParseException {
		String source = "100,200,300,400";

		//(1) StringTokenizer를 이용하여 ,를 구분자로 분리하여 출력
		StringTokenizer stk = new StringTokenizer(source, ",");
		while(stk.hasMoreTokens()){
			String token = stk.nextToken();
			System.out.print(token + " ");
		}			

		//(2) split() 메서드를 이용하여 동일 결과가 나오도록 할 것
		String[] arr = source.split(",");

		for(String s : arr){
			System.out.print(s + " ");
		}


	}
}



