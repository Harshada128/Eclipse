package com.basicjava;

public class InterfaceTest implements InterfaceA, InterfaceB {
	
	public void show() {
		System.out.println("Show Interface A");
	}
	
	public void display() {
		System.out.println("Display Interface B");
	}

	public static void main(String[] args) {
			InterfaceTest It = new InterfaceTest();
			It.show();
			It.display();
	}

}
