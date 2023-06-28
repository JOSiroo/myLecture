package HomeWork;

import java.util.Scanner;

class PhoneInfo1{
		//멤버변수 
	private String name;
	private String PhoneNum;
	private String birth;
		//생성자 
	PhoneInfo1(String name, String phoneNum, String birth){
		this.name = name;
		this.PhoneNum = phoneNum;
		this.birth = birth;
	}	//getter/setter
	PhoneInfo1(String name, String phoneNum){
		this.name = name;
		this.PhoneNum = phoneNum;
	}	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	//메소드 	
	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("Phone : " + PhoneNum);
		if(birth.equals("")) {
			System.out.println();
		}else {
			System.out.println("birth : " + birth);
		}
	}
	public void inputComplete() {
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
}

public class HomeWork_0402_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int listNum = 0;
		PhoneInfo1[] ph = new PhoneInfo1[100];
		
		for(;;) {
			System.out.println("선택하세요... \n1. 데이터 입력 \n2. 전체 데이터 조회 \n3. 데이터 검색 \n4. 데이터 삭제 \n5. 프로그램 종료 ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 5) {
				System.out.println("종료합니다.");break;
			}
			
			switch(menu) {
			case 1:	// 데이터 입력 기능 
				System.out.println("데이터 입력을 시작합니다.. ");
				System.out.print("이름 : ");
				String name = sc.nextLine();
				//sc.nextLine();
				System.out.print("전화번호 : ");
				String phoneNum = sc.nextLine();
				System.out.print("생년월일 : ");
				String birth = sc.nextLine();
					
				if(birth.equals("")) {
					ph[listNum] = new PhoneInfo1(name, phoneNum);
					ph[listNum].inputComplete();
					listNum++;
					break;
				}else {
					ph[listNum] = new PhoneInfo1(name, phoneNum, birth);
					ph[listNum].inputComplete();
					listNum++;
					break;
				}
			case 2:	//데이터 조회 기능 
				System.out.println("-----------전체 데이터 조회------------");
				for(int i = 0; i < listNum; i++) {
					ph[i].showInfo();
				System.out.println("");
				}
				System.out.println("-----------------------------------");
				break;
			case 3: // 데이터 검색 기능
                System.out.println("데이터 검색을 시작합니다..");
                System.out.print("이름 : ");
                String search = sc.nextLine();

                int count = 0; // 검색 결과 수를 카운트하는 변수
                for (int i = 0; i < listNum; i++) {
                    if (search.equals(ph[i].getName())) {
                        ph[i].showInfo();
                        System.out.println("데이터 검색이 완료되었습니다.");
                        count++;
                    }
                }

                if (count == 0) {
                    System.out.println("없는 사용자 입니다.");
                }

                break;

            case 4: // 데이터 삭제 기능
                System.out.println("데이터 삭제을 시작합니다..");
                System.out.print("이름 : ");
                String delete = sc.nextLine();

                int index = -1; // 삭제할 데이터의 인덱스를 저장할 변수
                for (int i = 0; i < listNum; i++) {
                    if (delete.equals(ph[i].getName())) {
                        index = i;
                        break;
                    }
                }

                if (index == -1) {
                    System.out.println("없는 사용자 입니다.");
                } else {
                    for (int i = index; i < listNum - 1; i++) {
                        ph[i] = ph[i + 1];
                    }

                    listNum--;
                    System.out.println("데이터 삭제가 완료되었습니다.");
                }

                break;

            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                break;
			}
		}
	}

}
