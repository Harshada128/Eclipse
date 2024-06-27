package com.basicjava;

public class MainMethosOverload {

	public static void main(String[] args) {
		System.out.println(1);
		MainMethosOverload mmo = new MainMethosOverload();
		mmo.main(11);
		}
	
	public static void main(int a) {
		System.out.println(2);
	}

}
