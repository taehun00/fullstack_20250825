package com.company.java009_ex;
import java.util.Scanner;
class TV{
	String channel;
	int volume;
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("channel 입력 > ");
		channel = sc.next();
		System.out.print("volume 입력 > ");
		volume = sc.nextInt();
	}
	
	void show() {
		System.out.println(channel + " " + volume);
	}
	
}

public class ClassEx004 {
	public static void main(String[] args) {
		TV  t1 = new TV("JDBC" , 8);
		t1.show(); 
		TV  t2 = new TV();
		t2.input();  
		t2.show();
	}
}
