package com.company.java009_ex;


class Student001{
	String name;
	int no, kor, eng, math;
	
	void info() {System.out.printf("이름: %s\n총점: %d\n평균: %.2f",
			this.name,this.kor+this.eng+this.math,((this.kor+this.eng+this.math)/3.0));}
}

public class ClassEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student001 s1 = new Student001();
		s1.name = "first"; s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
		
		s1.info();
	}

}

