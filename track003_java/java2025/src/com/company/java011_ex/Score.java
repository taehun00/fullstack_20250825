package com.company.java011_ex;

public class Score{
   private String name;
   private int kor, eng, math , total;
   private double aver;
   private String p  , s  , rank;
   
  
   
   
   
   
   public Score(String name, int kor, int eng, int math) {
	super();
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
}

   public Score() {
	super();
	// TODO Auto-generated constructor stub
}
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getKor() {
	return kor;
   }
   public void setKor(int kor) {
	this.kor = kor;
   }
   public int getEng() {
	return eng;
   }
   public void setEng(int eng) {
	this.eng = eng;
   }
   public int getMath() {
	return math;
   }
   public void setMath(int math) {
	this.math = math;
   }
   public int getTotal() {
	return total;
   }
   public void setTotal(int total) {
	this.total = total;
   }
   public double getAver() {
	return aver;
   }
   public void setAver(double aver) {
	this.aver = aver;
   }
   public String getP() {
	   return p;
   }
   public void setP(String p) {
	   this.p = p;
   }
   public String getS() {
	   return s;
   }
   public void setS(String s) {
	this.s = s;
   }
   public String getRank() {
	return rank;
   }
   public void setRank(String rank) {
	this.rank = rank;
   }
   public static void info() {
	// TODO Auto-generated method stub
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	   System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부 \t 장학생 \t 랭킹");
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
   }
   
   public int total() {
	   total = kor+eng+math;
	   return total;
   }
   public Double aver() {
	   aver = total/3.0;
	   return aver;
   }
   
   public String p() {
	   if(aver>=60) return "합격";
	   else return "불합격";
   }
   
   public String s() {
	   if(aver>=95) return "장학생";
	   else return "x";
   }
   
   public String rank() {
	   String result ="";
	   for(int i=0;i<(int)aver/10;i++) {
		   result += "*";
	   }
	   return result;
   }
   public void show() {
	   System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total() + "\t" + String.format("%.2f",aver()) + "\t" + p() + "\t" + s() + "\t" + rank());
   }
   
}
