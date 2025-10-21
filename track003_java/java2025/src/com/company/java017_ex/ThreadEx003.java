package com.company.java017_ex;

import java.util.Scanner;

class Count extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(10-i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("count를 멈춥니다.");
				break;
			}
		}
	}
	
}
//JOptionPane.showInputDiaLog
public class ThreadEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread count = new Count();
		count.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("count stop? y/n");
		char a = sc.next().charAt(0);
		
		if(a == 'y') {
			count.interrupt();
		}
		
		System.out.println("> main end....");
	}

}
