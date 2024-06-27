package com.learn.practiceexam;

public class Quetion12 {

	public static void main(String[] args) {
		int x = 0;
		while(x < 100){
			if(x%3 == 0){
				x += 3;
			}
			if(x%2 == 0){
				x += 2;
				System.out.println(x);
				continue;
			}
			x++;
			
			System.out.println(x);
		}

	}

}
