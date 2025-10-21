package com.company.java017_network;

import java.awt.Toolkit;

//1. 프로세스 - 실행중인 프로그램
//2. 프로세스 - 자원(데이터, 메모리) + Thread(실제작업수행)
//3. 작업수행클래스 만드는 법 - Thread, Runnable
class PigSound extends Thread{ //■ Sound

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//#2. 비프음
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			//toolkit.beep();
			System.out.println("꿀");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class PigCnt extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<5; i++) {
			//toolkit.beep();
			System.out.println((i+1) + "마리 ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Thread002 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread sound = new PigSound(); sound.start();
		Thread count = new PigCnt(); count.start();
		
		//■ View ˙Ꙫ˙
		for(int i=0; i<5; i++) {
			System.out.print("˙Ꙫ˙");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
