package com.company.java015;

import java.util.Arrays;
import java.util.List;

public class Stream001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터 종류에 상관없이 (Stream) 같은 방식으로 처리
		
		Integer[] arr = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		
		Arrays.stream(arr).forEach((t) -> {System.out.print(t);});
		
		System.out.println();
		//void java.util.function.Consumer.accept( T t )
		//list.stream().forEach((t) -> {System.out.print(t);});
		list.stream().forEach(System.out::print);
		
	}
}
