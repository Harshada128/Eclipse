package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		//declaring the integer array
		Integer[] inputNumber = {1, 5, 72}; 
		
		//sorting input number in the list
		List<Integer> numberList = Arrays.asList(inputNumber);
		
		//sort the lint in descending order
		Collections.sort(numberList, Collections.reverseOrder());
		System.out.println(numberList);
		
		//concatenates the sorted numbers to form the output string
		StringBuilder output = new StringBuilder();
		
		for(Integer num : numberList) {
			output.append(num);
			System.out.println(output);
		}
		
		System.out.println(output.toString());
	}

}
