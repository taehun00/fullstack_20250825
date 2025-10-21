package com.company.java017_network;


class Candy{
	String name;
	public void sell() { System.out.println(name + "가 1개 팔렸습니다.");}
}
class MentolSeller extends Candy implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("판매중단됨!");
				break;
			}
			sell();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		
		//방법 1
		/*
		while(true) {
			sell();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("판매 중단 요청됨.");
				break;
			}
		}
		*/
	}
}

public class Thread004_intterrupt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MentolSeller seller = new MentolSeller();
		seller.name="멘틀캔디";
		
		//Thread a = new Thread( new MentolSeller());
		Thread a = new Thread(seller);
		a.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("손님 기다리는 중 ...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(".... 손님이 없어서 판매를 중단합니다.");
		a.interrupt();		// 스레드 중단요청
	}
}
