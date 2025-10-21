package com.company.java017_ex;

import java.util.Scanner;

class QuestionCount extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		for (int i = 0; i<10; i++) {
			if(i<9) {
				System.out.println((10-i) + ",");
			} else {
				System.out.println((10-i));
			}
			try {
				Thread.sleep(1020);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Question extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사과알파벳을 입력하세요 : ");
		String st = sc.nextLine();
		
		if (st.toLowerCase().equals("apple")) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		}
	}
}
public class ThreadEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread a = new QuestionCount(); a.start();
		Thread b = new Question(); b.start();
		
		System.out.print("카운트 ");
		for (int i = 0; i<10; i++) {
			System.out.print((i+1) + "초에 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
