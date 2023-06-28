package com.day22;

import java.util.Date;
import java.util.Scanner;



public class StringTest3 {

	public static void main(String[] args) {
		
		Date d = new Date();
		long l = d.getTime();
		
		System.out.println(l);
		
		String txt = "test.txt";
		int txtIdx = txt.lastIndexOf(".");
		String ext = txt.substring(txtIdx);
		String fileName = txt.substring(0, txtIdx);
		System.out.println("FileName : " + fileName + ", Extension : " + ext);

		String str = "안녕하세요\r\n 저는 홍길동입니다.";
		String ss  = str.replaceFirst("\r\n", "<br>");
		System.out.println(ss);

		String dir = "c:\\shop\\upload\\test.txt";
		String directory = "";
		fileName = "";
		int dirIdx = dir.lastIndexOf(".");
		int dirIdx1 = dir.lastIndexOf("\\");
		ext = dir.substring(dirIdx+1);
		fileName = dir.substring(dirIdx1+1, dirIdx);
		directory = dir.substring(0, dirIdx1);
		System.out.println("폴더 : " + directory + "\n파일명 : " + fileName + "\n확장자 : " + ext);

		Scanner sc = new Scanner(System.in);

		System.out.println("URL주소를 입력하세요");
		String url = sc.nextLine();

		if(url.indexOf("http://www.mall.com") >= 0){
			System.out.println("해당 URL 주소 : " + url);
		}else {
			System.out.println("url주소가 적합하지 않습니다");
		}
		System.out.println("주민등록번호를 입력하세요 <하이픈없이 입력>");

		try {
			String idNo = sc.nextLine();
			String birth = idNo.substring(0, 2) + "년, " + idNo.substring(2, 4) + "월, " + idNo.substring(4, 6) + "일, ";
			String gender = "";
			String generation = "";

			if(idNo.length() != 13) {
				throw new Exception();
			}
			char genCheck = idNo.charAt(6);
			switch(genCheck) {
			case '1' :
				gender = "남";
				generation = "19";
				break;
			case '3' : 
				gender = "남";
				generation = "20";
				break;
			case '2' : 
				gender = "여";
				generation = "19";
				break;
			case '4' : 
				gender = "여";
				generation = "20";
				break;
			default :
				System.out.println("잘못된 주민등록번호입니다");
				return;
			}
			String info = generation + birth + gender;
			System.out.println(info);

		}catch(Exception e) {
			System.out.println("오류발생 : " + e.getLocalizedMessage());
		} 

	}
}
