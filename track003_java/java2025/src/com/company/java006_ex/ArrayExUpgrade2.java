package com.company.java006_ex;

public class ArrayExUpgrade2 {
	public static void main(String[] args) {
		int [] temperatures = {22, 24, 25, 23, 21, 20, 19, 21};
		int a = 0; //총 상승 횟수
		int temperature = 22; //기준 온도
		System.out.println("기준 온도: " + temperature + "도");
		
		for (int i=0; i<temperatures.length; i++) {
			if (temperature > temperatures[i]) {
				System.out.print((i+1) + "시간차: ");
				System.out.print("하락");
				System.out.println();
			}
			else if (temperature < temperatures[i]) {
				System.out.print((i+1) + "시간차: ");
				System.out.print("상승");
				System.out.println();
				a++;
			}
			else if (temperature == temperatures[i]) {
				System.out.print((i+1) + "시간차: ");
				System.out.print("유지");
				System.out.println();
			}
		}
		System.out.println("총 상승 횟수: " + a + "회");
	}
}
