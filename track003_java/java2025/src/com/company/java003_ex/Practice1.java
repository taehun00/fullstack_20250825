package com.company.java003_ex;
import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		int walk;
		int exec;
		int sleep;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("- 하루 걸음 수: ");
		walk = sc.nextInt();
		System.out.print("- 운동 시간(분 단위): ");
		exec = sc.nextInt();
		System.out.print("- 수면 시간(시간 단위): ");
		sleep = sc.nextInt();
		
		int walkscore = walk/1000;
		int execscore = exec/10;
		int sleepscore = sleep * 2;
		
		
		int total = walkscore + execscore + sleepscore;
		double avg = total / 3.0;
		int level = (int)avg / 2;
		
		System.out.println("::::::::::::::::::::::");
		System.out.println(":   HEALTH TRACKE    :");
		System.out.println("::::::::::::::::::::::");
		System.out.println("걸음수   운동시간   수면시간   총점   평균   건강레벨");
		System.out.printf("%d   %d   %d   %d   %.2f   %d", walk, exec, sleep, total, avg, level);

	}
}
