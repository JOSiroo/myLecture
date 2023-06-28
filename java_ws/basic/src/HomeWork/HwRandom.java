package HomeWork;

import java.util.Scanner;

public class HwRandom {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true){		
			System.out.println("배열의 개수를 입력하세요(짝수로)");
			int n = sc.nextInt();

			ImageArray image = new ImageArray(n);
			image.make();
			image.print();

			System.out.println("\nQuit?(Y/N)");
			sc.nextLine();
			String q = sc.nextLine();
			if(q.equalsIgnoreCase("Y")) break;
		}//while
	}

}

class ImageArray{
	private int []  lot ;
	private int m;//배열의 개수

	public ImageArray(int m){
		this.m = m;
		lot = new int[m];

		//0도 가능하므로 -1로 초기화
		for (int i = 0; i < lot.length; i++){
			lot[i] = -1;
		}
	}

	public ImageArray()	{
		this(24);
	}

	private int numMake() {
		return (int)(Math.random()*(m/2)); //0<=m/2 <6
	}

	//같은 수가 두개씩 임의의 위치에 들어가도록
	public void make() {		
		for(int k=0;k< lot.length;k++){
			int temp = numMake();

			//0, 1개면 더 받을 수 있다.
			if (numCount(temp)<2){
				lot[k] = temp;
			}else{
				k--;
			}
		}//for
	}

	//같은 수가 몇개 있는가?
	private int numCount(int num) {
		int hasS = 0;
		for (int i = 0; i < lot.length; i++){
			if(lot[i]==num){
				hasS++;
			}
		}
		return hasS;
	}

	public void print() {
		for (int i = 0; i < lot.length; i++){
			System.out.print(lot[i] + " ");
		}
	}
}//class