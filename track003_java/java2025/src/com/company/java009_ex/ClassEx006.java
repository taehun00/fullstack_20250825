package com.company.java009_ex;


class Score{
	String stdid;
	int kor, eng, math;
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(String stdid, int kor, int eng, int math) {
		super();
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return this.kor+this.eng+this.math;
	}
	public double avg() {
		return (this.kor+this.eng+this.math)/3.0;
	}
	
	void info() {
		System.out.println("학번\tkor\teng\tmath\ttotal\tavg");
		System.out.println(this.stdid + "\t" + this.kor + "\t" + this.eng + "\t" + this.math + "\t"
							+ total() + "\t" + String.format("%.2f",avg()));
	}
}

public class ClassEx006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		
		s1.info();
	}

}
