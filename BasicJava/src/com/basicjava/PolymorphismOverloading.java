package com.basicjava;

public class PolymorphismOverloading {
	
	void show(int a)
	{
		System.out.println(1);
	}
	void show(String a)
	{
		System.out.println("ABC");	
	}

	public static void main(String[] args) {
		PolymorphismOverloading p1 = new PolymorphismOverloading();
		p1.show(10);
		p1.show("Abc");
	}

}
