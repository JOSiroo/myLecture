
 

/*
 * 전화번호 관리 프로그램
 * Version 0.3
 * PhoneBookManager 클래스 이용
 */
/*
import java.util.Scanner;

class PhoneBookManager{	
	private Scanner sc=new Scanner(System.in);
	private PhoneInfo[] infoStorage=new PhoneInfo[100];
	private int index=0;
	
	public void inputData()	{
		if (index==100){
			System.out.println("\n더 이상 데이터를 입력할 수 없습니다!!\n");
			return;
		}

		System.out.println("\n데이터 입력을 시작합니다..");
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("전화번호: ");
		String phone=sc.nextLine();
		System.out.print("생년월일: ");
		String birth=sc.nextLine();
		
		infoStorage[index++]=new PhoneInfo(name, phone, birth);
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
			infoStorage[dataIdx].showPhoneInfo();
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
			for(int i=dataIdx; i<index-1; i++)	{
				infoStorage[i]=infoStorage[i+1];
			}

			index--;
			System.out.println("데이터 삭제가 완료되었습니다. \n");
		}
	}
	
	private int search(String name){
		int idx=-1;

		for(int i=0; i<index; i++)	{
			PhoneInfo curInfo=infoStorage[i];

			if(name.equals(curInfo.getName()))
				idx=i;
		}

		return idx;
	}
	
	public void queryAllData(){
		if (index==0){
			System.out.println("데이터가 존재하지 않습니다.\n\n");
			return;
		}

		System.out.println("----------전체 데이터 조회----------");
		for(int i=0; i<index; i++)	{
			infoStorage[i].showPhoneInfo();
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

class PhoneBookVer03{	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		PhoneBookManager manager=new PhoneBookManager();
		int choice=0;
		
		while(true)	{
			manager.showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
				case 1:
					manager.inputData();
					break;
				case 2:
					manager.queryAllData();
					break;
				case 3:
					manager.searchData();
					break;
				case 4:
					manager.deleteData();
					break;				
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 선택하였습니다. 다시 선택하세요\n");
					continue;
			}
		}//while
	}//main
}
*/