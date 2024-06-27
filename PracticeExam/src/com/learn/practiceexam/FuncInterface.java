package com.learn.practiceexam;

public interface FuncInterface {
	int sum = 0;
			final static int divisor = 3;
	 		//double quotient();
	 		default void product() { System.out.println(3); }
	 		//abstract int remainder(int x, int y);
			static int result() { return 0; }
	 		private int count() { return sum; }

}
