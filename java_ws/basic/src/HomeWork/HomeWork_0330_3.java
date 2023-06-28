package HomeWork;

import java.util.Scanner;

 class PhoneInfo{
	private String name;
	private String phoneNum;
	private String birth;
	
	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		
	}
	
	
	public void showInfo(String name, String phoneNum) {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNum + "\n");
	}
	public void showInfo(String name, String phoneNum, String birth) {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNum);
		System.out.println("birth : " + birth + "\n");
	}
	
	
}


public class HomeWork_0330_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String phoneNum = "";
		String birth = "";
		
		for(;;) {
			System.out.println("선택하세요...\n1. 데이터 입력\n2. 프로그램 종료 ");
			int menu = sc.nextInt();
			System.out.println("선택 : " + menu);
			sc.nextLine();
					
			if(menu == 1) {
				System.out.print("이름 : ");
				name = sc.nextLine();
				System.out.print("전화번호 : ");
				phoneNum = sc.nextLine();
				System.out.print("생년월일 : ");
				birth = sc.nextLine();
				// 1. 데이터 입력 시 사용자 정보 입력.
				if(birth.equals("")) {
					PhoneInfo pi = new PhoneInfo(name, phoneNum);
					System.out.println("\n========입력된 정보 출력=======\n");
					pi.showInfo(name, phoneNum);
				}else {
					PhoneInfo pi = new PhoneInfo(name, phoneNum, birth);
					System.out.println("\n========입력된 정보 출력=======\n");
					pi.showInfo(name, phoneNum, birth);
				}
			}else if(menu == 2){
				System.out.println("종료합니다. ");
				break;
			}else {
				System.out.println("잘못 선택하셨습니다 ");
				continue;
			}
			
		}
		
		
	}

}
