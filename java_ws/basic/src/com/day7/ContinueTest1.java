package com.day7;

public class ContinueTest1 {

	public static void main(String[] args) {
		/*
		 	break 		
		 		- 반복문이나 switch문의 case를 벗어날때 사용
		 	
		 	continue	
		 		- 다음 반복위치로 이동
		 		- 다음 반복위치로 이동
		 		- 반복을 한번 건너뛰고 다음 반복을 실행할 때 사용
		 	
		 	return		
		 		- 메서드의 실행을 종료하고 호출원으로 복귀
		*/
		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) continue;
				System.out.println("i = " + i);
			}
			
			System.out.println("\n=======break=======");
			for(int i = 1; i <= 10; i++) {
				if(i == 5) break;
				System.out.println("i = " + i);
			}//for
			
			System.out.println("\n------중첩for--------");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(j == 1) break;
					System.out.println("i = " + i + ", j=" + j);
				}
			}
			System.out.println("\n======continue======");
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(j == 1) continue;
					System.out.println("i = " + i + ", j=" + j);
					}
			}//for
			
			/*
				이름 붙은 반복문
				- 여러 반복문이 중첩되어 있을 때 반복문 앞에 이름을 붙이고
				break, continue에 이름을 지정해줌으로써 해당 반복문을 벗어나거나
				반복을 건너뛸 수 있다.
			*/
			System.out.println("==========dfsdfsdf=============");
			loop1 : for(int i = 2; i <= 9; i++) {
				for(int j = 1; j <= 9; j++) {
					if(j == 5) {
						//break loop1;
						//continue loop1;
						//break;
						//continue;
					}//if
					
					System.out.println(i + " * " + j + " = " + i * j);
				}//안쪽 for
				
				System.out.println();
			}//바깥 for

	}
}





















