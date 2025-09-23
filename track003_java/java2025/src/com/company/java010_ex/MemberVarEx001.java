package com.company.java010_ex;

class Sawon3{ // method : 정보저장    heap : 실체화(객체-인스턴스)저장
    int pay      =10000;    	//인스턴스 변수 - heap area - new 0 - 생성자 0 - this
    static int su=10;     		//클래스 변수 - method - new x - 생성자 x - 바로 사용이 가능
    static int basicpay=pay;    //클래스 변수 
    							// static은 this 사용불가 / 당장사용해야하는데 this를 쓰려면 new 하고 난 다음에
    static int basicpay2;    	//클래스 변수
    
    public static void showSu() {   System.out.println(su);  }
    //클래스 메서드 - method area - new x - 생성자 x - Sawon3.showSu() > 바로사용
    public static void showPay() {   System.out.println(this.pay);  } //static은 this 사용불가
    //클래스 메서드
  
    public  void  showAll001() {   			//인스턴스 메서드
       System.out.println(su);  			// static 사용가능 - new 전에 메모리상에 static 올라가 있어서
       System.out.println(this.pay);  		// 
    } 
    public static  void  showAll002() {   //클래스 메서드
        showAll001();    				//
       System.out.println(this.pay);  // static 은 this 사용불가
    } 
} 


public class MemberVarEx001 {
	public static void main(String[] args) {	// args 지역변수
		   Sawon3   sola = new Sawon3();  // 1) new 번지, 객체생성 2) 생성자 초기화 3) sola 번지 줌.
		   sola.showAll001();					// sola 지역변수
		  }
}
