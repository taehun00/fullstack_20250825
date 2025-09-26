package com.company.java011;

public class ClassArrEx1 {
	public static void main(String[] args) {
		// 1번째
		Apple[] apples = new Apple[3];
		
	
		apples[0] = new Apple("RED", "iron", 2, 1000);
		
		apples[1] = new Apple("GREEN", "hulk", 1, 1500);
		
		apples[2] = new Apple("GOLD", "captain", 3, 2000);
		
		for(int i=0;i<apples.length;i++) {
			System.out.println(apples[i]);
		}
		
		// 2번째
		Apple[] apples2 = new Apple[] {
			new Apple("RED", "iron", 2, 1000),
			new Apple("GREEN", "hulk", 1, 1500),
			new Apple("GOLD", "captain", 3, 2000),
		};
		
		for(int i=0;i<apples.length;i++) {
			System.out.println(apples2[i]);
		}
		
		
		System.out.println("ver-2 향상된 for");
		
		for(Apple a : apples) {
			System.out.println(a);
		}
	}
}
