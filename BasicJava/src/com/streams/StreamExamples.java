package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(10, 50, 75, 25, 20, 40);
		List<Integer> pass = marks.stream()
								  .filter(i-> i>35)
								  .collect(Collectors.toList());
		System.out.println(pass);
		
		List<Integer> gressmarks = marks.stream()
										.filter(i-> i<35)
										.map(j->j+5)
										.collect(Collectors.toList());
		System.out.println(gressmarks);
	}

}
