package com.company.java010_ex;

class Student {
    String name = "홍길동";           //인스턴스 변수 - heap - new - 생성자 - this
    int kor = 90;                   //인스턴스 변수
    int eng = 85;                 	//인스턴스 변수
    static int studentCount = 0;    //클래스 변수 - method

    //static int total = kor + eng;   //클래스 변수				클래스변수(total) 인스턴스변수(kor + eng) > 타입이 맞지않다.

    static int maxScore = 100;      //클래스 변수

    public Student() {				//생성자
        studentCount++;             
    }

    public int getTotalScore() {	//인스턴스 매서드
        return kor + eng;        
    }

    public static void showStudentCount() {						//클래스 매서드
        System.out.println("전체 학생 수: " + studentCount);  
    }

   public static void showName() {								//클래스 매서드
   //      System.out.println(name);  							//클래스 매서드에는 클래스 변수(변수가 인스턴스 변수라서)
   }

    public void showInfo() {									//인스턴스 매서드
        System.out.println("이름: " + name);            
        System.out.println("총점: " + getTotalScore());    
    }
}

public class MemberVarEx002 {
    public static void main(String[] args) {					//지역변수 : args
        Student s1 = new Student();     
        Student s2 = new Student();     

        s1.showInfo();                  
        Student.showStudentCount();    							//지역변수 : s1, s2
    }
}

/*
 	초기화 : 				기본값					명시적초기화					초기화블록			생성자
 	studentCount		0						0							x				0				
 	maxScore			0						100							x				100				
 	s1(name,kor,eng)	name=null,kor=0,eng=0	name=홍,kor=90,eng=85		x				name=홍,kor=90,eng=85	
 	s2(name,kor,eng)	name=null,kor=0,eng=0	name=홍,kor=90,eng=85		x				name=홍,kor=90,eng=85
 */


/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
클래스 : MemberVarEx002.class ,Student.class
static 함수 : Student.showStudentCount(), Student.showName(), Student.studentCount, Student.maxScore
------------------------------------

[heap: 동적]            			   | [stack : 잠깐빌리기]
2번지
{name=홍, kor=90, eng=85 /			<- s2[2번지]
getTotalScore(), showInfo()}	
1번지
{name=홍, kor=90, eng=85 /			<- s1[1번지]
getTotalScore(), showInfo()}		
------------------------------------
*/