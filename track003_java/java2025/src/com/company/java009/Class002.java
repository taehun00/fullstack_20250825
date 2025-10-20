package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 속성(멤버변수)과 행위(멤버함수)

class Animal002{
	// 속성 - 멤버변수
	String name;
	int	   age;
	// 행위 - 멤버함수
	void show() {System.out.println(this.name + "\t" + this.age); }
}

public class Class002 {
	public static void main(String[] args) {
		//1. new( 1번지, 객체생성 ) 2. Animal002() 초기화 3. a1 주소 = 1번
		Animal002 a1 =new Animal002();
		a1.name = "sally";
		a1.age = 1;
		a1.show();
		
		Animal002 a2 =new Animal002();
		a2.name = "alpha";
		a2.age = 2;
		a2.show();
		
	}
}

/*
-------------------------------------------[runtime data area]
[method: 정보, static, final, : 공용정보 ]
Animal002.class , Class002.class			클래스(설계도)		→ (인스턴스화) 객체(Object a1/a2)
------------------------------------------					→ 인스턴스
[heap : 동적]							| [stack : 잠깐빌리기]]
23,24,25번째 : 2번지{name=alpha , age=2 } ← a2[2번지] a2.show(){ this.name( 2번지의 name ) }
22번째 : 2번지{name=null , age=0}			← a2[2번지]
18,19,20번째 : 1번지{name=sally , age=1 }	← a1[1번지] a1.show(){ this.name( 1번지의 name ) }
17번째 : 1번지{name=null , age=0 }		← a1[1번지]

							| main
*/