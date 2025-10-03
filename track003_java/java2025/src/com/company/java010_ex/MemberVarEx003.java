package com.company.java010_ex;

 
class LunchTray {
    String owner;        						//인스턴스 변수 - heap area - new 0 - 생성자 0 - this 0
    int rice = 90;               				//인스턴스 변수
    int soup = 85;               				//인스턴스 변수

    static int trayCount = 0;      				//클래스 변수 - method area - new x - 생성자 x - this x

    //static int totalFood = rice + soup;			//클래스 변수
    											// 좌 : 클래스 변수 / 우 : 인스턴스 변수
    static int maxRice = 100;       

    public LunchTray() {						//생성자
    	trayCount++;
    	this.owner = "std-" + trayCount;
    	
    }
    
    public int getFoodAmount() {				//인스턴스 메서드
        return rice + soup;         
    }

    public static void showTrayCount() {		//클래스 메서드
        System.out.println("전체 급식판 수: " + trayCount);   
    }

    public static void showOwner() { 			//클래스 메서드
    //   System.out.println(owner);				// 클래스 메서드 안에 인스턴스 변수
    }

    public void showTray() {					//인스턴스 메서드
        System.out.println("\n\n:: 주인 이름: " + this.owner);                
        System.out.println("총 음식량: " + getFoodAmount());     
    }
}


public class MemberVarEx003 {
   public static void main(String[] args) {		//지역변수 args
        LunchTray tray1 = new LunchTray();   	//지역변수 tray1
        tray1.showTray();                    
        LunchTray.showTrayCount();         

        LunchTray tray2 = new LunchTray();   	//지역변소 tray2
        tray2.showTray();                   
        LunchTray.showTrayCount();         
   }
}

/*
	초기화 : 					기본값						명시적초기화						초기화블록			생성자
	trayCount				0							0								x				2				
	maxRice					0							100								x				100				
	tray1(owner,rice,soup)	owner=null,rice=0,soup=0	owner=null,rice=90,soup=85		x				owner=std-1	,rice=90,soup=85
	tray2(owner,rice,soup)	owner=null,rice=0,soup=0	owner=null,rice=90,soup=85		x				owner=std-2,rice=90,soup=85
*/


/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
클래스 : MemberVarEx003.class ,LunchTray.class
static 함수 : LunchTray.showTrayCount(), LunchTray.showOwner() / static 변수 : LunchTray.trayCount, LunchTray.maxRice
------------------------------------

[heap: 동적]            			   | [stack : 잠깐빌리기]
2번지
{owner=null,rice=90,soup=85 /		<- tray2[2번지]
getFoodAmount(), showTray()}	
1번지
{owner=null,rice=90,soup=85 /		<- tray1[1번지]
getFoodAmount(), showTray()}		
------------------------------------
*/