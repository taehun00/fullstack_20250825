package com.company.java011_ex;

public class Pet{  
   private String name;  
   private int walkTime, snackCount, cuddleCount, moodScore;  
   private String snackStars, tailWag, todayMessage;
   public Pet() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Pet(String name, int walkTime, int snackCount, int cuddleCount) {
	super();
	this.name = name;
	this.walkTime = walkTime;
	this.snackCount = snackCount;
	this.cuddleCount = cuddleCount;
   }
   
   @Override
	public String toString() {
		return "Pet [name=" + name + ", walkTime=" + walkTime + ", snackCount=" + snackCount + ", cuddleCount="
				+ cuddleCount + ", moodScore=" + moodScore + ", snackStars=" + snackStars + ", tailWag=" + tailWag
				+ ", todayMessage=" + todayMessage + "]";
	}
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getWalkTime() {
	return walkTime;
   }
   public void setWalkTime(int walkTime) {
	this.walkTime = walkTime;
   }
   public int getSnackCount() {
	return snackCount;
   }
   public void setSnackCount(int snackCount) {
	this.snackCount = snackCount;
   }
   public int getCuddleCount() {
	return cuddleCount;
   }
   public void setCuddleCount(int cuddleCount) {
	this.cuddleCount = cuddleCount;
   }
   public int getMoodScore() {
	return moodScore;
   }
   public void setMoodScore(int moodScore) {
	this.moodScore = moodScore;
   }
   public String getSnackStars() {
	return snackStars;
   }
   public void setSnackStars(String snackStars) {
	this.snackStars = snackStars;
   }
   public String getTailWag() {
	return tailWag;
   }
   public void setTailWag(String tailWag) {
	this.tailWag = tailWag;
   }
   public String getTodayMessage() {
	return todayMessage;
   }
   public void setTodayMessage(String todayMessage) {
	this.todayMessage = todayMessage;
   } 
   
   public static void info() {
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	   System.out.println("이름 \t 산책시간 \t 간식개수 \t 쓰다듬횟수 \t 행복도 \t 간식보상 \t 꼬리흔들기 \t 오늘의멘트");
	   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
   }
   public int moodScore() {
	   this.moodScore = this.walkTime + (this.snackCount * 10) + (this.cuddleCount * 5);
	   return this.moodScore;
   }
   public String snackStars() {
	   if(this.moodScore>=90) return "★★★★★";
	   else if(this.moodScore>=70) return "★★★★";
	   else if(this.moodScore>=50) return "★★★";
	   else if(this.moodScore>=30) return "★★";
	   else return "★";
   }
   public String tailWag() {
	   if(moodScore>=90) return "흔들흔들흔들";
	   else if(moodScore>=60) return "흔들흔들";
	   else if(moodScore>=40) return "살짝 흔들";
	   else return "꼬리 내림";
   }
   public String todayMessage() {
	   if(this.moodScore>=90) return "오늘은 정말 행복했어요!";
	   else if(this.moodScore>=60) return "좋은 하루였어요!";
	   else if(this.moodScore>=40) return "조금 더 놀아줘요!";
	   else return "\t외로웠어요...";
   }
   public void show() {
	   System.out.println(this.name + "\t" + this.walkTime + "\t\t" + this.snackCount + "\t\t" + this.cuddleCount + "\t\t" + this.moodScore()
			   		+ "\t" + this.snackStars() + "\t\t" + this.tailWag() + "\t" + this.todayMessage());
   }
}