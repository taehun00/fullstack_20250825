package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx009 {
	public static void who_are_you(String [][]users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		String inputId = sc.next();
		for(int i=0;i<users.length;i++) {
			if(users[i][0].equals(inputId)) {
				System.out.println(users[i][0] + "는 " + users[i][2] + "사람입니다.");
				break;
			}
		}
	}
	
	public static void who_pass_change(String [][]users) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 > ");
		String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 > ");
		String inputPw = sc.next();
		
		int find = -1;
		
		for(int i=0;i<users.length;i++) {
			
			if(users[i][0].equals(inputId) && users[i][1].equals(inputPw)) {
				find =i;
				System.out.print("변경하실 비밀번호를 입력해주세요 > ");
				String changePw = sc.next();
				users[i][1]=changePw;
				System.out.println("정보확인 : " +  Arrays.toString(users[i]));
				break;
			}
		}
		if(find == -1) {
			System.out.println("유저를 확인해주세요!");
		}
	}

	public static void main(String[] args) {
		String [][]users = {{"aaa", "111", "한국"},
							{"bbb", "222", "호주"},
							{"ccc", "333", "중국"}};
		
		who_are_you(users);
		who_pass_change(users);
	}
}
