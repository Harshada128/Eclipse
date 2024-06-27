package com.learn.practiceexam;

public interface Red extends Black{
	 default void getColor() {
		System.out.println("Red");
	}
	
}
