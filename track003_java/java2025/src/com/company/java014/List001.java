package com.company.java014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 1. 콜렉션프레임워크 - 동적배열
// 2. 배열의 단점 개선 - 한가지 자료형으로 사이즈 고정

public class List001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1. Array
		String[] arr = new String[3]; // String 자료형 공간3개 [고정]
		arr[0] = "헐크";
		System.out.println(Arrays.toString(arr));
		
		//Step2. 동적배열-List 사용법(1)
		// 부모
		List list = null;
		//			자식
		list = new ArrayList();
		list = new LinkedList();
		list = new Vector();
		
		//Step3. <>
		List<String> list2 = new ArrayList<String>(); //자료형상관없이 내가 넣고 싶은만큼
		list2.add("one"); // Object obj = "one";
		//list2.add(1);	  // Object obj = 1;
		list2.add(new String("two")); //object obj = new String("two");
		//list2.add(3.14);
		//list2.add('A');
		System.out.println(list2);
		
		
		//Step4. add, get, size, remove, contains
		List<String> list3 = new ArrayList<>();
		list3.add("apple");
		list3.add("banana");
		list3.add("coconut");
		
		System.out.println(list3);
		System.out.println(list3.get(2)); // 3번째꺼 가져오기
		System.out.println(list3.size()); // 갯수
		list3.remove(0);
		
		System.out.println(list3);
		System.out.println(list3.contains("coconut")); // 있다(true), 없다(false)
		
		
	}

}
