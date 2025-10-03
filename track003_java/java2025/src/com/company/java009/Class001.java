package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 속성(멤버변수)와 행위(멤버함수)


class A1{}
////////////////////////////////////
public class Class001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		A1 a = new A1(); // 4-1 new (heap 1번지 공간빌리기, 객체생성)
						 // 4-2 A1() 초기화
						 // 4-3 a 1번지 주소주기
		System.out.println(a); //주소값
		A1 a2 = new A1();
		A1 a3 = new A1();
	}

}
////////////////////////////////////
/* [runtime data area] 
----------------------------
[method : 클래스 정보, static, final : 공용] 1)
	A1.class , Class001.class 2)					클래스 : 설계도
----------------------------
[heap : 동적]			[stack : 잠깐빌리기]			객체(전체)	 : a, a2, a3
3번지 : A1{}				← a3[ 3번지 ]				인스턴스 		 : a, a2, a3
2번지 : A1{}				← a2[ 2번지 ]
1번지 : A1{}				← a[ 1번지 ]
						i[10]
						| main 3)


----------------------------
*/