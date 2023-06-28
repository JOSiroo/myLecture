package HomeWork;

import java.util.Scanner;

class RSPgame{
		//멤버변수
		private int userNum;
		private int comNum;
		private static int totalScore;
		
		//생성자
		public RSPgame(int userNum) {
			this.userNum = userNum;
		}
		
		//메소드 
		//1. 컴퓨터의 랜덤값 (setter) 
		public void setComNum() {
			comNum = (int)(Math.random()*3);
		}
		
		//2. 유저 입력값과 컴퓨터 랜덤값 비교해서 승/무/패 판단
		public String judge() {
			int resultNum = (userNum - comNum + 3) % 3;
			String result = "";
			if(userNum > 2) {
				result = "잘못 입력하셨습니다 !!!";
				return result;
			}
			if(resultNum == 1) {
				result = "이겼습니다 ";
				totalScore++;
			}else if(resultNum == 2) {
				result = "졌습니다 ";
				totalScore--;
			}else if(resultNum == 0) {
				result = "비겼습니다 ";
			}
			return result;
		}
		
		//getter/setter
		public static int getTotalScore() {
			return totalScore;	
		}
		
		public int getComNum() {
			return comNum;
		}
		
		// 숫자 => 가위,바위,보 변환하는 메소드
		public String RSP(int input) {
			String RSP = "";
			switch(input) {
			case 0:
				RSP = "가위";
				break;
			case 1:
				RSP = "바위";
				break;
			case 2:
				RSP = "보";
				break;
			}
			return RSP;
		}
		
	}



public class HomeWork0330_2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
			for(;;) {
				System.out.println("가위 <0>, 바위 <1>, 보 <2> \n<Q>종료");
				String input = sc.nextLine();
				if(input.equals("Q")) break;
				int userNum = Integer.parseInt(input);
				
				RSPgame RSP = new RSPgame(userNum);
				RSP.setComNum();
				System.out.println(RSP.RSP(userNum) + "  나");
				System.out.println(RSP.RSP(RSP.getComNum()) +"  컴퓨터");
				
				String result = RSP.judge();
				System.out.println(result);
				
				int totalScore = RSPgame.getTotalScore();
				System.out.println("총점은 : " + totalScore);
			}
		}
	}

