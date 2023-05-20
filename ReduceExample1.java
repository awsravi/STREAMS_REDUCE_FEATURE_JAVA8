package com.stream.reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceExample1 {

	public static void main(String[] args) {

		// sum of all elements
		List<Integer> intList = Arrays.asList(20, 30, 40, 50);
		int res = intList.stream().reduce((i, j) -> i + j).get();
		System.out.println(res);

		// string add and combain
		List<String> strList = Arrays.asList("ravi", "viswa", "kula");
		String res2 = strList.stream().filter(s -> s.startsWith("r") || s.startsWith("k")).map(s -> s + "it")
				.reduce((s1, s2) -> s1 + s2).get();
		System.out.println(res2);
		
		//find <10 elements and multifly with 10
		
		List<Integer>  l=Arrays.asList(5,8,10,15);
		Integer res3=l.stream().filter(i -> i<10).map(i ->i*10).reduce((i1,i2) -> i1+i2).get();
		System.out.println(res3);
		
		
		
		
		
		
		
	}

}
