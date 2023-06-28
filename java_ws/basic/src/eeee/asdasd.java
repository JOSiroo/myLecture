package eeee;

import java.util.Scanner;

class IdNoException1 extends Exception{
	
	IdNoException1(String msg){
		super(msg);
	}
	
}
public class asdasd {
	public static String getIdNo() throws IdNoException1{
		Scanner sc = new Scanner(System.in);
		String idNo = sc.nextLine();
		if(idNo.length() != 14){
			throw new IdNoException1("입력하신 주민등록번호가 14자리가 아닙니다.");
		}
	return idNo;
	}
	public static void main(String[] args) {
		try{
			System.out.println("주민등록번호를 입력하세요");
			System.out.println("주민등록번호 :  " + getIdNo());
		}catch(IdNoException1 e){
			System.out.println("예외 : " + e.getMessage());
}	
		
	}
}
