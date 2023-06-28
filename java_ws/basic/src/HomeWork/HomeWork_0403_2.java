package HomeWork;

import java.util.Scanner;

class FoodSale{
    protected String menu;
    protected int qty;
    protected int cost;
    protected int price = 0;
    protected static int totalPrice = 0;
    
    FoodSale(int qty, int cost){
        this.qty = qty;
        this.cost = cost;
    }

    public int getPrice() {
        return qty*cost;
    }
    public void calculatePrice() {
        price = getPrice();
        totalPrice += price;
    }   
}

class StudentFoodSale extends FoodSale{
    private double discount = 0.1;
    private int discountPrice = 0;
    private static int discountTotalPrice = 0;

    StudentFoodSale(int qty, int cost){
        super(qty, cost);
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        discountPrice = (int)(getPrice() * discount);
        totalPrice -= discountPrice;
        discountTotalPrice += discountPrice;
    }
    
    public int getDiscountPrice() {
        return discountPrice;
    }
    
    public int getTotalPrice() {
        return totalPrice;
    }
    
    public int getDiscountTotalPrice() {
        return discountTotalPrice;
    }
}

public class HomeWork_0403_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(;;) {
	        System.out.println("메뉴, 수량, 단가, 학생여부 <Y/N>를 입력하세요! ");
	        String menu = sc.nextLine();
	        int qty = sc.nextInt();
	        int cost = sc.nextInt();
	        sc.nextLine();
	        String stu = sc.nextLine();
	        
	        if(stu.equalsIgnoreCase("Y")) {
	            StudentFoodSale stud = new StudentFoodSale(qty, cost);
	            stud.calculatePrice();
	            System.out.print("판매금액 : " + stud.getPrice());
	            System.out.print(", 누적판매금액 : " + stud.getTotalPrice());
	            System.out.println(", 누적할인금액 : " + stud.getDiscountTotalPrice());
	        }else if(stu.equalsIgnoreCase("N")) {
	        	FoodSale food = new FoodSale(qty, cost);
	        	food.calculatePrice();
	        	System.out.print("판매금액 : " + food.getPrice());
	        	System.out.println(", 누적판매금액 : " + FoodSale.totalPrice);
	        }else {
	        	System.out.println("잘못입력하셨습니다");
	        }
	        
	       System.out.println("그만하시겠습니다? <Q>uit.");
	       String stop = sc.nextLine();
	       if(stop.equalsIgnoreCase("Q")) {
	    	   System.out.println("종료되었습니다. ");
	    	   break;
	       }
        }
    }
}
