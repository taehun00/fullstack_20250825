package com.company.java014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println("1: " + map);
		System.out.println("2: " + map.get("two"));
		System.out.println("3: " + map.size());
		System.out.println("4: " + map.remove("two"));
		System.out.println("5: " + map.containsKey("three"));
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> one : map.entrySet()) {
			System.out.println( one.getKey() +"/"+ one.getValue());
		}
		
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Entry<String, Integer> temp = iter.next();
			System.out.println( temp.getKey() +"/"+ temp.getValue());
		}
	}

}
