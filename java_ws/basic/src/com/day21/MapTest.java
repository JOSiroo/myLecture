package com.day21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		/*
	 		Map 	- 키와 값을 한 쌍으로 하여 저장하는 자료구조
	 				- 순서가 유지되지 않으며, 키는 중복허용 안되고 값은 중복 가능
		*/
		
		HashMap<Integer, String> map = new HashMap<>();
		
		//저장
		map.put(11, "홍길동");
		map.put(13, "홍길동");
		map.put(12, "홍길동");
		map.put(19, "홍길동");
		
		System.out.println("1번 학생 : " + map.get(1));	//key를 이용하여 값을 읽어온다
		
		System.out.println("\nsize = " + map.size());
		
		map.remove(3);		//3번 키에 해당하는 값 제거
		
		//읽어오기
		//Set<K> keySet() : Returns a Set view of the keys contained in this map
				//Set<Integer> keys = map.keySet();
				//Iterator<Integer> iter = keys.iterator();
/*한줄에 입력 가능=>*/Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			int key = iter.next();
			String value = map.get(key);
			System.out.println("key = " + key + ", value = " + value);
		}//while
	
	}

}
