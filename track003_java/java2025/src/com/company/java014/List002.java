package com.company.java014;

import java.util.ArrayList;
import java.util.List;

// List [기차] : 순서 O, 중복 O, (add, get, size, remove, contains)
// Set [주머니] : 순서 X, 중복 X, (add, X get(번호) -> iterator, size, remove, contains)
// Map [사전] : key value (entry), (put, get(key) / iterator, size, remove, contains)

public class List002 {
	public static void main(String[] args) {
		//1. List
		List list1 = new ArrayList();
		list1.add("one");
		list1.add("two");
		System.out.println(list1);
		
		//2. List - <>
		List<String> list2 = new ArrayList<>();
		list2.add("h");
		list2.add("g");
		System.out.println(list2);
		
		//3. List - 활용
		List<UserDto> users = new ArrayList<>();
		users.add( new UserDto("aaa@gmail.com") );
		users.add( new UserDto("bbb@gmail.com") );
		System.out.println(users);
	}
}

class UserDto{
	private static int cnt=0; //static(공용) 유저가 생기는만큼 자동카운트
	private final int no;	  //fianl(수정x)
	private String email;	  //사용자가 입력하는 email
	public UserDto() {
		this.no = cnt++;
	}
	
	public UserDto(int no, String email) {
		super();
		this.no = no;
		this.email = email;
	}
	public UserDto(String email) {
		this();
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDto [no=" + no + ", email=" + email + "]";
	}

	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		UserDto.cnt = cnt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNo() {
		return no;
	}
	
	
}