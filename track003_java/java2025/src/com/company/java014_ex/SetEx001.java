package com.company.java014_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2{
	private int no;
	private String name;
	private int age;
	public UserInfo2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo2 [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class SetEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Set<UserInfo2> set = new HashSet<>();
		   set.add( new UserInfo2(1, "아이언맨" , 50) );
		   set.add( new UserInfo2(2, "헐크" , 40) );
		   set.add( new UserInfo2(3, "캡틴" , 120) );
		   set.add( new UserInfo2(3, "캡틴" , 120) );
		   
		   for ( UserInfo2 a : set) {
			   System.out.println(a);
		   }
		   
		   Iterator<UserInfo2> b = set.iterator();
	       while (b.hasNext()) {
	           UserInfo2 user = b.next();
	           System.out.println(user);
	       }
	        
	       Scanner sc = new Scanner(System.in);
	       System.out.print("사용자 이름 입력 : ");
		   String name = sc.next();
		   for (UserInfo2 a : set) {
			   //for(int i = 0; i<set.size(); i++) {
				   if(a.getName().equals(name)) {
					   System.out.println(a);
					   break;
				   }
			   //}
		   }
		   
		   int age = 0;
		   int count = 0;
		   for (UserInfo2 a : set) {
				 age += a.getAge();
				 count++;
			  
		   }
		   

		   System.out.println("사용자들의 나이 평균은 : " + age/count);
	}

}
