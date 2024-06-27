package com.basicjava;

public class Const {
	
	String name;
	int no;
	
	Const(String name, int no)
	{ 
		this.name = name;
		this.no = no;	
	}

	public static void main(String[] args) {
		
		Const c = new Const("sahil", 101);
		System.out.println("Name:" + c.name + " Number:" + c.no);
	}

}
