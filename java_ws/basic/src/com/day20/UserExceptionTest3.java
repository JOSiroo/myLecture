package com.day20;

import java.util.*;

class IdNoException extends Exception{
	
	IdNoException(String massage){
		super(massage);
	}
}

public class UserExceptionTest3 {
	public static String idNo() throws IdNoException{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 14자리를 입력하세요");
		String idNo = sc.nextLine();
		if(idNo.length() != 14) {
			throw new IdNoException("입력하신 주민등록번호가 14자리가 아닙니다.");
		}
		return idNo;
	}
	public static void main(String[] args) {
		try{
			String idNo = idNo();
			System.out.println("주민번호 : " + idNo);
		}catch(IdNoException id) {
			System.out.println("에러발생 : " + id.getMessage());
		}
		
	
	}

}
