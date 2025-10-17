package com.company.java015;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ages = {17, 21, 26, 45, 18};
		
		//Ex1
		double avg = Arrays.stream(ages)
							.mapToInt(age -> age)
							.average()
							.orElse(0.0);
		System.out.println("평균나이 : " + avg);
		
		//Ex2 짝수만 출력
		//Stream<Integer> a = Arrays.stream(ages);// 스트림민들기
						
		Arrays.stream(ages)
		.filter(t -> t%2==0)// 짝수 필터링 - filter
		.forEach(t->{System.out.print(t);});// 출력 - forEach
		
		List<String> names = Arrays.asList("김수지","이나영","김나영","유재석","강호동");
		System.out.println(names.get(0).startsWith("김"));
		
		//Stream<String> b = names.stream(); // 스트림만들기
		names.stream()
		.filter(t -> t.startsWith("김"))
		.forEach(t->{System.out.print(t);});
		
		System.out.println();
		
		names.stream()
		.sorted()
		.forEach(System.out::print);
		
		System.out.println();
		
		int max = Arrays.stream(ages)
		.mapToInt(age->age) // 객체를 숫자로
		.max()				// 최댓값
		.orElse(-1);		// 못찾으면 -1
		System.out.println(max);
	}

}
