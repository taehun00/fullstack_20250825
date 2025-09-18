package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008_3 {
	public static void lend(String []toybox) {
		
	}
	
	public static void main(String[] args) {
		String[] toybox = {"레고", "주방놀이세트", "물고기낚시놀이", "공룡", "우주선"};
		lend(toybox);
		
		System.out.println("친구가 빌려간 후 toybox > " + Arrays.toString(toybox));
	}
}
