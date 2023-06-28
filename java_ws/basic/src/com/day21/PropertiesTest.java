package com.day21;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		/*
		 	Properties 컬렉션
		 		- Map 인터페이스의 구현 클래스
		 		- HashMap의 구버전인 Hashtable을 상속받아 구현한 것
		 		- (String, String)의 형태로 저장
		 		- 주로 어플리케이션의 환경설정과 관련된 속성을 저장하는데 사용
		 	데이터를 파일로부터 읽고 쓰는 기능 제공
		*/
		
		Properties prop = new Properties();
		
		//저장
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
	
		//읽어오기
		System.out.println("size = " + prop.getProperty("size"));
		System.out.println("language = " + prop.getProperty("language"));
		System.out.println("timeout = " + prop.getProperty("timeout"));
		System.out.println("capacity = " + prop.getProperty("capacity"));
		System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));
		
		System.out.println("\n=========================");
		Enumeration en = prop.propertyNames();
		while(en.hasMoreElements()) {
			String element = (String)en.nextElement();
			System.out.println(element + " => " + prop.getProperty(element));
		}//while
		
	}
	

}
