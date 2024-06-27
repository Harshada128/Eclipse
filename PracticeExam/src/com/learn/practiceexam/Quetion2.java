package com.learn.practiceexam;

public class Quetion2 {

	public static void main(String[] args) {
		int x = 0;
		while(x<100) {
			if(x%2 == 1) {
				x++;
			}
			else if(x%2 == 0)
			{
				x+=3;
			}
			
			System.out.println(x);
		}
		
	}

}
