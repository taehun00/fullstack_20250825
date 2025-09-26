package com.company.java011_ex;

class Color{
	String name;
	private int num;
	@Override
	public String toString() {
		return "Color [name=" + name + ", num=" + num + "]";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void show() {
		System.out.println("hi");
	}
}

class Green extends Color{
	
	public void show() {
		System.out.println("GREEN");
		System.out.println("Name : " + this.name);
		System.out.println("Num : " + this.getNum());
	}
}

public class ExtendsEx001 {
	public static void main(String[] args){
        Green mygreen = new Green();
        mygreen.name = "LIGHT_GREEN";
        //mygreen.num = 5;
        mygreen.setNum(5);
        mygreen.show();
        
        Color mycolor = new Color();
        mycolor.show();
    }
}
/*
Object						■3. Object(){											} ■4.
↑
Color 클래스    				■2. Color(){ name = null 			/ num = 0 			} ■5.
↑
Green 클래스   void show(){}  ■1. Green(){							show()			} ■6.
							■0. 1번지)
---
Green mygreen = new Green();
---
1. Green은 Color이다, Green은 Object이다 ( 속이 빈 화살표 실선 )
2. 생성자호출 : Green() -> Color() -> Object()
3. 객체생성 : Object -> Color -> Green
*/
