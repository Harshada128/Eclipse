package com.basicjava;

public class ThisDemo {
	
	ThisDemo m1() {
		return this;
	}

	public static void main(String[] args) {
		ThisDemo t = new ThisDemo();
		//System.out.println(t.m1());
		t.m1();
		}

}
