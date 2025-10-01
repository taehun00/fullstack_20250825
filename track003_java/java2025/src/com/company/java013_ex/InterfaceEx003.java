package com.company.java013_ex;

import java.util.Arrays;

interface Launch {
    int MONEY = 10000;
    void jomoon();
    void eat();
}
class Burger      implements Launch{ 
   int price;
   public Burger() { this.price = 3900; }
   @Override public String toString() { return "Burger"; }
   @Override public void jomoon() { System.out.println("버거하나요~"); }
   @Override public void eat() { System.out.println("Burger 냠냠!"); } 
}
class KimchiStew  implements Launch{ 
   int price;
   public KimchiStew() { this.price = 4000; }
   @Override public String toString() { return "KimchiStew"; }
   @Override public void jomoon() { System.out.println("김치찌개하나요~"); }
   @Override public void eat() { System.out.println("KimchiStew 냠냠!"); } 
}
class User {  
	int price1 = 0; // 주문금액 담기
    int money = Launch.MONEY;
    int cnt=0;
    Launch[] plate = new Launch[3];
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int money, int cnt, Launch[] plate) {
		super();
		this.money = money;
		this.cnt = cnt;
		this.plate = plate;
	}
	@Override
	public String toString() {
		return "User [money=" + money + ", cnt=" + cnt + ", plate=" + Arrays.toString(plate) + "]";
	}
	public int getMoney() { return money; }
	public void setMoney(int money) { this.money = money; }
	public int getCnt() { return cnt; }
	public void setCnt(int cnt) { this.cnt = cnt; }
	public Launch[] getPlate() { return plate; }
	public void setPlate(Launch[] plate) { this.plate = plate; }
    
    void order(Launch a) {
    	
    	//메뉴주문은 order로 돼있는데 order에서 주문메뉴 출력하는지(출력은 다 show로 했음)
    	//잔액 부족 시 주문 거절 못함(if문 써서 하면되는데 주문 취소를 해야할 거 같은데 그걸 못함(머리아픕니다))
    	//오늘 날짜 못함(???)
    	
    	if (a instanceof Burger) {
    		price1 += ((Burger) a).price;
    	}
    	if (a instanceof KimchiStew) {
    		price1 += ((KimchiStew) a).price;
    	}
    	
    	
    	if (a instanceof Burger) {
    		money -= ((Burger) a).price;
    	}
    	if (a instanceof KimchiStew) {
    		money -= ((KimchiStew) a).price;
    	}
    	if(cnt < plate.length) {
    		plate[cnt++]=a;
    	}
    }
    
    void show() {
		
		 for(int i=0;i<cnt;i++) { 
		 	plate[i].jomoon();
		 	plate[i].eat(); 
		 }
		 
    	
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	System.out.print("주문 : ");
    	for(int i=0; i<cnt;i++) {
    		System.out.print(plate[i].toString());
    		if (i<cnt-1) {
    			System.out.print(", ");
    		}
    	}
    	System.out.println();
    	
    	System.out.println("주문금액 : " + price1);
    	
    	System.out.println("잔액 : " + money);
    	
    	for(int i=0; i<cnt;i++) {
    		plate[i].eat();
    	}
    }
    
}

public class InterfaceEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User launch_order = new User();
		
        //리턴값 메서드명(파라미터)
		launch_order.order(new Burger());   //void order(Launch a){}
		launch_order.order(new KimchiStew());   //Launch a = new Kimchi()  부모=자식
		launch_order.order(new Burger());   //Launch a = new Burger()  부모=자식
		      
		launch_order.show();//리턴값 메서드명(파라미터)
		// void   show(){}
	}

}
