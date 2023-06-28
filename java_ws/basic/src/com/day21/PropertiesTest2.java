package com.day21;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {
	public static void main(String[] args) {
		Properties prop = new Properties();

		//파일로부터 데이터 저장하기
		try {
//			★void java.util.Properties.load(InputStream inStream) throws IOException
			prop.load(new FileInputStream("text/input.txt"));
		}catch(IOException e) {
			System.out.println("예외 : " + e.getMessage());
		}
		
		//읽어오기
		String name = prop.getProperty("name");
		String data = prop.getProperty("data");
		
		System.out.println("name : " + name);
		System.out.println("data : " + data);
		
	}

}
