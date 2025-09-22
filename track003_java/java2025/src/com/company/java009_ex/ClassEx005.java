package com.company.java009_ex;


class Card{
	int cardNum;
	boolean isMembership;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
	@Override
	public String toString() {
		return "Card[cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	
	
}


public class ClassEx005 {
	public static void main(String[] args) {
		Card  c1= new Card(); 
		System.out.println(c1);  
	}
}
