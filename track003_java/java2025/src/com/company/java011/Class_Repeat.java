package com.company.java011;

//1. 클래스는 부품객체
//2. 클래스는 상태와 행위
/* 						기본값		명시적초기화			초기화블록				생성자
 (static)company		null		(주) 703toyland		(주) 703toyland		X					Toy.name
 (static)num			0			X	0				O	0				X					Toy.age
 
 		kitty	{name=null, age=0}	유지					유지					유지					this.name
 		gundam	{name=null, age=0}	유지					유지					{name="건담", age=40}this.age
 */
//[설계도] 1단계
/*
class Toy {
	//상태 : 멤버변수
	private String name; //인스턴스 변수
	private int age;
	static final String company="(주) 703toyland"; // Toy.company  클래스.변수  ,  클래스변수
	static int num;		//클래스변수 ( 공용 )
	static {num=0;}
	
	//행위 : 멤버함수
	public void show() {
		System.out.println("NAME : " + this.name);
		System.out.println("age : " + this.age);
		
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Toy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Toy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
*/	
	public class Class_Repeat{
		public static void main(String[] args) {
			Toy kitty = new Toy(); //[장난감]2단계			1)new 메모리, 객체		2)생성자	3)kitty 번지
			kitty.setName("할로윈키티");
			kitty.setAge(3);
			kitty.show();
			Toy gundam = new Toy("건담", 47);
			gundam.show();
		}
	}

/*
 * method[클래스정보]
 * 
 * heap[동적]		| stack [임시저장공간] 
 * 
 * 
 * 
 */
