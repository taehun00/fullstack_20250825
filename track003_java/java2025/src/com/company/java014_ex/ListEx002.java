package com.company.java014_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.print("1,2,3 중 입력하세요 > ");
		int num = sc.nextInt();
		
		System.out.println(numbers.get(num-1));
	}

}
