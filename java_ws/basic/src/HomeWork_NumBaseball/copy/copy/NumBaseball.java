package HomeWork_NumBaseball.copy.copy;

import java.util.Scanner;

public class NumBaseball {

	public static int[] inputNum() {
		Scanner sc = new Scanner(System.in);
		int[] inputNum = new int[3];
		for(int i = 0; i < inputNum.length; i++) {
			inputNum[i] = sc.nextInt();
			if((inputNum[i] > 9 || inputNum[i] < 0)) {						// 범위를 벗어난 숫자 입력시 
				System.out.println("숫자의 범위가 벗어났습니다.\n다시입력");			// i 값 감소 및 재입
				i--;
				continue;
			}
		}
		return inputNum;
	}

	public static void main(String[] args) {

		for(;;) {
			Scanner sc = new Scanner(System.in);
			Pitcher p = new Pitcher();		
			int[] arr = p.getPitNum();			// 3개의 랜덤 배열 생성 
			int gameCnt = 0;		  	// 게임 반복 횟

			//게임 시
			while(gameCnt < 10) {
				System.out.println("서로 다른 번호 3개 입력!! ");
				Hitter h = new Hitter(inputNum());					// h 참조변수에 inputNum()메소드를 이용해 입력한 값 3개 저장 => 

				Umpire u = new Umpire(p, h);						// 심판 생성자에 투수, 타자의 각 인덱스 값을 매개변수에 넣
				gameCnt++;											// 게임카운트 증
				if(u.strike()) {								
					System.out.println("you win in : " + gameCnt);	// 심판 참조변수 스트라이크 메서드로 스트라이크 검사 
					break;
				}
				u.ball();											// 볼 검사 
				System.out.println("반복횟수 : " + gameCnt + "\n");	// 반복횟수 출력 
			}
			System.out.print("정답은 : ");							// 게임 패배시 정답 출력 
			for(int pitcher : arr) {								// 게임 패배시 정답 출력 
				System.out.print(pitcher + "  ");					// 게임 패배시 정답 출력 
			}
			sc.nextLine();
			for(;;) {
				System.out.println("계속 하시겠습니다?  <Y/N>");
				String quit = sc.nextLine();
				if(quit.equalsIgnoreCase("N")) {
					return;
				}else if(quit.equalsIgnoreCase("Y")) {
					break;
				}else {
					System.out.println("잘못 입력!");
				}
			}
		}
	}
}
