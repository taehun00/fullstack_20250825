package com.company.java017_network;

class Animal{
	String name;
}

class Dog extends Animal implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.print("멍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Thread003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread sound = new Thread( new Dog() ); 	sound.start();
		for(int i=0; i<5; i++) {
			System.out.print("◖⚆ᴥ⚆◗");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
