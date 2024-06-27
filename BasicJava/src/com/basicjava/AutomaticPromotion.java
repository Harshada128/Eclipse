package com.basicjava;

public class AutomaticPromotion {
	
	void show(int a) {
		System.out.println("int method");
		}
	void show(int...a) {
		System.out.println("varargs method");
	}

	public static void main(String[] args) {
		
		AutomaticPromotion auto = new AutomaticPromotion();
		auto.show('a');
	}

}
