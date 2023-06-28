package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;
class PhoneInfo0 {

	protected String name;
	protected String phone;
	
	public PhoneInfo0(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void showPhoneInfo() {
		
	}
}


class PhoneBookManager{	
	private Scanner sc=new Scanner(System.in);
	private ArrayList<PhoneInfo0> infoStorage=new ArrayList<PhoneInfo0>();
	
	public void inputData()	{
		if (infoStorage.size()==100){
			System.out.println("\n더 이상 데이터를 입력할 수 없습니다!!\n");
			return;
		}

		System.out.println("\n데이터 입력을 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();

		infoStorage.add(new PhoneInfo0(name, phone));
		System.out.println("데이터 입력이 완료되었습니다. \n");		
	}
	
	public void searchData(){
		System.out.println("\n데이터 검색을 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else{
			infoStorage.get(dataIdx).showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다. \n");
		}
	}
	
	public void deleteData(){
		System.out.println("\n데이터 삭제를 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		int dataIdx=search(name);
		if(dataIdx<0){
			System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
		}else{
			//0 1 2 3
			//  2 3
			infoStorage.remove(dataIdx);
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
	private int search(String name){
		int idx=-1;

		for(int i=0; i<infoStorage.size(); i++)	{
			PhoneInfo0 curInfo=infoStorage.get(i);

			if(name.equals(infoStorage.get(i).getName()))
				idx=i;
		}

		return idx;
	}
	
	public void queryAllData(){
		if (infoStorage.size() == 0){
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("----------전체 데이터 조회----------");
		for(int i=0; i<infoStorage.size(); i++)	{
			infoStorage.get(i).showPhoneInfo();
		}//for
		System.out.println("------------------------------------- \n");
	}

	public void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 전체 데이터 조회");
		System.out.println("3. 데이터 검색");
		System.out.println("4. 데이터 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택: ");
	}
}

public class HomeWork_0413_PhoneInfo{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		
	}//main
}



