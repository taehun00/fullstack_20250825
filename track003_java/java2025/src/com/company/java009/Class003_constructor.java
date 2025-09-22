package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class Car31{} // 생성자 Car31() - 컴파일러가 기본생성자를 자동생성
class Car32{
	String color;
	// alt + shift + s      ★ 밑에서 3번째(2, 3, 4)

	public Car32(String color) {
		super();
		this.color = color;
	}

	public Car32() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car32 [color=" + color + "]";
	}
	
}

public class Class003_constructor {
	public static void main(String[] args) {
		Car31 car1 = new Car31(); // 1.new (메모리빌리고, 객체생성) 2. Car31() 초기화 3. car1 번지
		System.out.println(car1);
		
		Car32 car2 = new Car32();
		System.out.println(car2 + "\t" + car2.color);
		
		Car32 car3 = new Car32("red");
		System.out.println(car3 + "\t" + car3.color);
	}

}


/*
 * 1. 클래스 : 설계도 ex) Car31, Car32, Class003_constructor 
 * 2. 객체 : 결과물 장난감 ex) car1, car2, car3
 * 3. 인스턴스 : 각각의 장난감들 각각 ex) car1 (x), car2.color (null), car3.color (red)
 * 
*/
