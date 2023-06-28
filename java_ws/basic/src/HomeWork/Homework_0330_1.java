package HomeWork;

import java.util.Scanner;

class Student{
	//멤버변수
	private String name;
	private int idNo;
	//생성자
	public Student(String name, int idNo) {
		this.name = name;
		this.idNo = idNo;
	}
	//getter/setter
	public String getName() {
		return name;
	}
		public void setName(String name) {
		this.name = name;
	}
		public int getIdNo() {
		return idNo;
	}
		public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	//메소드 
	public void showInfo() {
		System.out.println("이름은 : " + name);
		System.out.println("학번은 : " + idNo);
	}

}
public class Homework_0330_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] sList = new Student[100];
		int studentNum = 0;
		
		for(;;) {
			System.out.println("1.저장 2.전체학생 조회 3.종료  선택 ");
			String menu = sc.nextLine();
		
			if(menu.equals("1")) {
				System.out.println("이름, 학번을 입력하시오 ");
				String name = sc.nextLine();
				int idNo	= sc.nextInt();
				sList[studentNum] = new Student(name, idNo);
				sc.nextLine();
				studentNum++;
			}
			else if(menu.equals("2")){
				System.out.println("========학생 리스트========");
				for(int i = 0; i < studentNum; i++) {
					sList[i].showInfo();
					System.out.println("");
				}
			}
			else if(menu.equals("3")){
				System.out.println("종료합니다. ");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

		
		}
	}
}

