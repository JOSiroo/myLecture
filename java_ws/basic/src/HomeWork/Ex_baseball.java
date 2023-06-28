package HomeWork;

import java.util.Scanner;

//야구 게임 - 3개의 숫자중 자리수까지 맞히면 strike, 숫자만 맞추면 ball
/*컴퓨터가 만든 0~9 사이의 임의의 세 수를 맞추는 야구 게임
[1] 0~9 사이의 임의의 세 수를 만드는 투수
[2] 이를 맞추려고 0~9 사이의 서로 다른 세 수를 입력하는 타자
[3] 둘을 비교하는 심판이 필요

스트라이크 - 투수가 만든 수와 타자에서 입력받은 수의 자리와 값이 같으면 스트라이크
볼 - 자리가 다르고 값이 같으면 볼

*/
class Ex_baseball{
	public static void main(String[] args)	{	
		Scanner sc = new Scanner(System.in);

		while (true){
			play();

			System.out.print("\n계속하시겠습니까?(Y/N) : ");
			String quit = sc.nextLine();
			if (quit.equalsIgnoreCase("N")) break;
		}
	}//main

	public static void play()	{		
		Pitcher pi = new Pitcher();  //투수
		Hitter hi = new Hitter();  //타자
		Umpire um = new Umpire();  //심판

		pi.makeNum();  //정답
		boolean isWin = false;

		for (int count=1;count <=10;count++){
			int[] hit=makeUserNum();		 //사용자가 입력한 값
			hi.setHit(hit);

			int cnt = um.strike(hi, pi);
			if (cnt == 3)	{				
                System.out.println("\nYou Win in "+count);
                isWin = true;
                break;
            }else{               
               System.out.println("\n반복회수:"+count +"번, "+um.strike(hi, pi) + " Strike!! "
					  + um.ball(hi, pi) +" Ball!!\n");
               isWin = false;
            }
        }//for

        if (!isWin){
            System.out.println("\nYou Lose, Pitcher is ");
            for(int n : pi.getPit()){
				System.out.print(n + "\t");
			}
			System.out.println();
        }
	}//play	

	public static int[] makeUserNum()	{
		Scanner sc = new Scanner(System.in);
		int[] hit=new int[3];

		System.out.println("다른 세 수를 입력하세요(0~9)");
		for (int i=0;i<hit.length ;i++ ){			
			int temp = sc.nextInt();
			hit[i] = temp;
			//중복제거
			for (int j=0;j<i ;j++ ){
				if (hit[j] == temp)	{
					i--;
					break;
				}
			}
		}//for

		return hit;
	}//makeUserNum

}//class

class Pitcher{  //투수, 정답, 0~9 중 숫자 3개를 배열에 저장
	private int[] pit = new int[3];

	public int[] getPit(){
		return pit;
	}
	public void setPit(int[] pit)	{
		this.pit=pit;
	}

	public void makeNum()	{
		for (int i=0;i<pit.length ;i++){
			int temp = (int)(Math.random()*10);  //0~9
			pit[i] = temp;
			//중복제거
			for (int j=0;j<i ;j++ ){
				if (pit[j] == temp)	{
					i--;
					break;
				}
			}
		}//for

	}
}

class Hitter{  //타자,  사용자가 입력한 값 3개를 배열에 담는다
	private int[] hit = new int[3];

	public int[] getHit(){
		return hit;
	}
	public void setHit(int[] hit){
		this.hit=hit;
	}
}

class Umpire{  //심판
	 //스트라이크
	//=> 투수가 만든 수와 타자에서 입력받은 수의 자리와 값이 같으면 스트라이크
	public int strike(Hitter h, Pitcher p) { 
		int[] hit = h.getHit();
		int[] pit = p.getPit();

		int count = 0;
		for (int i = 0; i <hit.length; i++){			
			if (hit[i] == pit[i])  
				count++; 
		}

		return count;
	}//

	//볼 - 자리가 다르고 값이 같으면 볼
	public  int ball(Hitter h, Pitcher p) { 
		int[] hit = h.getHit();
		int[] pit = p.getPit();

		int count = 0;
		for (int i = 0; i < hit.length; i++){
			for (int j = 0; j <pit.length; j++){
				if (i!=j && hit[i] == pit[j]) 	
					count++; 
			}
		}//for

		return count;
	}//
}