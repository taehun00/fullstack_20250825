package com.company.java013;

//1. 클래스는 부품객체
//2. 부품객체는 상태(멤버변수)와 행위(멤버함수)
//3. 상속 : 클래스의 재사용 , 단일상속
//4. 인터페이스 : can do this , 다중상속

/*		Papa(brain)		Mama(brain)					 Animal		{ Company="(주)동물농장" / eat() }
 * 				↑		↑							↑		↑
 * 				  Son()							Saram		Pig
 * 												{@eat()}  {@eat()}
 * 
 * 												1. 부모 = 자식	하나(부모)의 자료타입으로 여러타입(자식들)을 관리
 * 												2. 업캐스팅, 타입캐스팅 X, 부모가 메서드 사용시 자식의 메서드가 호출 @Override
 */				



class Papa{
	int brain;
}
class Mama{
	int brain;
}
// class Son extends Papa, Mama{}

interface Animal2{
	String Company="(주)동물농장"; // public static final - 클래스변수, Animal.Company, method area
	void eat(); // public abstract 메서드
}

class Saram implements Animal2{

	@Override
	public void eat() {
		//Company = "kakao";
		// TODO Auto-generated method stub
		System.out.println(Animal.Company + "삼겹살");
		
	}
	
}

class Pig implements Animal2{

	@Override
	public void eat() {
		//Company = "kakao";
		// TODO Auto-generated method stub
		System.out.println(Animal.Company + "돼지");
		
	}
	
}

public class Interface001 {
	public static void main(String[] args) {
		//A1
		Animal2 [] anis = {new Saram(), new Saram(), new Pig() };
		
		
	}
}
